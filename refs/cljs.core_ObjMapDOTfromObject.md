## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ObjMap.fromObject

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ObjMap.fromObject__ ks obj)<br>
</samp>

---





Source code:

```clj
(set! (.-fromObject ObjMap) (fn [ks obj] (ObjMap. nil ks obj 0 nil)))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5158](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L5158)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ObjMap.fromObject"]))
```

```clj
{:ns "cljs.core",
 :name "ObjMap.fromObject",
 :signature ["[ks obj]"],
 :history [["+" "0.0-927"]],
 :parent-type "ObjMap",
 :type "function",
 :full-name-encode "cljs.core_ObjMapDOTfromObject",
 :source {:code "(set! (.-fromObject ObjMap) (fn [ks obj] (ObjMap. nil ks obj 0 nil)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5158]},
 :full-name "cljs.core/ObjMap.fromObject"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ObjMapDOTfromObject.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ObjMapDOTfromObject.cljsdoc)
</pre>

