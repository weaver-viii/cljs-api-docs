## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/swap!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/swap!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/swap!)
</td>
</tr>
</table>

 <samp>
(__swap!__ a f)<br>
</samp>
 <samp>
(__swap!__ a f x)<br>
</samp>
 <samp>
(__swap!__ a f x y)<br>
</samp>
 <samp>
(__swap!__ a f x y & more)<br>
</samp>

---

Atomically swaps the value of atom to be: `(apply f current-value-of-atom
args)`

Note that `f` may be called multiple times, and thus should be free of side
effects.

Returns the value that was swapped in.

---


See Also:

[`cljs.core/atom`](cljs.core_atom.md)<br>
[`cljs.core/reset!`](cljs.core_resetBANG.md)<br>

---

Source docstring:

```
Atomically swaps the value of atom to be:
(apply f current-value-of-atom args). Note that f may be called
multiple times, and thus should be free of side effects.  Returns
the value that was swapped in.
```

Source code:

```clj
(defn swap!
  ([a f]
     (reset! a (f (.-state a))))
  ([a f x]
     (reset! a (f (.-state a) x)))
  ([a f x y]
     (reset! a (f (.-state a) x y)))
  ([a f x y z]
     (reset! a (f (.-state a) x y z)))
  ([a f x y z & more]
     (reset! a (apply f (.-state a) x y z more))))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6900-6914](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L6900-L6914)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/swap!"]))
```

```clj
{:description "Atomically swaps the value of atom to be: `(apply f current-value-of-atom\nargs)`\n\nNote that `f` may be called multiple times, and thus should be free of side\neffects.\n\nReturns the value that was swapped in.",
 :ns "cljs.core",
 :name "swap!",
 :signature ["[a f]" "[a f x]" "[a f x y]" "[a f x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/reset!"],
 :full-name-encode "cljs.core_swapBANG",
 :source {:code "(defn swap!\n  ([a f]\n     (reset! a (f (.-state a))))\n  ([a f x]\n     (reset! a (f (.-state a) x)))\n  ([a f x y]\n     (reset! a (f (.-state a) x y)))\n  ([a f x y z]\n     (reset! a (f (.-state a) x y z)))\n  ([a f x y z & more]\n     (reset! a (apply f (.-state a) x y z more))))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6900 6914]},
 :full-name "cljs.core/swap!",
 :clj-symbol "clojure.core/swap!",
 :docstring "Atomically swaps the value of atom to be:\n(apply f current-value-of-atom args). Note that f may be called\nmultiple times, and thus should be free of side effects.  Returns\nthe value that was swapped in."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_swapBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_swapBANG.cljsdoc)
</pre>

