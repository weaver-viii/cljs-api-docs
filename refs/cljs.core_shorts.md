## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/shorts

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/shorts</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/shorts)
</td>
</tr>
</table>

 <samp>
(__shorts__ x)<br>
</samp>

---





Source code:

```clj
(defn shorts [x] x)
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1998](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L1998)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/shorts"]))
```

```clj
{:ns "cljs.core",
 :name "shorts",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_shorts",
 :source {:code "(defn shorts [x] x)",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1998]},
 :full-name "cljs.core/shorts",
 :clj-symbol "clojure.core/shorts"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_shorts.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_shorts.cljsdoc)
</pre>

