## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/es6-iterator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__es6-iterator__ coll)<br>
</samp>

---




Source docstring:

```
EXPERIMENTAL: Return a ES2015 compatible iterator for coll.
```

Source code:

```clj
(defn es6-iterator
  [coll]
  (ES6Iterator. (seq coll)))
```

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:822-825](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L822-L825)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-iterator"]))
```

```clj
{:ns "cljs.core",
 :name "es6-iterator",
 :signature ["[coll]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core_es6-iterator",
 :source {:code "(defn es6-iterator\n  [coll]\n  (ES6Iterator. (seq coll)))",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [822 825]},
 :full-name "cljs.core/es6-iterator",
 :docstring "EXPERIMENTAL: Return a ES2015 compatible iterator for coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_es6-iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_es6-iterator.cljsdoc)
</pre>

