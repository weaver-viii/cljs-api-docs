## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/peek

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/peek</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/peek)
</td>
</tr>
</table>

 <samp>
(__peek__ coll)<br>
</samp>

---

Returns the first element of a list; same as `first`.

Returns the last element of a vector, and much more efficient than using `last`.

Returns nil if `coll` is empty.

---

Example:

With vectors:

```clj
(peek [1 2 3])
;;=> 3

(peek [1 2])
;;=> 2

(peek [1])
;;=> 1

(peek [])
;;=> nil
```

---
Example:

With lists:

```clj
(peek '(1 2 3))
;;=> 1

(peek '(1 2))
;;=> 1

(peek '(1))
;;=> 1

(peek '())
;;=> nil
```

---

See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/pop`](cljs.core_pop.md)<br>
[`cljs.core/conj`](cljs.core_conj.md)<br>

---

Source docstring:

```
For a list or queue, same as first, for a vector, same as, but much
more efficient than, last. If the collection is empty, returns nil.
```

Source code:

```clj
(defn peek
  [coll]
  (when-not (nil? coll)
    (-peek coll)))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1714-1719](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L1714-L1719)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/peek"]))
```

```clj
{:description "Returns the first element of a list; same as `first`.\n\nReturns the last element of a vector, and much more efficient than using `last`.\n\nReturns nil if `coll` is empty.",
 :ns "cljs.core",
 :name "peek",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first" "cljs.core/pop" "cljs.core/conj"],
 :full-name-encode "cljs.core_peek",
 :source {:code "(defn peek\n  [coll]\n  (when-not (nil? coll)\n    (-peek coll)))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1714 1719]},
 :examples [{:id "4abc4c",
             :content "With vectors:\n\n```clj\n(peek [1 2 3])\n;;=> 3\n\n(peek [1 2])\n;;=> 2\n\n(peek [1])\n;;=> 1\n\n(peek [])\n;;=> nil\n```"}
            {:id "d50bd0",
             :content "With lists:\n\n```clj\n(peek '(1 2 3))\n;;=> 1\n\n(peek '(1 2))\n;;=> 1\n\n(peek '(1))\n;;=> 1\n\n(peek '())\n;;=> nil\n```"}],
 :full-name "cljs.core/peek",
 :clj-symbol "clojure.core/peek",
 :docstring "For a list or queue, same as first, for a vector, same as, but much\nmore efficient than, last. If the collection is empty, returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_peek.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_peek.cljsdoc)
</pre>

