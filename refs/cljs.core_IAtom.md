## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IAtom

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IAtom)
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:410](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L410)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAtom"]))
```

```clj
{:ns "cljs.core",
 :name "IAtom",
 :type "protocol",
 :full-name-encode "cljs.core_IAtom",
 :source {:code "(defprotocol IAtom)",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [410]},
 :full-name "cljs.core/IAtom",
 :history [["+" "0.0-2173"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IAtom.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IAtom.cljsdoc)
</pre>

