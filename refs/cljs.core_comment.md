## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/comment

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comment</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comment)
</td>
</tr>
</table>

 <samp>
(__comment__ & body)<br>
</samp>

---

Ignores all `body` forms (i.e. "commenting out"). Returns nil.

This is often used near the bottom of a file to hold expressions that test
different functions during development.  Specific expressions within the
`comment` can then be selected and evaluated from some editors.

You can also use `;` to "comment out" code until the end of a line.

---

Example:

```clj
(comment 123)
;;=> nil

(comment
  (foo 1 2 3)
  (bar "hello"))
;;=> nil
```

Inner forms must still be syntactically correct:

```clj
(comment [1 2 3]])
;; Error: Unmatched delimiter ]

(comment a : b)
;; Error: Invalid token :
```

---


Source docstring:

```
Ignores body, yields nil
```

Source code:

```clj
(defmacro comment
  [& body])
```

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4531-4534](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L4531-L4534)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/comment"]))
```

```clj
{:description "Ignores all `body` forms (i.e. \"commenting out\"). Returns nil.\n\nThis is often used near the bottom of a file to hold expressions that test\ndifferent functions during development.  Specific expressions within the\n`comment` can then be selected and evaluated from some editors.\n\nYou can also use `;` to \"comment out\" code until the end of a line.",
 :ns "cljs.core",
 :name "comment",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_comment",
 :source {:code "(defmacro comment\n  [& body])",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [4531 4534]},
 :examples [{:id "482fd7",
             :content "```clj\n(comment 123)\n;;=> nil\n\n(comment\n  (foo 1 2 3)\n  (bar \"hello\"))\n;;=> nil\n```\n\nInner forms must still be syntactically correct:\n\n```clj\n(comment [1 2 3]])\n;; Error: Unmatched delimiter ]\n\n(comment a : b)\n;; Error: Invalid token :\n```"}],
 :full-name "cljs.core/comment",
 :clj-symbol "clojure.core/comment",
 :docstring "Ignores body, yields nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_comment.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_comment.cljsdoc)
</pre>

