## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-dup\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-dup\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-dup*)
</td>
</tr>
</table>






Source code:

```clj
(def *print-dup* false)
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5705](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5705)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-dup*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-dup*",
 :type "var",
 :source {:code "(def *print-dup* false)",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5705]},
 :full-name "cljs.core/*print-dup*",
 :full-name-encode "cljs.core_STARprint-dupSTAR",
 :clj-symbol "clojure.core/*print-dup*",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-dupSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-dupSTAR.cljsdoc)
</pre>
