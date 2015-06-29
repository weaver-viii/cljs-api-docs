## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/keyword

 <table border="1">
<tr>
<td><samp>:</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#keywords)
</td>
</tr>
</table>


Signifies a keyword, a string-like datatype often used as keys for maps.
Keywords should not start with a number.

Keywords can have an optional namespace. For example, `:foo/bar`. This is useful
for functions in a namespace to prevent key collisions on a globally accessible
map.

Preceding a keyword with `::` will prepend the given keyword with the current
namespace.  For example, in the user namespace, `::foo` is read as `:user/foo`.

If a keyword is prefixed by `::` and is namespace-qualified, the namespace part is properly resolved.
For example, if `foo` is an alias of `cljs.core`, then `::foo/bar` evaluates to `:cljs.core/bar`.
A reader exception is thrown if `foo` is not a namespace.

---

Example:

```clj
:foo
;;=> :foo

::foo
;;=> :user/foo

:a/foo
;;=> :a/foo
```

---
Example:

A keyword is also callable for retrieving values from a map:

```clj
(def m {:foo 1})
(:foo m)
;;=> 1

(def things [{:foo 1 :bar 2}
             {:foo 3 :bar 4}
             {:foo 5 :bar 6}])
(map :foo things)
;;=> (1 3 5)
```

---

See Also:

[`cljs.core/keyword`](cljs.core_keyword.md)<br>
[`cljs.core/keyword?`](cljs.core_keywordQMARK.md)<br>

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
    (get-in [:symbols "syntax/keyword"]))
```

```clj
{:description "Signifies a keyword, a string-like datatype often used as keys for maps.\nKeywords should not start with a number.\n\nKeywords can have an optional namespace. For example, `:foo/bar`. This is useful\nfor functions in a namespace to prevent key collisions on a globally accessible\nmap.\n\nPreceding a keyword with `::` will prepend the given keyword with the current\nnamespace.  For example, in the user namespace, `::foo` is read as `:user/foo`.\n\nIf a keyword is prefixed by `::` and is namespace-qualified, the namespace part is properly resolved.\nFor example, if `foo` is an alias of `cljs.core`, then `::foo/bar` evaluates to `:cljs.core/bar`.\nA reader exception is thrown if `foo` is not a namespace.",
 :ns "syntax",
 :name "keyword",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/keyword" "cljs.core/keyword?"],
 :full-name-encode "syntax_keyword",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form ":",
 :examples [{:id "e5fdbe",
             :content "```clj\n:foo\n;;=> :foo\n\n::foo\n;;=> :user/foo\n\n:a/foo\n;;=> :a/foo\n```"}
            {:id "9765fe",
             :content "A keyword is also callable for retrieving values from a map:\n\n```clj\n(def m {:foo 1})\n(:foo m)\n;;=> 1\n\n(def things [{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}])\n(map :foo things)\n;;=> (1 3 5)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#keywords",
 :full-name "syntax/keyword",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_keyword.cljsdoc)
</pre>

