## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-set)
</td>
</tr>
</table>

 <samp>
(__hash-set__)<br>
</samp>
 <samp>
(__hash-set__ & keys)<br>
</samp>

---

Returns a new hash set with supplied `keys`.

Any equal keys are handled as if by repeated uses of `conj`.

---


See Also:

[`cljs.core/set`](cljs.core_set.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>

---


Source code:

```clj
(defn hash-set
  ([] cljs.core.PersistentHashSet/EMPTY)
  ([& keys]
    (loop [in (seq keys)
           out (transient cljs.core.PersistentHashSet/EMPTY)]
      (if (seq in)
        (recur (next in) (conj! out (first in)))
        (persistent! out)))))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5764-5771](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5764-L5771)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-set"]))
```

```clj
{:description "Returns a new hash set with supplied `keys`.\n\nAny equal keys are handled as if by repeated uses of `conj`.",
 :ns "cljs.core",
 :name "hash-set",
 :signature ["[]" "[& keys]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core_hash-set",
 :source {:code "(defn hash-set\n  ([] cljs.core.PersistentHashSet/EMPTY)\n  ([& keys]\n    (loop [in (seq keys)\n           out (transient cljs.core.PersistentHashSet/EMPTY)]\n      (if (seq in)\n        (recur (next in) (conj! out (first in)))\n        (persistent! out)))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5764 5771]},
 :full-name "cljs.core/hash-set",
 :clj-symbol "clojure.core/hash-set"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-set.cljsdoc)
</pre>

