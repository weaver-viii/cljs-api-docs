## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/desugar-meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__desugar-meta__ f)<br>
</samp>

---





Source code:

```clj
(defn desugar-meta
  [f]
  (cond
   (symbol? f) {:tag f}
   (string? f) {:tag f}
   (keyword? f) {f true}
   :else f))
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:353-359](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/reader.cljs#L353-L359)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/desugar-meta"]))
```

```clj
{:ns "cljs.reader",
 :name "desugar-meta",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn desugar-meta\n  [f]\n  (cond\n   (symbol? f) {:tag f}\n   (string? f) {:tag f}\n   (keyword? f) {f true}\n   :else f))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [353 359]},
 :full-name "cljs.reader/desugar-meta",
 :full-name-encode "cljs.reader_desugar-meta",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_desugar-meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_desugar-meta.cljsdoc)
</pre>

