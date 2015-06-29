## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/tagged-literal

 <table border="1">
<tr>
<td><samp>#</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc4)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#tagged-elements)
</td>
</tr>
</table>






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
    (get-in [:symbols "syntax/tagged-literal"]))
```

```clj
{:ns "syntax",
 :name "tagged-literal",
 :history [["+" "0.0-1211"]],
 :type "syntax",
 :full-name-encode "syntax_tagged-literal",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "#",
 :edn-doc "https://github.com/edn-format/edn#tagged-elements",
 :full-name "syntax/tagged-literal",
 :clj-doc "http://clojure.org/reader#toc4"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_tagged-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_tagged-literal.cljsdoc)
</pre>

