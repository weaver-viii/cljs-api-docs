## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/tagged-literal

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tagged-literal</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tagged-literal)
</td>
</tr>
</table>

 <samp>
(__tagged-literal__ tag form)<br>
</samp>

---




Source docstring:

```
Construct a data representation of a tagged literal from a
tag symbol and a form.
```

Source code:

```clj
(defn tagged-literal
  [tag form]
  {:pre [(symbol? tag)]}
  (cljs.core.TaggedLiteral. tag form))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9658-9663](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L9658-L9663)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/tagged-literal"]))
```

```clj
{:ns "cljs.core",
 :name "tagged-literal",
 :signature ["[tag form]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core_tagged-literal",
 :source {:code "(defn tagged-literal\n  [tag form]\n  {:pre [(symbol? tag)]}\n  (cljs.core.TaggedLiteral. tag form))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9658 9663]},
 :full-name "cljs.core/tagged-literal",
 :clj-symbol "clojure.core/tagged-literal",
 :docstring "Construct a data representation of a tagged literal from a\ntag symbol and a form."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_tagged-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_tagged-literal.cljsdoc)
</pre>

