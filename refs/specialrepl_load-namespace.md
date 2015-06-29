## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/load-namespace

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-namespace__ name)<br>
</samp>

---

Only usable from a REPL.

Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once
and only once.

---

Example:

```clj
(load-namespace 'clojure.set)
```

---



Source code:

```clj
(def default-special-fns
  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]
    {'in-ns (fn [_ quoted-ns] (set! comp/*cljs-ns* (second quoted-ns)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))
```

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:134-139](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl.clj#L134-L139)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/load-namespace"]))
```

```clj
{:description "Only usable from a REPL.\n\nLoad a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once\nand only once.",
 :ns "specialrepl",
 :name "load-namespace",
 :signature ["[name]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl_load-namespace",
 :source {:code "(def default-special-fns\n  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]\n    {'in-ns (fn [_ quoted-ns] (set! comp/*cljs-ns* (second quoted-ns)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/clj/cljs/repl.clj",
          :lines [134 139]},
 :examples [{:id "0b1a1d",
             :content "```clj\n(load-namespace 'clojure.set)\n```"}],
 :full-name "specialrepl/load-namespace"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_load-namespace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_load-namespace.cljsdoc)
</pre>

