## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/repl-filename

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def repl-filename "<cljs repl>")
```

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:145](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/nashorn.clj#L145)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-filename"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-filename",
 :type "var",
 :source {:code "(def repl-filename \"<cljs repl>\")",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [145]},
 :full-name "cljs.repl.nashorn/repl-filename",
 :full-name-encode "cljs.repl.nashorn_repl-filename",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_repl-filename.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_repl-filename.cljsdoc)
</pre>

