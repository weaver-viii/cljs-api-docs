## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/syntax-quote

 <table border="1">
<tr>
<td><samp>`</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Prevent evaluation of the following form.

Adds namespace-qualification to any symbols inside the following form by
resolving them in the current context.

Any non-namespaced symbols ending with `#` will resolve to a generated symbol
of the same name with `_` and a unique ID appended.  All references to that
symbol within a syntax-quoted expression will resolve to the same generated
symbol.

---

Example:

```clj
`foo
;;=> cljs.user/foo

`foo#
;;=> foo__20418__auto__

`(def foo 1)
;;=> (def cljs.user/foo 1)
```

---

See Also:

[`syntax/quote`](syntax_quote.md)<br>
[`syntax/unquote`](syntax_unquote.md)<br>
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
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:543-562](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L543-L562)</ins>
</pre>


---

```clj
(defn- read-syntax-quote
  [rdr backquote]
  (binding [gensym-env {}]
    (-> (read rdr true nil true)
        syntax-quote*)))
```

 <pre>
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:537-541](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L537-L541)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/syntax-quote"]))
```

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nPrevent evaluation of the following form.\n\nAdds namespace-qualification to any symbols inside the following form by\nresolving them in the current context.\n\nAny non-namespaced symbols ending with `#` will resolve to a generated symbol\nof the same name with `_` and a unique ID appended.  All references to that\nsymbol within a syntax-quoted expression will resolve to the same generated\nsymbol.",
 :ns "syntax",
 :name "syntax-quote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/quote" "syntax/unquote" "syntax/unquote-splicing"],
 :full-name-encode "syntax_syntax-quote",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.8",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [543 562]},
 :extra-sources [{:code "(defn- read-syntax-quote\n  [rdr backquote]\n  (binding [gensym-env {}]\n    (-> (read rdr true nil true)\n        syntax-quote*)))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.8",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [537 541]}],
 :syntax-form "`",
 :examples [{:id "bffbdf",
             :content "```clj\n`foo\n;;=> cljs.user/foo\n\n`foo#\n;;=> foo__20418__auto__\n\n`(def foo 1)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/syntax-quote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_syntax-quote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_syntax-quote.cljsdoc)
</pre>

