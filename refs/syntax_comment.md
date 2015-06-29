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

```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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

