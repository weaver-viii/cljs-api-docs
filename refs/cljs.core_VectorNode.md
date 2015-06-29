## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/VectorNode

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__VectorNode.__ edit arr)<br>
</samp>

---





Source code:

```clj
(deftype VectorNode [edit arr])
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3228](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L3228)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/VectorNode"]))
```

```clj
{:ns "cljs.core",
 :name "VectorNode",
 :type "type",
 :signature ["[edit arr]"],
 :source {:code "(deftype VectorNode [edit arr])",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3228]},
 :full-name "cljs.core/VectorNode",
 :full-name-encode "cljs.core_VectorNode",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_VectorNode.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_VectorNode.cljsdoc)
</pre>

