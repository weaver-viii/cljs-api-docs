## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/symbol

 <table border="1">
<tr>
<td><samp> </samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#symbols)
</td>
</tr>
</table>


Signifies a symbol.  When evaluated, its result will be the value that the symbol
is bound to.

Some naming rules:

- must not begin with a number
- can contain special characters `*`, `+`, `!`, `-`, `_`, `?`
- symbols starting or ending with a decimal are reserved for interop purposes

Symbols can have an optional namespace. For example, `foo/bar` evaluates to the
value of the `bar` symbol of the `foo` namespace.

To access symbols in the global JavaScript context, use the namespace `js`.
For example, use `js/document` to get the global `document` JavaScript object.

---

Example:

The following has two symbols, `def` and `a`:

```clj
(def a 1)
```

The evaluation of the symbols is controlled by the evaluation of the list `(def
a 1)`.  `def` evaluates to a special form, which suppresses the evaluation of
`a` since it is just being used as a name for the bound value `1`.

When a symbol is by itself, it will evaluated to 1:

```clj
a
;;=> 1
```

To signify an unevaluated symbol, precede it with a quote:

```clj
'a
;;=> a
```

---

See Also:

[`cljs.core/symbol`](cljs.core_symbol.md)<br>
[`cljs.core/symbol?`](cljs.core_symbolQMARK.md)<br>

---


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
tools.reader @ tools.reader-0.9.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:294-320](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.0/src/main/clojure/clojure/tools/reader.clj#L294-L320)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/symbol"]))
```

```clj
{:description "Signifies a symbol.  When evaluated, its result will be the value that the symbol\nis bound to.\n\nSome naming rules:\n\n- must not begin with a number\n- can contain special characters `*`, `+`, `!`, `-`, `_`, `?`\n- symbols starting or ending with a decimal are reserved for interop purposes\n\nSymbols can have an optional namespace. For example, `foo/bar` evaluates to the\nvalue of the `bar` symbol of the `foo` namespace.\n\nTo access symbols in the global JavaScript context, use the namespace `js`.\nFor example, use `js/document` to get the global `document` JavaScript object.",
 :ns "syntax",
 :name "symbol",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/symbol" "cljs.core/symbol?"],
 :full-name-encode "syntax_symbol",
 :source {:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (starting-line-col-info rdr)]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  (merge\n                   (when-let [file (get-file-name rdr)]\n                     {:file file})\n                   (let [[end-line end-column] (ending-line-col-info rdr)]\n                     {:line line\n                      :column column\n                      :end-line end-line\n                      :end-column end-column})))))\n            (reader-error rdr \"Invalid token: \" token))))))",
          :repo "tools.reader",
          :tag "tools.reader-0.9.0",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [294 320]},
 :syntax-form " ",
 :examples [{:id "cd60a5",
             :content "The following has two symbols, `def` and `a`:\n\n```clj\n(def a 1)\n```\n\nThe evaluation of the symbols is controlled by the evaluation of the list `(def\na 1)`.  `def` evaluates to a special form, which suppresses the evaluation of\n`a` since it is just being used as a name for the bound value `1`.\n\nWhen a symbol is by itself, it will evaluated to 1:\n\n```clj\na\n;;=> 1\n```\n\nTo signify an unevaluated symbol, precede it with a quote:\n\n```clj\n'a\n;;=> a\n```"}],
 :edn-doc "https://github.com/edn-format/edn#symbols",
 :full-name "syntax/symbol",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_symbol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_symbol.cljsdoc)
</pre>

