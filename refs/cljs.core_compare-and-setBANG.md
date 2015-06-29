## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/compare-and-set!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare-and-set!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare-and-set!)
</td>
</tr>
</table>

 <samp>
(__compare-and-set!__ a oldval newval)<br>
</samp>

---

Atomically sets the value of atom `a` to `newval` if and only if the current
value of the atom is identical to `oldval`.

Returns true if set happened, false otherwise.

---


See Also:

[`cljs.core/atom`](cljs.core_atom.md)<br>
[`cljs.core/reset!`](cljs.core_resetBANG.md)<br>
[`cljs.core/swap!`](cljs.core_swapBANG.md)<br>

---

Source docstring:

```
Atomically sets the value of atom to newval if and only if the
current value of the atom is identical to oldval. Returns true if
set happened, else false.
```

Source code:

```clj
(defn compare-and-set!
  [a oldval newval]
  (if (= (.-state a) oldval)
    (do (reset! a newval) true)
    false))
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3347-3354](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L3347-L3354)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/compare-and-set!"]))
```

```clj
{:description "Atomically sets the value of atom `a` to `newval` if and only if the current\nvalue of the atom is identical to `oldval`.\n\nReturns true if set happened, false otherwise.",
 :ns "cljs.core",
 :name "compare-and-set!",
 :signature ["[a oldval newval]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/reset!" "cljs.core/swap!"],
 :full-name-encode "cljs.core_compare-and-setBANG",
 :source {:code "(defn compare-and-set!\n  [a oldval newval]\n  (if (= (.-state a) oldval)\n    (do (reset! a newval) true)\n    false))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3347 3354]},
 :full-name "cljs.core/compare-and-set!",
 :clj-symbol "clojure.core/compare-and-set!",
 :docstring "Atomically sets the value of atom to newval if and only if the\ncurrent value of the atom is identical to oldval. Returns true if\nset happened, else false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_compare-and-setBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_compare-and-setBANG.cljsdoc)
</pre>

