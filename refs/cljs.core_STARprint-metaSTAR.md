## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-meta\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-meta\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-meta*)
</td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *print-meta* false)
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:35](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L35)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-meta*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-meta*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *print-meta* false)",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [35]},
 :full-name "cljs.core/*print-meta*",
 :full-name-encode "cljs.core_STARprint-metaSTAR",
 :clj-symbol "clojure.core/*print-meta*",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-metaSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-metaSTAR.cljsdoc)
</pre>

