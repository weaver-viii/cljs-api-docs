## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/ignore

 <table border="1">
<tr>
<td><samp>#_</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#discard)
</td>
</tr>
</table>


Causes the following form to be completely skipped by the reader.  This is a
more complete removal than the `comment` macro which yields nil.

---

Example:

```clj
{:foo #_bar 2}
;;=> {:foo 2}
```

To comment out the last line of a function without worrying about commenting out
the trailing parentheses:

```clj
(defn foo []
  (println "hello")
  #_(println "world"))
```

---

See Also:

[`syntax/comment`](syntax_comment.md)<br>
[`cljs.core/comment`](cljs.core_comment.md)<br>

---


Source code:

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    nil))
```

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:609-620](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L609-L620)</ins>
</pre>


---

```clj
(defn- read-discard
  [rdr _]
  (doto rdr
    (read true nil true)))
```

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:369-372](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L369-L372)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/ignore"]))
```

```clj
{:description "Causes the following form to be completely skipped by the reader.  This is a\nmore complete removal than the `comment` macro which yields nil.",
 :ns "syntax",
 :name "ignore",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/comment" "cljs.core/comment"],
 :full-name-encode "syntax_ignore",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.16",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [609 620]},
 :extra-sources [{:code "(defn- read-discard\n  [rdr _]\n  (doto rdr\n    (read true nil true)))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [369 372]}],
 :syntax-form "#_",
 :examples [{:id "f36d7a",
             :content "```clj\n{:foo #_bar 2}\n;;=> {:foo 2}\n```\n\nTo comment out the last line of a function without worrying about commenting out\nthe trailing parentheses:\n\n```clj\n(defn foo []\n  (println \"hello\")\n  #_(println \"world\"))\n```"}],
 :edn-doc "https://github.com/edn-format/edn#discard",
 :full-name "syntax/ignore",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_ignore.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_ignore.cljsdoc)
</pre>

