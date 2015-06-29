## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/type

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/type)
</td>
</tr>
</table>

 <samp>
(__type__ x)<br>
</samp>

---




Source docstring:

```
Return x's constructor.
```

Source code:

```clj
(defn type
  [x]
  (when-not (nil? x)
    (.-constructor x)))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:206-210](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L206-L210)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/type"]))
```

```clj
{:ns "cljs.core",
 :name "type",
 :signature ["[x]"],
 :history [["+" "0.0-971"]],
 :type "function",
 :full-name-encode "cljs.core_type",
 :source {:code "(defn type\n  [x]\n  (when-not (nil? x)\n    (.-constructor x)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [206 210]},
 :full-name "cljs.core/type",
 :clj-symbol "clojure.core/type",
 :docstring "Return x's constructor."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_type.cljsdoc)
</pre>

