## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IList

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentList</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentList.java)
</td>
</tr>
</table>





Source docstring:

```
Marker interface indicating a persistent list
```

Source code:

```clj
(defprotocol IList
  "Marker interface indicating a persistent list")
```

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:300-301](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L300-L301)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IList"]))
```

```clj
{:ns "cljs.core",
 :name "IList",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IList",
 :source {:code "(defprotocol IList\n  \"Marker interface indicating a persistent list\")",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [300 301]},
 :full-name "cljs.core/IList",
 :clj-symbol "clojure.lang/IPersistentList",
 :docstring "Marker interface indicating a persistent list"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IList.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IList.cljsdoc)
</pre>

