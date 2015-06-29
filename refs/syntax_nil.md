## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/nil

 <table border="1">
<tr>
<td><samp>nil</samp></td>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#nil)
</td>
</tr>
</table>


`nil` is a representation of nothing.

It is common for operations to safely handle `nil` without
causing exceptions.

Expressions evaluate to `nil` if there is no value to return.

---

Example:

```clj
nil
;;=> nil
```

`nil` can sometimes mean "not found":

```clj
(:foo {})
;;=> nil
```

`nil` can also mean that the operation didn't make sense:

```clj
(:foo nil)
;;=> nil
```

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
    (get-in [:symbols "syntax/nil"]))
```

```clj
{:description "`nil` is a representation of nothing.\n\nIt is common for operations to safely handle `nil` without\ncausing exceptions.\n\nExpressions evaluate to `nil` if there is no value to return.",
 :ns "syntax",
 :name "nil",
 :history [["+" "0.0-927"]],
 :type "special symbol",
 :full-name-encode "syntax_nil",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "nil",
 :examples [{:id "17b92a",
             :content "```clj\nnil\n;;=> nil\n```\n\n`nil` can sometimes mean \"not found\":\n\n```clj\n(:foo {})\n;;=> nil\n```\n\n`nil` can also mean that the operation didn't make sense:\n\n```clj\n(:foo nil)\n;;=> nil\n```"}],
 :edn-doc "https://github.com/edn-format/edn#nil",
 :full-name "syntax/nil",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_nil.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_nil.cljsdoc)
</pre>

