## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*flush-on-newline\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*flush-on-newline\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*flush-on-newline*)
</td>
</tr>
</table>






Source code:

```clj
(def *flush-on-newline* true)
```

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6341](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L6341)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*flush-on-newline*"]))
```

```clj
{:ns "cljs.core",
 :name "*flush-on-newline*",
 :type "var",
 :source {:code "(def *flush-on-newline* true)",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6341]},
 :full-name "cljs.core/*flush-on-newline*",
 :full-name-encode "cljs.core_STARflush-on-newlineSTAR",
 :clj-symbol "clojure.core/*flush-on-newline*",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARflush-on-newlineSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARflush-on-newlineSTAR.cljsdoc)
</pre>

