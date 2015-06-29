## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reset!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset!)
</td>
</tr>
</table>

 <samp>
(__reset!__ a new-value)<br>
</samp>

---

Sets the value of atom `a` to `new-value` without regard for the current value.

Returns `new-value`.

---


See Also:

[`cljs.core/swap!`](cljs.core_swapBANG.md)<br>
[`cljs.core/compare-and-set!`](cljs.core_compare-and-setBANG.md)<br>
[`cljs.core/atom`](cljs.core_atom.md)<br>

---

Source docstring:

```
Sets the value of atom to newval without regard for the
current value. Returns newval.
```

Source code:

```clj
(defn reset!
  [a new-value]
  (when-let [validate (.-validator a)]
    (assert (validate new-value) "Validator rejected reference state"))
  (let [old-value (.-state a)]
    (set! (.-state a) new-value)
    (-notify-watches a old-value new-value))
  new-value)
```

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3252-3261](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L3252-L3261)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reset!"]))
```

```clj
{:description "Sets the value of atom `a` to `new-value` without regard for the current value.\n\nReturns `new-value`.",
 :ns "cljs.core",
 :name "reset!",
 :signature ["[a new-value]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/swap!"
           "cljs.core/compare-and-set!"
           "cljs.core/atom"],
 :full-name-encode "cljs.core_resetBANG",
 :source {:code "(defn reset!\n  [a new-value]\n  (when-let [validate (.-validator a)]\n    (assert (validate new-value) \"Validator rejected reference state\"))\n  (let [old-value (.-state a)]\n    (set! (.-state a) new-value)\n    (-notify-watches a old-value new-value))\n  new-value)",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3252 3261]},
 :full-name "cljs.core/reset!",
 :clj-symbol "clojure.core/reset!",
 :docstring "Sets the value of atom to newval without regard for the\ncurrent value. Returns newval."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_resetBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_resetBANG.cljsdoc)
</pre>

