## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Reduced

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Reduced.__ val)<br>
</samp>

---





Source code:

```clj
(deftype Reduced [val]
  IDeref
  (-deref [o] val))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:471-473](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L471-L473)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Reduced"]))
```

```clj
{:ns "cljs.core",
 :name "Reduced",
 :type "type",
 :signature ["[val]"],
 :source {:code "(deftype Reduced [val]\n  IDeref\n  (-deref [o] val))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [471 473]},
 :full-name "cljs.core/Reduced",
 :full-name-encode "cljs.core_Reduced",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Reduced.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Reduced.cljsdoc)
</pre>

