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


Source code:

```clj
(defn vector [& args]
  (if (instance? IndexedSeq args)
    (cljs.core.PersistentVector.fromArray (.-arr args) true)
    (vec args)))
```

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3393-3396](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L3393-L3396)</ins>
</pre>


---

```clj
(defmacro vector
  ([] `cljs.core.PersistentVector.EMPTY)
  ([& xs]
    (let [cnt (count xs)]
      (if (core/< cnt 32)
        `(cljs.core.PersistentVector. nil ~cnt 5
           cljs.core.PersistentVector.EMPTY_NODE (array ~@xs) nil)
        (vary-meta
          `(cljs.core.PersistentVector.fromArray (array ~@xs) true)
          assoc :tag 'cljs.core/PersistentVector)))))
```

 <pre>
clojurescript @ r2080
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1305-1314](https://github.com/clojure/clojurescript/blob/r2080/src/clj/cljs/core.clj#L1305-L1314)</ins>
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
 :source {:code "(defn vector [& args]\n  (if (instance? IndexedSeq args)\n    (cljs.core.PersistentVector.fromArray (.-arr args) true)\n    (vec args)))",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3393 3396]},
 :extra-sources ({:code "(defmacro vector\n  ([] `cljs.core.PersistentVector.EMPTY)\n  ([& xs]\n    (let [cnt (count xs)]\n      (if (core/< cnt 32)\n        `(cljs.core.PersistentVector. nil ~cnt 5\n           cljs.core.PersistentVector.EMPTY_NODE (array ~@xs) nil)\n        (vary-meta\n          `(cljs.core.PersistentVector.fromArray (array ~@xs) true)\n          assoc :tag 'cljs.core/PersistentVector)))))",
                  :repo "clojurescript",
                  :tag "r2080",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1305 1314]}),
 :full-name "cljs.core/vector",
 :clj-symbol "clojure.core/vector"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vector.cljsdoc)
</pre>

