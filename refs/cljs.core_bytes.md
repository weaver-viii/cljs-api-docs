## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bytes

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bytes</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bytes)
</td>
</tr>
</table>

 <samp>
(__bytes__ x)<br>
</samp>

---





Source code:

```clj
(defn bytes [x] x)
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1895](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L1895)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bytes"]))
```

```clj
{:ns "cljs.core",
 :name "bytes",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_bytes",
 :source {:code "(defn bytes [x] x)",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1895]},
 :full-name "cljs.core/bytes",
 :clj-symbol "clojure.core/bytes"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bytes.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bytes.cljsdoc)
</pre>

