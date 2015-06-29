## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/next

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/next</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/next)
</td>
</tr>
</table>

 <samp>
(__next__ coll)<br>
</samp>

---

Returns a sequence of the items after the first and calls `seq` on its argument.

Returns nil if `coll` is empty.

---

Example:

```clj
(next [1 2 3])
;;=> (2 3)

(next [1 2])
;;=> (2)

(next [1])
;;=> nil

(next [])
;;=> nil
```

---

See Also:

[`cljs.core/rest`](cljs.core_rest.md)<br>
[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/fnext`](cljs.core_fnext.md)<br>

---

Source docstring:

```
Returns a seq of the items after the first. Calls seq on its
argument.  If there are no more items, returns nil
```

Source code:

```clj
(defn next
  [coll]
  (if (coercive-not= coll nil)
    (if (satisfies? ISeq coll)
      (let [coll (-rest coll)]
        (if (coercive-not= coll nil)
          (if (satisfies? ASeq coll)
            coll
            (-seq coll))))
      (seq (rest coll)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:538-549](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L538-L549)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/next"]))
```

```clj
{:description "Returns a sequence of the items after the first and calls `seq` on its argument.\n\nReturns nil if `coll` is empty.",
 :ns "cljs.core",
 :name "next",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rest" "cljs.core/first" "cljs.core/fnext"],
 :full-name-encode "cljs.core_next",
 :source {:code "(defn next\n  [coll]\n  (if (coercive-not= coll nil)\n    (if (satisfies? ISeq coll)\n      (let [coll (-rest coll)]\n        (if (coercive-not= coll nil)\n          (if (satisfies? ASeq coll)\n            coll\n            (-seq coll))))\n      (seq (rest coll)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [538 549]},
 :examples [{:id "7db59a",
             :content "```clj\n(next [1 2 3])\n;;=> (2 3)\n\n(next [1 2])\n;;=> (2)\n\n(next [1])\n;;=> nil\n\n(next [])\n;;=> nil\n```"}],
 :full-name "cljs.core/next",
 :clj-symbol "clojure.core/next",
 :docstring "Returns a seq of the items after the first. Calls seq on its\nargument.  If there are no more items, returns nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_next.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_next.cljsdoc)
</pre>

