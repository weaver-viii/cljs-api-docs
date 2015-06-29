## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reductions

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reductions</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reductions)
</td>
</tr>
</table>

 <samp>
(__reductions__ f coll)<br>
</samp>
 <samp>
(__reductions__ f init coll)<br>
</samp>

---

Returns a lazy sequence of the intermediate values of the reduction (as per
`reduce`) of `coll` by `f`, starting with `init`.

---


See Also:

[`cljs.core/reduce`](cljs.core_reduce.md)<br>

---

Source docstring:

```
Returns a lazy seq of the intermediate values of the reduction (as
per reduce) of coll by f, starting with init.
```

Source code:

```clj
(defn reductions
  ([f coll]
     (lazy-seq
      (if-let [s (seq coll)]
        (reductions f (first s) (rest s))
        (list (f)))))
  ([f init coll]
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (reductions f (f init (first s)) (rest s)))))))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7866-7878](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L7866-L7878)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reductions"]))
```

```clj
{:description "Returns a lazy sequence of the intermediate values of the reduction (as per\n`reduce`) of `coll` by `f`, starting with `init`.",
 :ns "cljs.core",
 :name "reductions",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/reduce"],
 :full-name-encode "cljs.core_reductions",
 :source {:code "(defn reductions\n  ([f coll]\n     (lazy-seq\n      (if-let [s (seq coll)]\n        (reductions f (first s) (rest s))\n        (list (f)))))\n  ([f init coll]\n     (cons init\n           (lazy-seq\n            (when-let [s (seq coll)]\n              (reductions f (f init (first s)) (rest s)))))))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7866 7878]},
 :full-name "cljs.core/reductions",
 :clj-symbol "clojure.core/reductions",
 :docstring "Returns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reductions.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reductions.cljsdoc)
</pre>

