## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/volatile?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__volatile?__ x)<br>
</samp>

---




Source docstring:

```
Returns true if x is a volatile.
```

Source code:

```clj
(defn volatile?
  [x] (instance? Volatile x))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3543-3545](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L3543-L3545)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/volatile?"]))
```

```clj
{:ns "cljs.core",
 :name "volatile?",
 :signature ["[x]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.core_volatileQMARK",
 :source {:code "(defn volatile?\n  [x] (instance? Volatile x))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3543 3545]},
 :full-name "cljs.core/volatile?",
 :docstring "Returns true if x is a volatile."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_volatileQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_volatileQMARK.cljsdoc)
</pre>

