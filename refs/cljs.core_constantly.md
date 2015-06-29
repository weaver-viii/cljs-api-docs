## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/constantly

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/constantly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/constantly)
</td>
</tr>
</table>

 <samp>
(__constantly__ x)<br>
</samp>

---

Returns a function that takes any number of arguments and always returns `x`.

---


See Also:

[`cljs.core/repeatedly`](cljs.core_repeatedly.md)<br>

---

Source docstring:

```
Returns a function that takes any number of arguments and returns x.
```

Source code:

```clj
(defn constantly
  [x] (fn [& args] x))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2606-2608](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L2606-L2608)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/constantly"]))
```

```clj
{:description "Returns a function that takes any number of arguments and always returns `x`.",
 :ns "cljs.core",
 :name "constantly",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeatedly"],
 :full-name-encode "cljs.core_constantly",
 :source {:code "(defn constantly\n  [x] (fn [& args] x))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2606 2608]},
 :full-name "cljs.core/constantly",
 :clj-symbol "clojure.core/constantly",
 :docstring "Returns a function that takes any number of arguments and returns x."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_constantly.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_constantly.cljsdoc)
</pre>

