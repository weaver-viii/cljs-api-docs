## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/deref

 <table border="1">
<tr>
<td><samp>@</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Used to dereference a reference value (e.g. an atom).  Expands to `(deref ...)`.

`@foo` = `(deref foo)`

---

Example:

```clj
(def a (atom 1))
@a
;;=> 1

(deref a)
;;=> 1
```

---

See Also:

[`cljs.core/deref`](cljs.core_deref.md)<br>

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
    (get-in [:symbols "syntax/deref"]))
```

```clj
{:description "Used to dereference a reference value (e.g. an atom).  Expands to `(deref ...)`.\n\n`@foo` = `(deref foo)`",
 :ns "syntax",
 :name "deref",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/deref"],
 :full-name-encode "syntax_deref",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "@",
 :examples [{:id "08f886",
             :content "```clj\n(def a (atom 1))\n@a\n;;=> 1\n\n(deref a)\n;;=> 1\n```"}],
 :full-name "syntax/deref",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_deref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_deref.cljsdoc)
</pre>

