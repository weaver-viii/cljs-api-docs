## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/memoize

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memoize</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memoize)
</td>
</tr>
</table>

 <samp>
(__memoize__ f)<br>
</samp>

---

Returns a memoized version of a referentially transparent function.

A memoized version of a function keeps a cache of the mappings from arguments to
results in memory. When calls with the same arguments are repeated often, a
memoized function has higher performance at the expense of higher memory usage.

---



Source docstring:

```
Returns a memoized version of a referentially transparent function. The
memoized version of the function keeps a cache of the mapping from arguments
to results and, when calls with the same arguments are repeated often, has
higher performance at the expense of higher memory use.
```

Source code:

```clj
(defn memoize
  [f]
  (let [mem (atom {})]
    (fn [& args]
      (if-let [v (get @mem args)]
        v
        (let [ret (apply f args)]
          (swap! mem assoc args ret)
          ret)))))
```

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6890-6902](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6890-L6902)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/memoize"]))
```

```clj
{:description "Returns a memoized version of a referentially transparent function.\n\nA memoized version of a function keeps a cache of the mappings from arguments to\nresults in memory. When calls with the same arguments are repeated often, a\nmemoized function has higher performance at the expense of higher memory usage.",
 :ns "cljs.core",
 :name "memoize",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_memoize",
 :source {:code "(defn memoize\n  [f]\n  (let [mem (atom {})]\n    (fn [& args]\n      (if-let [v (get @mem args)]\n        v\n        (let [ret (apply f args)]\n          (swap! mem assoc args ret)\n          ret)))))",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6890 6902]},
 :full-name "cljs.core/memoize",
 :clj-symbol "clojure.core/memoize",
 :docstring "Returns a memoized version of a referentially transparent function. The\nmemoized version of the function keeps a cache of the mapping from arguments\nto results and, when calls with the same arguments are repeated often, has\nhigher performance at the expense of higher memory use."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_memoize.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_memoize.cljsdoc)
</pre>

