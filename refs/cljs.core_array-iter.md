## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-iter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-iter__ x)<br>
</samp>

---





Source code:

```clj
(defn array-iter [x]
  (ArrayIter. x 0))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3086-3087](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L3086-L3087)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-iter"]))
```

```clj
{:ns "cljs.core",
 :name "array-iter",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn array-iter [x]\n  (ArrayIter. x 0))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3086 3087]},
 :full-name "cljs.core/array-iter",
 :full-name-encode "cljs.core_array-iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-iter.cljsdoc)
</pre>

