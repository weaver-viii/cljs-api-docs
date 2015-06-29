## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/load-file

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/load-file</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/load-file)
</td>
</tr>
</table>

 <samp>
(__load-file__ filename)<br>
</samp>

---

Only usable from a REPL.

Load file at `filename`, then compiles and evaluates its code.

---

Example:

```clj
(load-file "path/to/foo.cljs")
```

---


Source docstring:

```
Sequentially read and evaluate the set of forms contained in the file.
```

Source code:

```clj
(def default-special-fns
  (let [load-file-fn
        (fn self
          ([repl-env env form]
            (self repl-env env form nil))
          ([repl-env env [_ file :as form] opts]
            (load-file repl-env file opts)))]
    {'in-ns
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ [quote ns-name] :as form] _]
         ;; guard against craziness like '5 which wreaks havoc
        (when-not (and (= quote 'quote) (symbol? ns-name))
          (throw (IllegalArgumentException. "Argument to in-ns must be a symbol.")))
        (when-not (ana/get-namespace ns-name)
          (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
          (-evaluate repl-env "<cljs repl>" 1
            (str "goog.provide('" (comp/munge ns-name) "');")))
        (set! ana/*cljs-ns* ns-name)))
     'require
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (let [is-self-require? (self-require? specs)
              [target-ns restore-ns]
              (if-not is-self-require?
                [ana/*cljs-ns* nil]
                ['cljs.user ana/*cljs-ns*])]
          (evaluate-form repl-env env "<cljs repl>"
            (with-meta
              `(~'ns ~target-ns
                 (:require
                   ~@(map
                       (fn [quoted-spec-or-kw]
                         (if (keyword? quoted-spec-or-kw)
                           quoted-spec-or-kw
                           (second quoted-spec-or-kw)))
                       specs)))
              {:merge true :line 1 :column 1})
            identity opts)
          (when is-self-require?
            (set! ana/*cljs-ns* restore-ns)))))
     'import
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (evaluate-form repl-env env "<cljs repl>"
          (with-meta
            `(~'ns ~ana/*cljs-ns*
               (:import
                 ~@(map
                     (fn [quoted-spec-or-kw]
                       (if (keyword? quoted-spec-or-kw)
                         quoted-spec-or-kw
                         (second quoted-spec-or-kw)))
                     specs)))
            {:merge true :line 1 :column 1})
          identity opts)))
     'require-macros
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (evaluate-form repl-env env "<cljs repl>"
          (with-meta
            `(~'ns ~ana/*cljs-ns*
               (:require-macros
                 ~@(map
                     (fn [quoted-spec-or-kw]
                       (if (keyword? quoted-spec-or-kw)
                         quoted-spec-or-kw
                         (second quoted-spec-or-kw)))
                     specs)))
            {:merge true :line 1 :column 1})
          identity opts)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace
     (fn self
       ([repl-env env form]
        (self env repl-env form nil))
       ([repl-env env [_ ns :as form] opts]
        (load-namespace repl-env ns opts)))}))
```

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:529-614](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl.clj#L529-L614)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/load-file"]))
```

```clj
{:description "Only usable from a REPL.\n\nLoad file at `filename`, then compiles and evaluates its code.",
 :ns "specialrepl",
 :name "load-file",
 :signature ["[filename]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl_load-file",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))]\n    {'in-ns\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ [quote ns-name] :as form] _]\n         ;; guard against craziness like '5 which wreaks havoc\n        (when-not (and (= quote 'quote) (symbol? ns-name))\n          (throw (IllegalArgumentException. \"Argument to in-ns must be a symbol.\")))\n        (when-not (ana/get-namespace ns-name)\n          (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n          (-evaluate repl-env \"<cljs repl>\" 1\n            (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n        (set! ana/*cljs-ns* ns-name)))\n     'require\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (let [is-self-require? (self-require? specs)\n              [target-ns restore-ns]\n              (if-not is-self-require?\n                [ana/*cljs-ns* nil]\n                ['cljs.user ana/*cljs-ns*])]\n          (evaluate-form repl-env env \"<cljs repl>\"\n            (with-meta\n              `(~'ns ~target-ns\n                 (:require\n                   ~@(map\n                       (fn [quoted-spec-or-kw]\n                         (if (keyword? quoted-spec-or-kw)\n                           quoted-spec-or-kw\n                           (second quoted-spec-or-kw)))\n                       specs)))\n              {:merge true :line 1 :column 1})\n            identity opts)\n          (when is-self-require?\n            (set! ana/*cljs-ns* restore-ns)))))\n     'import\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (evaluate-form repl-env env \"<cljs repl>\"\n          (with-meta\n            `(~'ns ~ana/*cljs-ns*\n               (:import\n                 ~@(map\n                     (fn [quoted-spec-or-kw]\n                       (if (keyword? quoted-spec-or-kw)\n                         quoted-spec-or-kw\n                         (second quoted-spec-or-kw)))\n                     specs)))\n            {:merge true :line 1 :column 1})\n          identity opts)))\n     'require-macros\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (evaluate-form repl-env env \"<cljs repl>\"\n          (with-meta\n            `(~'ns ~ana/*cljs-ns*\n               (:require-macros\n                 ~@(map\n                     (fn [quoted-spec-or-kw]\n                       (if (keyword? quoted-spec-or-kw)\n                         quoted-spec-or-kw\n                         (second quoted-spec-or-kw)))\n                     specs)))\n            {:merge true :line 1 :column 1})\n          identity opts)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace\n     (fn self\n       ([repl-env env form]\n        (self env repl-env form nil))\n       ([repl-env env [_ ns :as form] opts]\n        (load-namespace repl-env ns opts)))}))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl.clj",
          :lines [529 614]},
 :examples [{:id "0903c5",
             :content "```clj\n(load-file \"path/to/foo.cljs\")\n```"}],
 :full-name "specialrepl/load-file",
 :clj-symbol "clojure.core/load-file",
 :docstring "Sequentially read and evaluate the set of forms contained in the file."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_load-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_load-file.cljsdoc)
</pre>

