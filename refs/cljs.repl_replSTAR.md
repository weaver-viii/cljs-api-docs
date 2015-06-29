## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl\*__ repl-env {:keys \[init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap\], :or {caught repl-caught, eval eval-cljs, print-no-newline print, flush flush, read repl-read, init (fn\* \[\] ()), print println, source-map-inline true, prompt repl-prompt, reader (fn\* \[\] (readers/source-logging-push-back-reader (PushbackReader. (io/reader \*in\*)) 1 "NO_SOURCE_FILE")), need-prompt (fn\* \[\] (if (readers/indexing-reader? \*in\*) (== (readers/get-column-number \*in\*) 1) (identity true)))}, :as opts})<br>
</samp>

---





Source code:

```clj
(defn repl*
  [repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap]
             :or {init #()
                  need-prompt #(if (readers/indexing-reader? *in*)
                                 (== (readers/get-column-number *in*) 1)
                                 (identity true))
                  prompt repl-prompt
                  flush flush
                  read repl-read
                  eval eval-cljs
                  print println
                  caught repl-caught
                  reader #(readers/source-logging-push-back-reader
                           (PushbackReader. (io/reader *in*))
                           1 "NO_SOURCE_FILE")
                  print-no-newline print
                  source-map-inline true}
             :as opts}]
  (let [{:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts
         :or   {warn-on-undeclared true}}
        (merge
          {:cache-analysis true :source-map true}
          (cljsc/add-implicit-options
            (merge-with (fn [a b] (if (nil? b) a b))
              (-repl-options repl-env)
              opts
              {:init init
               :need-prompt prompt
               :flush flush
               :read read
               :print print
               :caught caught
               :reader reader
               :print-no-newline print-no-newline
               :source-map-inline source-map-inline})))]
    (env/with-compiler-env
     (or (::env/compiler repl-env) (env/default-compiler-env opts))
     (binding [ana/*cljs-ns* 'cljs.user
               *cljs-verbose* repl-verbose
               ana/*cljs-warnings*
               (assoc ana/*cljs-warnings*
                 :unprovided warn-on-undeclared
                 :undeclared-var warn-on-undeclared
                 :undeclared-ns warn-on-undeclared
                 :undeclared-ns-form warn-on-undeclared)
               ana/*cljs-static-fns* static-fns]
       ;; TODO: the follow should become dead code when the REPL is
       ;; sufficiently enhanced to understand :cache-analysis - David
       (let [env {:context :expr :locals {}}
             special-fns (merge default-special-fns special-fns)
             is-special-fn? (set (keys special-fns))
             request-prompt (Object.)
             request-exit (Object.)
             opts (try
                    (if-let [merge-opts (:merge-opts (-setup repl-env opts))]
                      (merge opts merge-opts)
                      opts)
                    (catch Throwable e
                      (caught e repl-env opts)
                      opts))
             read-eval-print
             (fn []
               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)
                                     reader/*data-readers* tags/*cljs-data-readers*
                                     reader/*alias-map*
                                     (apply merge
                                       ((juxt :requires :require-macros)
                                         (ana/get-namespace ana/*cljs-ns*)))]
                             (read request-prompt request-exit))]
                 (or ({request-exit request-exit
                       :cljs/quit request-exit
                       request-prompt request-prompt} input)
                   (if (and (seq? input) (is-special-fn? (first input)))
                     (do
                       ((get special-fns (first input)) repl-env env input opts)
                       (print nil))
                     (let [value (eval repl-env env input opts)]
                       (print value))))))]
         (comp/with-core-cljs opts
           (fn []
             (binding [*repl-opts* opts]
               (try
                 (init)
                 (when analyze-path
                   (analyze-source analyze-path opts))
                 (evaluate-form repl-env env "<cljs repl>"
                   (with-meta
                     '(ns cljs.user
                        (:require [cljs.repl :refer-macros [source doc find-doc apropos dir pst]]))
                     {:line 1 :column 1})
                   identity opts)
                 (catch Throwable e
                   (caught e repl-env opts)))
               (when-let [src (:watch opts)]
                 (future
                   (let [log-file (io/file (util/output-directory opts) "watch.log")]
                     (print "Watch compilation log available at:" (str log-file))
                     (flush)
                     (try
                       (let [log-out (FileWriter. log-file)]
                         (binding [*err* log-out
                                   *out* log-out]
                           (cljsc/watch src (dissoc opts :watch))))
                       (catch Throwable e
                         (caught e repl-env opts))))))
               ;; let any setup async messages flush
               (Thread/sleep 50)
               (binding [*in* (if (true? (:source-map-inline opts))
                                *in*
                                (reader))]
                 (print "To quit, type:" :cljs/quit)
                 (prompt)
                 (flush)
                 (loop []
                   (when-not
                     (try
                       (identical? (read-eval-print) request-exit)
                       (catch Throwable e
                         (caught e repl-env opts)
                         nil))
                     (when (need-prompt)
                       (prompt)
                       (flush))
                     (recur))))))))
         (-tear-down repl-env)))))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:646-770](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L646-L770)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl*"]))
```

```clj
{:ns "cljs.repl",
 :name "repl*",
 :type "function",
 :signature ["[repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap], :or {caught repl-caught, eval eval-cljs, print-no-newline print, flush flush, read repl-read, init (fn* [] ()), print println, source-map-inline true, prompt repl-prompt, reader (fn* [] (readers/source-logging-push-back-reader (PushbackReader. (io/reader *in*)) 1 \"NO_SOURCE_FILE\")), need-prompt (fn* [] (if (readers/indexing-reader? *in*) (== (readers/get-column-number *in*) 1) (identity true)))}, :as opts}]"],
 :source {:code "(defn repl*\n  [repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap]\n             :or {init #()\n                  need-prompt #(if (readers/indexing-reader? *in*)\n                                 (== (readers/get-column-number *in*) 1)\n                                 (identity true))\n                  prompt repl-prompt\n                  flush flush\n                  read repl-read\n                  eval eval-cljs\n                  print println\n                  caught repl-caught\n                  reader #(readers/source-logging-push-back-reader\n                           (PushbackReader. (io/reader *in*))\n                           1 \"NO_SOURCE_FILE\")\n                  print-no-newline print\n                  source-map-inline true}\n             :as opts}]\n  (let [{:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts\n         :or   {warn-on-undeclared true}}\n        (merge\n          {:cache-analysis true :source-map true}\n          (cljsc/add-implicit-options\n            (merge-with (fn [a b] (if (nil? b) a b))\n              (-repl-options repl-env)\n              opts\n              {:init init\n               :need-prompt prompt\n               :flush flush\n               :read read\n               :print print\n               :caught caught\n               :reader reader\n               :print-no-newline print-no-newline\n               :source-map-inline source-map-inline})))]\n    (env/with-compiler-env\n     (or (::env/compiler repl-env) (env/default-compiler-env opts))\n     (binding [ana/*cljs-ns* 'cljs.user\n               *cljs-verbose* repl-verbose\n               ana/*cljs-warnings*\n               (assoc ana/*cljs-warnings*\n                 :unprovided warn-on-undeclared\n                 :undeclared-var warn-on-undeclared\n                 :undeclared-ns warn-on-undeclared\n                 :undeclared-ns-form warn-on-undeclared)\n               ana/*cljs-static-fns* static-fns]\n       ;; TODO: the follow should become dead code when the REPL is\n       ;; sufficiently enhanced to understand :cache-analysis - David\n       (let [env {:context :expr :locals {}}\n             special-fns (merge default-special-fns special-fns)\n             is-special-fn? (set (keys special-fns))\n             request-prompt (Object.)\n             request-exit (Object.)\n             opts (try\n                    (if-let [merge-opts (:merge-opts (-setup repl-env opts))]\n                      (merge opts merge-opts)\n                      opts)\n                    (catch Throwable e\n                      (caught e repl-env opts)\n                      opts))\n             read-eval-print\n             (fn []\n               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)\n                                     reader/*data-readers* tags/*cljs-data-readers*\n                                     reader/*alias-map*\n                                     (apply merge\n                                       ((juxt :requires :require-macros)\n                                         (ana/get-namespace ana/*cljs-ns*)))]\n                             (read request-prompt request-exit))]\n                 (or ({request-exit request-exit\n                       :cljs/quit request-exit\n                       request-prompt request-prompt} input)\n                   (if (and (seq? input) (is-special-fn? (first input)))\n                     (do\n                       ((get special-fns (first input)) repl-env env input opts)\n                       (print nil))\n                     (let [value (eval repl-env env input opts)]\n                       (print value))))))]\n         (comp/with-core-cljs opts\n           (fn []\n             (binding [*repl-opts* opts]\n               (try\n                 (init)\n                 (when analyze-path\n                   (analyze-source analyze-path opts))\n                 (evaluate-form repl-env env \"<cljs repl>\"\n                   (with-meta\n                     '(ns cljs.user\n                        (:require [cljs.repl :refer-macros [source doc find-doc apropos dir pst]]))\n                     {:line 1 :column 1})\n                   identity opts)\n                 (catch Throwable e\n                   (caught e repl-env opts)))\n               (when-let [src (:watch opts)]\n                 (future\n                   (let [log-file (io/file (util/output-directory opts) \"watch.log\")]\n                     (print \"Watch compilation log available at:\" (str log-file))\n                     (flush)\n                     (try\n                       (let [log-out (FileWriter. log-file)]\n                         (binding [*err* log-out\n                                   *out* log-out]\n                           (cljsc/watch src (dissoc opts :watch))))\n                       (catch Throwable e\n                         (caught e repl-env opts))))))\n               ;; let any setup async messages flush\n               (Thread/sleep 50)\n               (binding [*in* (if (true? (:source-map-inline opts))\n                                *in*\n                                (reader))]\n                 (print \"To quit, type:\" :cljs/quit)\n                 (prompt)\n                 (flush)\n                 (loop []\n                   (when-not\n                     (try\n                       (identical? (read-eval-print) request-exit)\n                       (catch Throwable e\n                         (caught e repl-env opts)\n                         nil))\n                     (when (need-prompt)\n                       (prompt)\n                       (flush))\n                     (recur))))))))\n         (-tear-down repl-env)))))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl.clj",
          :lines [646 770]},
 :full-name "cljs.repl/repl*",
 :full-name-encode "cljs.repl_replSTAR",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_replSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_replSTAR.cljsdoc)
</pre>

