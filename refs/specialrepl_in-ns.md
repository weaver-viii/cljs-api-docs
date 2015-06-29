## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/in-ns

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/in-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/in-ns)
</td>
</tr>
</table>

 <samp>
(__in-ns__ name)<br>
</samp>

---

Only usable from a REPL.

Changes to the namespace `name`, creating it if needed.

Sets `*cljs-ns*` to the namespace `name`.

---

Example:

```clj
(in-ns 'foo.core)
```

---



Source code:

```clj
(def default-special-fns
  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]
    {'in-ns (fn [_ quoted-ns]
              (let [ns-name (second quoted-ns)]
                (when-not (ana/get-namespace ns-name)
                  (ana/set-namespace ns-name {:name ns-name}))
                (set! ana/*cljs-ns* ns-name)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:141-150](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl.clj#L141-L150)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/in-ns"]))
```

```clj
{:description "Only usable from a REPL.\n\nChanges to the namespace `name`, creating it if needed.\n\nSets `*cljs-ns*` to the namespace `name`.",
 :ns "specialrepl",
 :name "in-ns",
 :signature ["[name]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl_in-ns",
 :source {:code "(def default-special-fns\n  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]\n    {'in-ns (fn [_ quoted-ns]\n              (let [ns-name (second quoted-ns)]\n                (when-not (ana/get-namespace ns-name)\n                  (ana/set-namespace ns-name {:name ns-name}))\n                (set! ana/*cljs-ns* ns-name)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl.clj",
          :lines [141 150]},
 :examples [{:id "e81eb3", :content "```clj\n(in-ns 'foo.core)\n```"}],
 :full-name "specialrepl/in-ns",
 :clj-symbol "clojure.core/in-ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_in-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_in-ns.cljsdoc)
</pre>

