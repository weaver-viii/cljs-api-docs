## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/long

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/long</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/long)
</td>
</tr>
</table>

 <samp>
(__long__ x)<br>
</samp>

---




Source docstring:

```
Coerce to long by stripping decimal places. Identical to `int'.
```

Source code:

```clj
(defn long
  [x]
  (fix x))
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1117-1120](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1117-L1120)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/long"]))
```

```clj
{:ns "cljs.core",
 :name "long",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_long",
 :source {:code "(defn long\n  [x]\n  (fix x))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1117 1120]},
 :full-name "cljs.core/long",
 :clj-symbol "clojure.core/long",
 :docstring "Coerce to long by stripping decimal places. Identical to `int'."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_long.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_long.cljsdoc)
</pre>

