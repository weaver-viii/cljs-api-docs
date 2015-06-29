## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/tagged-literal?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tagged-literal?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tagged-literal?)
</td>
</tr>
</table>

 <samp>
(__tagged-literal?__ value)<br>
</samp>

---




Source docstring:

```
Return true if the value is the data representation of a tagged literal
```

Source code:

```clj
(defn tagged-literal?
  [value]
  (instance? cljs.core.TaggedLiteral value))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9653-9656](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L9653-L9656)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/tagged-literal?"]))
```

```clj
{:ns "cljs.core",
 :name "tagged-literal?",
 :signature ["[value]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core_tagged-literalQMARK",
 :source {:code "(defn tagged-literal?\n  [value]\n  (instance? cljs.core.TaggedLiteral value))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9653 9656]},
 :full-name "cljs.core/tagged-literal?",
 :clj-symbol "clojure.core/tagged-literal?",
 :docstring "Return true if the value is the data representation of a tagged literal"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_tagged-literalQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_tagged-literalQMARK.cljsdoc)
</pre>

