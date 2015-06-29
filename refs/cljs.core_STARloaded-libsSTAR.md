## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*loaded-libs\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[+] 0.0-2655" src="https://img.shields.io/badge/+-0.0--2655-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defonce ^:dynamic *loaded-libs* nil)
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:99](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L99)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*loaded-libs*"]))
```

```clj
{:ns "cljs.core",
 :name "*loaded-libs*",
 :type "dynamic var",
 :source {:code "(defonce ^:dynamic *loaded-libs* nil)",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [99]},
 :full-name "cljs.core/*loaded-libs*",
 :full-name-encode "cljs.core_STARloaded-libsSTAR",
 :history [["+" "0.0-2655"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARloaded-libsSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARloaded-libsSTAR.cljsdoc)
</pre>

