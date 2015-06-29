## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/boolean

 <table border="1">
<tr>
<td><samp>true</samp></td><td><samp>false</samp></td>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#booleans)
</td>
</tr>
</table>


`true` or `false`

---

Example:

```clj
true
;;=> true

false
;;=> false
```

---

See Also:

[`cljs.core/boolean`](cljs.core_boolean.md)<br>
[`special/if`](special_if.md)<br>
[`cljs.core/if-not`](cljs.core_if-not.md)<br>
[`cljs.core/not`](cljs.core_not.md)<br>
[`cljs.core/cond`](cljs.core_cond.md)<br>

---


Source code:

```clj
(defn- read-symbol
  [rdr initch]
  (let [[line column] (when (indexing-reader? rdr)
                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])]
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
                  {:line line :column column})))
            (reader-error rdr "Invalid token: " token))))))
```

 <pre>
tools.reader @ tools.reader-0.7.9
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:247-267](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.9/src/main/clojure/clojure/tools/reader.clj#L247-L267)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/boolean"]))
```

```clj
{:description "`true` or `false`",
 :ns "syntax",
 :name "boolean",
 :history [["+" "0.0-927"]],
 :type "special symbol",
 :related ["cljs.core/boolean"
           "special/if"
           "cljs.core/if-not"
           "cljs.core/not"
           "cljs.core/cond"],
 :full-name-encode "syntax_boolean",
 :source {:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (when (indexing-reader? rdr)\n                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  {:line line :column column})))\n            (reader-error rdr \"Invalid token: \" token))))))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.9",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [247 267]},
 :syntax-form ["true" "false"],
 :examples [{:id "1afc59",
             :content "```clj\ntrue\n;;=> true\n\nfalse\n;;=> false\n```"}],
 :edn-doc "https://github.com/edn-format/edn#booleans",
 :full-name "syntax/boolean",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_boolean.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_boolean.cljsdoc)
</pre>

