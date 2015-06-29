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
(defn- macros [ch]
  (case ch
    \" read-string*
    \: read-keyword
    \; read-comment
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'clojure.core/deref)
    \^ read-meta
    \` read-syntax-quote ;;(wrapping-reader 'syntax-quote)
    \~ read-unquote
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char*
    \% read-arg
    \# read-dispatch
    nil))
```

 <pre>
tools.reader @ tools.reader-0.7.5
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:544-563](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L544-L563)</ins>
</pre>


---

```clj
(defn- wrapping-reader
  [sym]
  (fn [rdr _]
    (list sym (read rdr true nil true))))
```

 <pre>
tools.reader @ tools.reader-0.7.5
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:285-288](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L285-L288)</ins>
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
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.5",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [544 563]},
 :extra-sources [{:code "(defn- wrapping-reader\n  [sym]\n  (fn [rdr _]\n    (list sym (read rdr true nil true))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.5",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [285 288]}],
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

