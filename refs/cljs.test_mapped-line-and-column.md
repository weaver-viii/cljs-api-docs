## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/mapped-line-and-column

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mapped-line-and-column__ filename line column)<br>
</samp>

---





Source code:

```clj
(defn mapped-line-and-column [filename line column]
  (let [default [filename line column]]
    (if-let [source-map (:source-map (get-current-env))]
      ;; source maps are 0 indexed for lines
      (if-let [columns (get-in source-map [filename (dec line)])]
        (vec
          (map
            ;; source maps are 0 indexed for columns
            ;; multiple segments may exist at column
            ;; just take first
            (first
              (if-let [mapping (get columns (dec column))]
                mapping
                (second (first columns))))
            [:source :line :col]))
        default)
      default)))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:356-372](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/test.cljs#L356-L372)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/mapped-line-and-column"]))
```

```clj
{:ns "cljs.test",
 :name "mapped-line-and-column",
 :type "function",
 :signature ["[filename line column]"],
 :source {:code "(defn mapped-line-and-column [filename line column]\n  (let [default [filename line column]]\n    (if-let [source-map (:source-map (get-current-env))]\n      ;; source maps are 0 indexed for lines\n      (if-let [columns (get-in source-map [filename (dec line)])]\n        (vec\n          (map\n            ;; source maps are 0 indexed for columns\n            ;; multiple segments may exist at column\n            ;; just take first\n            (first\n              (if-let [mapping (get columns (dec column))]\n                mapping\n                (second (first columns))))\n            [:source :line :col]))\n        default)\n      default)))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/test.cljs",
          :lines [356 372]},
 :full-name "cljs.test/mapped-line-and-column",
 :full-name-encode "cljs.test_mapped-line-and-column",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_mapped-line-and-column.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_mapped-line-and-column.cljsdoc)
</pre>

