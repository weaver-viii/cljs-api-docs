## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/decorate-specs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__decorate-specs__ specs)<br>
</samp>

---





Source code:

```clj
(defn decorate-specs [specs]
  (if-let [k (some #{:reload :reload-all} specs)]
    (->> specs (remove #{k}) (map #(vary-meta % assoc :reload k)))
    specs))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:538-541](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl.clj#L538-L541)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/decorate-specs"]))
```

```clj
{:ns "cljs.repl",
 :name "decorate-specs",
 :type "function",
 :signature ["[specs]"],
 :source {:code "(defn decorate-specs [specs]\n  (if-let [k (some #{:reload :reload-all} specs)]\n    (->> specs (remove #{k}) (map #(vary-meta % assoc :reload k)))\n    specs))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl.clj",
          :lines [538 541]},
 :full-name "cljs.repl/decorate-specs",
 :full-name-encode "cljs.repl_decorate-specs",
 :history [["+" "0.0-3148"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_decorate-specs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_decorate-specs.cljsdoc)
</pre>

