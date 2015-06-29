## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/areduce

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/areduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/areduce)
</td>
</tr>
</table>

 <samp>
(__areduce__ a idx ret init expr)<br>
</samp>

---

For quickly reducing an expression `expr` across a JavaScript array `a`.  The
expression can use `ret` as the current result, which is initialized to `init`.
It can also use `idx` to get the current index.

---

Example:

```clj
(def a #js [1 2 3])
(areduce a i ret 0 (+ ret (aget a i)))
;;=> 6
```

---

See Also:

[`cljs.core/reduce`](cljs.core_reduce.md)<br>

---

Source docstring:

```
Reduces an expression across an array a, using an index named idx,
and return value named ret, initialized to init, setting ret to the 
evaluation of expr at each step, returning ret.
```

Source code:

```clj
(defmacro areduce
  [a idx ret init expr]
  `(let [a# ~a]
     (loop  [~idx 0 ~ret ~init]
       (if (< ~idx  (alength a#))
         (recur (inc ~idx) ~expr)
         ~ret))))
```

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:657-666](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L657-L666)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/areduce"]))
```

```clj
{:description "For quickly reducing an expression `expr` across a JavaScript array `a`.  The\nexpression can use `ret` as the current result, which is initialized to `init`.\nIt can also use `idx` to get the current index.",
 :ns "cljs.core",
 :name "areduce",
 :signature ["[a idx ret init expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/reduce"],
 :full-name-encode "cljs.core_areduce",
 :source {:code "(defmacro areduce\n  [a idx ret init expr]\n  `(let [a# ~a]\n     (loop  [~idx 0 ~ret ~init]\n       (if (< ~idx  (alength a#))\n         (recur (inc ~idx) ~expr)\n         ~ret))))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/clj/cljs/core.clj",
          :lines [657 666]},
 :examples [{:id "20a389",
             :content "```clj\n(def a #js [1 2 3])\n(areduce a i ret 0 (+ ret (aget a i)))\n;;=> 6\n```"}],
 :full-name "cljs.core/areduce",
 :clj-symbol "clojure.core/areduce",
 :docstring "Reduces an expression across an array a, using an index named idx,\nand return value named ret, initialized to init, setting ret to the \nevaluation of expr at each step, returning ret."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_areduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_areduce.cljsdoc)
</pre>

