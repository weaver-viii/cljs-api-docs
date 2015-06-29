## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/int-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/int-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/int-array)
</td>
</tr>
</table>

 <samp>
(__int-array__ size-or-seq)<br>
</samp>
 <samp>
(__int-array__ size init-val-or-seq)<br>
</samp>

---




Source docstring:

```
Creates an array of ints. Does not coerce array, provided for compatibility
with Clojure.
```

Source code:

```clj
(defn int-array
  ([size-or-seq]
     (if (number? size-or-seq)
       (int-array size-or-seq nil)
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
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3058-3078](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L3058-L3078)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/int-array"]))
```

```clj
{:ns "cljs.core",
 :name "int-array",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_int-array",
 :source {:code "(defn int-array\n  ([size-or-seq]\n     (if (number? size-or-seq)\n       (int-array size-or-seq nil)\n       (into-array size-or-seq)))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3058 3078]},
 :full-name "cljs.core/int-array",
 :clj-symbol "clojure.core/int-array",
 :docstring "Creates an array of ints. Does not coerce array, provided for compatibility\nwith Clojure."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_int-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_int-array.cljsdoc)
</pre>

