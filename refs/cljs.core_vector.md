## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector)
</td>
</tr>
</table>

 <samp>
(__vector__ & args)<br>
</samp>

---

Creates a new vector containing `args`.

---


See Also:

[`cljs.core/vec`](cljs.core_vec.md)<br>
[`cljs.core/vector?`](cljs.core_vectorQMARK.md)<br>
[`cljs.core/pop`](cljs.core_pop.md)<br>
[`cljs.core/into`](cljs.core_into.md)<br>

---

Source docstring:

```
Creates a new vector containing the args.
```

Source code:

```clj
(defn vector
  [& args]
  (if (and (instance? IndexedSeq args) (zero? (.-i args)))
    (.fromArray PersistentVector (.-arr args) true)
    (vec args)))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4773-4778](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L4773-L4778)</ins>
</pre>


---

```clj
(defmacro vector
  ([] '(.-EMPTY cljs.core/PersistentVector))
  ([& xs]
    (let [cnt (count xs)]
      (if (core/< cnt 32)
        `(cljs.core/PersistentVector. nil ~cnt 5
           (.-EMPTY-NODE cljs.core/PersistentVector) (array ~@xs) nil)
        (vary-meta
          `(.fromArray cljs.core/PersistentVector (array ~@xs) true)
          assoc :tag 'cljs.core/PersistentVector)))))
```

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1696-1705](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/core.clj#L1696-L1705)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector"]))
```

```clj
{:description "Creates a new vector containing `args`.",
 :ns "cljs.core",
 :name "vector",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vec"
           "cljs.core/vector?"
           "cljs.core/pop"
           "cljs.core/into"],
 :full-name-encode "cljs.core_vector",
 :source {:code "(defn vector\n  [& args]\n  (if (and (instance? IndexedSeq args) (zero? (.-i args)))\n    (.fromArray PersistentVector (.-arr args) true)\n    (vec args)))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4773 4778]},
 :extra-sources ({:code "(defmacro vector\n  ([] '(.-EMPTY cljs.core/PersistentVector))\n  ([& xs]\n    (let [cnt (count xs)]\n      (if (core/< cnt 32)\n        `(cljs.core/PersistentVector. nil ~cnt 5\n           (.-EMPTY-NODE cljs.core/PersistentVector) (array ~@xs) nil)\n        (vary-meta\n          `(.fromArray cljs.core/PersistentVector (array ~@xs) true)\n          assoc :tag 'cljs.core/PersistentVector)))))",
                  :repo "clojurescript",
                  :tag "r3153",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1696 1705]}),
 :full-name "cljs.core/vector",
 :clj-symbol "clojure.core/vector",
 :docstring "Creates a new vector containing the args."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vector.cljsdoc)
</pre>

