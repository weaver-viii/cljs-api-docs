## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/unquote

 <table border="1">
<tr>
<td><samp>~</samp></td>
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

Forces evaluation of the following form.

---

Example:

```clj
(def foo 1)
`~foo
;;=> 1

`(def foo ~foo)
;;=> (def cljs.user/foo 1)
```

---

See Also:

[`syntax/syntax-quote`](syntax_syntax-quote.md)<br>
[`syntax/unquote-splicing`](syntax_unquote-splicing.md)<br>

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
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:732-751](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L732-L751)</ins>
</pre>


---

```clj
(defn- read-unquote
  [rdr comma opts pending-forms]
  (if-let [ch (peek-char rdr)]
    (if (identical? \@ ch)
      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \@ opts pending-forms)
      ((wrapping-reader 'clojure.core/unquote) rdr \~ opts pending-forms))))
```

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:577-582](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L577-L582)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unquote"]))
```

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a syntax-quote.\n\nForces evaluation of the following form.",
 :ns "syntax",
 :name "unquote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/syntax-quote" "syntax/unquote-splicing"],
 :full-name-encode "syntax_unquote",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.9.2",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [732 751]},
 :extra-sources [{:code "(defn- read-unquote\n  [rdr comma opts pending-forms]\n  (if-let [ch (peek-char rdr)]\n    (if (identical? \\@ ch)\n      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \\@ opts pending-forms)\n      ((wrapping-reader 'clojure.core/unquote) rdr \\~ opts pending-forms))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.2",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [577 582]}],
 :syntax-form "~",
 :examples [{:id "1ff51e",
             :content "```clj\n(def foo 1)\n`~foo\n;;=> 1\n\n`(def foo ~foo)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/unquote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_unquote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_unquote.cljsdoc)
</pre>

