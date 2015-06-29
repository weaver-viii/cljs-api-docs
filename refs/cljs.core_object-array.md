## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/object-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/object-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/object-array)
</td>
</tr>
</table>

 <samp>
(__object-array__ size-or-seq)<br>
</samp>
 <samp>
(__object-array__ size init-val-or-seq)<br>
</samp>

---





Source code:

```clj
(defn object-array
  ([size-or-seq]
     (if (number? size-or-seq)
       (object-array size-or-seq nil)
       (into-array size-or-seq)))
  ([size init-val-or-seq]
     (let [a (make-array size)]
       (if (seq? init-val-or-seq)
         (let [s (seq init-val-or-seq)]
           (loop [i 0 s s]
             (if (and s (< i size))
               (do
                 (aset a i (first s))
                 (recur (inc i) (next s)))
               a)))
         (do
           (dotimes [i size]
             (aset a i init-val-or-seq))
           a)))))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2345-2363](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L2345-L2363)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/object-array"]))
```

```clj
{:ns "cljs.core",
 :name "object-array",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_object-array",
 :source {:code "(defn object-array\n  ([size-or-seq]\n     (if (number? size-or-seq)\n       (object-array size-or-seq nil)\n       (into-array size-or-seq)))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2345 2363]},
 :full-name "cljs.core/object-array",
 :clj-symbol "clojure.core/object-array"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_object-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_object-array.cljsdoc)
</pre>

