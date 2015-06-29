## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/quote

 <table border="1">
<tr>
<td><samp>'</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Prevent the evaluation of the following form.

`'foo` = `(quote foo)`

---

Example:

```clj
'foo
;;=> foo

'(a b c)
;;=> (a b c)

'[a b c]
;;=> [a b c]

'(a b (c d))
;;=> (a b (c d))
```

---

See Also:

[`special/quote`](special_quote.md)<br>

---


Source code:

```clj

```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/quote"]))
```

```clj
{:description "Prevent the evaluation of the following form.\n\n`'foo` = `(quote foo)`",
 :ns "syntax",
 :name "quote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["special/quote"],
 :full-name-encode "syntax_quote",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "'",
 :examples [{:id "0d2c26",
             :content "```clj\n'foo\n;;=> foo\n\n'(a b c)\n;;=> (a b c)\n\n'[a b c]\n;;=> [a b c]\n\n'(a b (c d))\n;;=> (a b (c d))\n```"}],
 :full-name "syntax/quote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_quote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_quote.cljsdoc)
</pre>

