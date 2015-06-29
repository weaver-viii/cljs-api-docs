## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/unquote-splicing

 <table border="1">
<tr>
<td><samp>~@</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Intended for use inside a syntax-quote.

Forces evaluation of the following form and expands its children into the
parent form.

---

Example:

```clj
(def foo '[a b c])
`(~@foo)
;;=> (a b c)
```

---

See Also:

[`syntax/syntax-quote`](syntax_syntax-quote.md)<br>
[`syntax/unquote`](syntax_unquote.md)<br>

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
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:559-578](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L559-L578)</ins>
</pre>


---

```clj
(defn- read-unquote
  [rdr comma]
  (if-let [ch (peek-char rdr)]
    (if (identical? \@ ch)
      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \@)
      ((wrapping-reader 'clojure.core/unquote) rdr \~))))
```

 <pre>
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:425-430](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L425-L430)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unquote-splicing"]))
```

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a syntax-quote.\n\nForces evaluation of the following form and expands its children into the\nparent form.",
 :ns "syntax",
 :name "unquote-splicing",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/syntax-quote" "syntax/unquote"],
 :full-name-encode "syntax_unquote-splicing",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.10",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [559 578]},
 :extra-sources [{:code "(defn- read-unquote\n  [rdr comma]\n  (if-let [ch (peek-char rdr)]\n    (if (identical? \\@ ch)\n      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \\@)\n      ((wrapping-reader 'clojure.core/unquote) rdr \\~))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [425 430]}],
 :syntax-form "~@",
 :examples [{:id "e6f73d",
             :content "```clj\n(def foo '[a b c])\n`(~@foo)\n;;=> (a b c)\n```"}],
 :full-name "syntax/unquote-splicing",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_unquote-splicing.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_unquote-splicing.cljsdoc)
</pre>

