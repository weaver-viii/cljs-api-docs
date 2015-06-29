## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Vector.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Vector.fromArray__ xs)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.Vector/fromArray (fn [xs] (Vector. nil xs)))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1974](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1974)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Vector.fromArray"]))
```

```clj
{:ns "cljs.core",
 :name "Vector.fromArray",
 :signature ["[xs]"],
 :history [["+" "0.0-927"]],
 :parent-type "Vector",
 :type "function",
 :full-name-encode "cljs.core_VectorDOTfromArray",
 :source {:code "(set! cljs.core.Vector/fromArray (fn [xs] (Vector. nil xs)))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1974]},
 :full-name "cljs.core/Vector.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_VectorDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_VectorDOTfromArray.cljsdoc)
</pre>

