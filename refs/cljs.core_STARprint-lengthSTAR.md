## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-length\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-length\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-length*)
</td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *print-length* nil)
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:37](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L37)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-length*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-length*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *print-length* nil)",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [37]},
 :full-name "cljs.core/*print-length*",
 :full-name-encode "cljs.core_STARprint-lengthSTAR",
 :clj-symbol "clojure.core/*print-length*",
 :history [["+" "0.0-2060"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-lengthSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-lengthSTAR.cljsdoc)
</pre>

