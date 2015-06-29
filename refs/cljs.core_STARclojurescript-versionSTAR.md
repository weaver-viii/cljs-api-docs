## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*clojurescript-version\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2014"><img valign="middle" alt="[+] 0.0-2014" src="https://img.shields.io/badge/+-0.0--2014-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*clojure-version\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*clojure-version*)
</td>
</tr>
</table>






Source code:

```clj
(def *clojurescript-version*)
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:16](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L16)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*clojurescript-version*"]))
```

```clj
{:ns "cljs.core",
 :name "*clojurescript-version*",
 :type "var",
 :source {:code "(def *clojurescript-version*)",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [16]},
 :full-name "cljs.core/*clojurescript-version*",
 :full-name-encode "cljs.core_STARclojurescript-versionSTAR",
 :clj-symbol "clojure.core/*clojure-version*",
 :history [["+" "0.0-2014"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARclojurescript-versionSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARclojurescript-versionSTAR.cljsdoc)
</pre>

