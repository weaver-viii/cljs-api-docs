## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.nodejs/require

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def require (js* "require"))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[nodejs.cljs:7](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/nodejs.cljs#L7)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.nodejs/require"]))
```

```clj
{:ns "cljs.nodejs",
 :name "require",
 :type "var",
 :source {:code "(def require (js* \"require\"))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/nodejs.cljs",
          :lines [7]},
 :full-name "cljs.nodejs/require",
 :full-name-encode "cljs.nodejs_require",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.nodejs_require.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.nodejs_require.cljsdoc)
</pre>

