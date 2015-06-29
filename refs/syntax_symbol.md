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

```

 <pre>
clojure @ clojure-1.5.1
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L)</ins>
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
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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

