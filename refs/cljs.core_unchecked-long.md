## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-long

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-long</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-long)
</td>
</tr>
</table>

 <samp>
(__unchecked-long__ x)<br>
</samp>

---




Source docstring:

```
Coerce to long by stripping decimal places. Identical to `int'.
```

Source code:

```clj
(defn unchecked-long
  [x]
  (fix x))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2047-2050](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L2047-L2050)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-long"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-long",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-long",
 :source {:code "(defn unchecked-long\n  [x]\n  (fix x))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2047 2050]},
 :full-name "cljs.core/unchecked-long",
 :clj-symbol "clojure.core/unchecked-long",
 :docstring "Coerce to long by stripping decimal places. Identical to `int'."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-long.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-long.cljsdoc)
</pre>

