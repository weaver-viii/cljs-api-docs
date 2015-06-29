## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.nodejs/process

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def process (js* "process"))
```

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[nodejs.cljs:16](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/nodejs.cljs#L16)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.nodejs/process"]))
```

```clj
{:ns "cljs.nodejs",
 :name "process",
 :type "var",
 :source {:code "(def process (js* \"process\"))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/nodejs.cljs",
          :lines [16]},
 :full-name "cljs.nodejs/process",
 :full-name-encode "cljs.nodejs_process",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.nodejs_process.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.nodejs_process.cljsdoc)
</pre>

