## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cycle

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cycle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cycle)
</td>
</tr>
</table>

 <samp>
(__cycle__ coll)<br>
</samp>

---

Returns an infinite lazy sequence of repetitions of the items in `coll`.

---


See Also:

[`cljs.core/lazy-seq`](cljs.core_lazy-seq.md)<br>
[`cljs.core/repeatedly`](cljs.core_repeatedly.md)<br>

---

Source docstring:

```
Returns a lazy (infinite!) sequence of repetitions of the items in coll.
```

Source code:

```clj
(defn cycle
  [coll] (lazy-seq
          (when-let [s (seq coll)]
            (concat s (cycle s)))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4165-4169](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L4165-L4169)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cycle"]))
```

```clj
{:description "Returns an infinite lazy sequence of repetitions of the items in `coll`.",
 :ns "cljs.core",
 :name "cycle",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/lazy-seq" "cljs.core/repeatedly"],
 :full-name-encode "cljs.core_cycle",
 :source {:code "(defn cycle\n  [coll] (lazy-seq\n          (when-let [s (seq coll)]\n            (concat s (cycle s)))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4165 4169]},
 :full-name "cljs.core/cycle",
 :clj-symbol "clojure.core/cycle",
 :docstring "Returns a lazy (infinite!) sequence of repetitions of the items in coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cycle.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cycle.cljsdoc)
</pre>

