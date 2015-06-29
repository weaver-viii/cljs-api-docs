## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/iterate

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/iterate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/iterate)
</td>
</tr>
</table>

 <samp>
(__iterate__ f x)<br>
</samp>

---

Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.

`f` must be free of side-effects.

---


See Also:

[`cljs.core/cycle`](cljs.core_cycle.md)<br>
[`cljs.core/repeatedly`](cljs.core_repeatedly.md)<br>
[`cljs.core/repeat`](cljs.core_repeat.md)<br>

---

Source docstring:

```
Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects
```

Source code:

```clj
(defn iterate
  [f x] (cons x (lazy-seq (iterate f (f x)))))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3019-3022](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L3019-L3022)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iterate"]))
```

```clj
{:description "Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.\n\n`f` must be free of side-effects.",
 :ns "cljs.core",
 :name "iterate",
 :signature ["[f x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/cycle"
           "cljs.core/repeatedly"
           "cljs.core/repeat"],
 :full-name-encode "cljs.core_iterate",
 :source {:code "(defn iterate\n  [f x] (cons x (lazy-seq (iterate f (f x)))))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3019 3022]},
 :full-name "cljs.core/iterate",
 :clj-symbol "clojure.core/iterate",
 :docstring "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iterate.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iterate.cljsdoc)
</pre>

