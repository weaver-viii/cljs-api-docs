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
  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]
    {'in-ns (fn [_ quoted-ns]
              (let [ns-name (second quoted-ns)]
                (when-not (ana/get-namespace ns-name)
                  (swap! env/*compiler* update-in [::ana/namespaces ns-name] {:name ns-name}))
                (set! ana/*cljs-ns* ns-name)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))
```

 <pre>
clojurescript @ r2199
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:162-171](https://github.com/clojure/clojurescript/blob/r2199/src/clj/cljs/repl.clj#L162-L171)</ins>
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
 :source {:code "(def default-special-fns\n  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]\n    {'in-ns (fn [_ quoted-ns]\n              (let [ns-name (second quoted-ns)]\n                (when-not (ana/get-namespace ns-name)\n                  (swap! env/*compiler* update-in [::ana/namespaces ns-name] {:name ns-name}))\n                (set! ana/*cljs-ns* ns-name)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/clj/cljs/repl.clj",
          :lines [162 171]},
 :full-name "cljs.repl/default-special-fns",
 :full-name-encode "cljs.repl_default-special-fns",
 :history [["+" "0.0-993"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_default-special-fns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_default-special-fns.cljsdoc)
</pre>

