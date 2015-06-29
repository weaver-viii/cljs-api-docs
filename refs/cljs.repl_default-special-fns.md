## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/default-special-fns

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-993"><img valign="middle" alt="[+] 0.0-993" src="https://img.shields.io/badge/+-0.0--993-lightgrey.svg"></a> </td>
</tr>
</table>






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
         (when-not (ana/get-namespace ns-name)
           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
           (-evaluate repl-env "<cljs repl>" 1
             (str "goog.provide('" (comp/munge ns-name) "');")))
         (set! ana/*cljs-ns* ns-name)))
     'require
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ [quote spec]] opts]
         (let [original-specs (ana-api/ns-specs ana/*cljs-ns*)
               new-specs (update-require-spec original-specs
                           (if (symbol? spec) [spec] spec))]
           (evaluate-form repl-env env "<cljs repl>"
             (with-meta
               `(~'ns ~ana/*cljs-ns*
                  ~@new-specs)
               {:line 1 :column 1})
             identity opts))))
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
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:240-278](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl.clj#L240-L278)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/default-special-fns"]))
```

```clj
{:ns "cljs.repl",
 :name "default-special-fns",
 :type "var",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))]\n    {'in-ns\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ [quote ns-name] :as form] _]\n         (when-not (ana/get-namespace ns-name)\n           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n           (-evaluate repl-env \"<cljs repl>\" 1\n             (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n         (set! ana/*cljs-ns* ns-name)))\n     'require\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ [quote spec]] opts]\n         (let [original-specs (ana-api/ns-specs ana/*cljs-ns*)\n               new-specs (update-require-spec original-specs\n                           (if (symbol? spec) [spec] spec))]\n           (evaluate-form repl-env env \"<cljs repl>\"\n             (with-meta\n               `(~'ns ~ana/*cljs-ns*\n                  ~@new-specs)\n               {:line 1 :column 1})\n             identity opts))))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace\n     (fn self\n       ([repl-env env form]\n         (self env repl-env form nil))\n       ([repl-env env [_ ns :as form] opts]\n         (load-namespace repl-env ns opts)))}))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/repl.clj",
          :lines [240 278]},
 :full-name "cljs.repl/default-special-fns",
 :full-name-encode "cljs.repl_default-special-fns",
 :history [["+" "0.0-993"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_default-special-fns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_default-special-fns.cljsdoc)
</pre>

