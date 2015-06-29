## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/comment

 <table border="1">
<tr>
<td><samp>;</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#comments)
</td>
</tr>
</table>


"Comments out" everything after `;` on the current line.

---

Example:

Add comments to code:

```clj
(def a 1) ; this is a comment
```

It is common to use `;;` for comments that have their own line:

```clj
;; this is comment is on its own line
```

---

See Also:

[`syntax/ignore`](syntax_ignore.md)<br>
[`cljs.core/comment`](cljs.core_comment.md)<br>

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
(defn read-comment
  [rdr & _]
  (skip-line rdr _))
```

 <pre>
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── reader
                        └── impl
                            └── <ins>[commons.clj:120-122](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader/impl/commons.clj#L120-L122)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/comment"]))
```

```clj
{:description "\"Comments out\" everything after `;` on the current line.",
 :ns "syntax",
 :name "comment",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/ignore" "cljs.core/comment"],
 :full-name-encode "syntax_comment",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.10",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [559 578]},
 :extra-sources [{:code "(defn read-comment\n  [rdr & _]\n  (skip-line rdr _))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.10",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [120 122]}],
 :syntax-form ";",
 :examples [{:id "ab62d2",
             :content "Add comments to code:\n\n```clj\n(def a 1) ; this is a comment\n```\n\nIt is common to use `;;` for comments that have their own line:\n\n```clj\n;; this is comment is on its own line\n```"}],
 :edn-doc "https://github.com/edn-format/edn#comments",
 :full-name "syntax/comment",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_comment.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_comment.cljsdoc)
</pre>

