## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/NaN

 <table border="1">
<tr>
<td><samp>NaN</samp></td>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1853"><img valign="middle" alt="[+] 0.0-1853" src="https://img.shields.io/badge/+-0.0--1853-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defn- read-symbol
  [rdr initch]
  (let [[line column] (starting-line-col-info rdr)]
    (when-let [token (read-token rdr initch)]
      (case token

        ;; special symbols
        "nil" nil
        "true" true
        "false" false
        "/" '/
        "NaN" Double/NaN
        "-Infinity" Double/NEGATIVE_INFINITY
        ("Infinity" "+Infinity") Double/POSITIVE_INFINITY

        (or (when-let [p (parse-symbol token)]
              (with-meta (symbol (p 0) (p 1))
                (when line
                  (merge
                   (when-let [file (get-file-name rdr)]
                     {:file file})
                   (let [[end-line end-column] (ending-line-col-info rdr)]
                     {:line line
                      :column column
                      :end-line end-line
                      :end-column end-column})))))
            (reader-error rdr "Invalid token: " token))))))
```

 <pre>
tools.reader @ tools.reader-0.9.1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:292-318](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.1/src/main/clojure/clojure/tools/reader.clj#L292-L318)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/NaN"]))
```

```clj
{:ns "syntax",
 :name "NaN",
 :type "special symbol",
 :full-name-encode "syntax_NaN",
 :source {:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (starting-line-col-info rdr)]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  (merge\n                   (when-let [file (get-file-name rdr)]\n                     {:file file})\n                   (let [[end-line end-column] (ending-line-col-info rdr)]\n                     {:line line\n                      :column column\n                      :end-line end-line\n                      :end-column end-column})))))\n            (reader-error rdr \"Invalid token: \" token))))))",
          :repo "tools.reader",
          :tag "tools.reader-0.9.1",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [292 318]},
 :syntax-form "NaN",
 :full-name "syntax/NaN",
 :history [["+" "0.0-1853"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_NaN.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_NaN.cljsdoc)
</pre>

