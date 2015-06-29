## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/load-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-ns__ engine ns)<br>
</samp>

---





Source code:

```clj
(defn load-ns [engine ns]
      (eval-str engine
        (format "goog.require(\"%s\");" (comp/munge (first ns)))))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[nashorn.clj:95-97](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/nashorn.clj#L95-L97)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/load-ns"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "load-ns",
 :type "function",
 :signature ["[engine ns]"],
 :source {:code "(defn load-ns [engine ns]\n      (eval-str engine\n        (format \"goog.require(\\\"%s\\\");\" (comp/munge (first ns)))))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl/nashorn.clj",
          :lines [95 97]},
 :full-name "cljs.repl.nashorn/load-ns",
 :full-name-encode "cljs.repl.nashorn_load-ns",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_load-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_load-ns.cljsdoc)
</pre>

