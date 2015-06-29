## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vreset!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__vreset!__ vol newval)<br>
</samp>

---




Source docstring:

```
Sets the value of volatile to newval without regard for the
current value. Returns newval.
```

Source code:

```clj
(defn vreset!
  [vol newval]  (-vreset! vol newval))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3547-3550](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L3547-L3550)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vreset!"]))
```

```clj
{:ns "cljs.core",
 :name "vreset!",
 :signature ["[vol newval]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.core_vresetBANG",
 :source {:code "(defn vreset!\n  [vol newval]  (-vreset! vol newval))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3547 3550]},
 :full-name "cljs.core/vreset!",
 :docstring "Sets the value of volatile to newval without regard for the\ncurrent value. Returns newval."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vresetBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vresetBANG.cljsdoc)
</pre>
