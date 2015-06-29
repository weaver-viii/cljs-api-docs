## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/mapped-line-and-column

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mapped-line-and-column__ source-map line column)<br>
</samp>

---




Source docstring:

```
Given a cljs.source-map source map data structure map a generated line
and column back to the original line and column.
```

Source code:

```clj
(defn mapped-line-and-column
  [source-map line column]
  (let [default [line column]]
    ;; source maps are 0 indexed for lines
    (if-let [columns (get source-map (dec line))]
      (vec
        (map inc
          (map
            ;; source maps are 0 indexed for columns
            ;; multiple segments may exist at column
            ;; the last segment seems most accurate
            (last
              (if-let [mapping (get columns (dec column))]
                mapping
                (second (first columns))))
            [:line :col])))
      default)))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:223-241](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L223-L241)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/mapped-line-and-column"]))
```

```clj
{:ns "cljs.repl",
 :name "mapped-line-and-column",
 :signature ["[source-map line column]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl_mapped-line-and-column",
 :source {:code "(defn mapped-line-and-column\n  [source-map line column]\n  (let [default [line column]]\n    ;; source maps are 0 indexed for lines\n    (if-let [columns (get source-map (dec line))]\n      (vec\n        (map inc\n          (map\n            ;; source maps are 0 indexed for columns\n            ;; multiple segments may exist at column\n            ;; the last segment seems most accurate\n            (last\n              (if-let [mapping (get columns (dec column))]\n                mapping\n                (second (first columns))))\n            [:line :col])))\n      default)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl.clj",
          :lines [223 241]},
 :full-name "cljs.repl/mapped-line-and-column",
 :docstring "Given a cljs.source-map source map data structure map a generated line\nand column back to the original line and column."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_mapped-line-and-column.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_mapped-line-and-column.cljsdoc)
</pre>

