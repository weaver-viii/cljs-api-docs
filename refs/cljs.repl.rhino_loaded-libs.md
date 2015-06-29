## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/loaded-libs

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def loaded-libs (atom #{}))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:19](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl/rhino.clj#L19)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/loaded-libs"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "loaded-libs",
 :type "var",
 :source {:code "(def loaded-libs (atom #{}))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [19]},
 :full-name "cljs.repl.rhino/loaded-libs",
 :full-name-encode "cljs.repl.rhino_loaded-libs",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_loaded-libs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_loaded-libs.cljsdoc)
</pre>

