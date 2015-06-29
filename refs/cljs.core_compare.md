## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/compare

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare)
</td>
</tr>
</table>

 <samp>
(__compare__ x y)<br>
</samp>

---

Comparator.

Returns a negative number, zero, or a positive number when `x` is logically
"less than", "equal to", or "greater than" `y`.

Uses `IComparable` if available and `google.array.defaultCompare` for objects of
the same type. nil is treated as a special case and is always less than any
other object.

---

Example:

```clj
(compare 10 12)
;;=> -1

(compare 12 10)
;;=> 1

(compare 10 10)
;;=> 0

(compare 10 nil)
;;=>  1

(compare 10 (list 1 2 3))
;; Error: compare on non-nil objects of different types
```

---

See Also:

[`cljs.core/sort-by`](cljs.core_sort-by.md)<br>
[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>
[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>

---

Source docstring:

```
Comparator. Returns a negative number, zero, or a positive number
 when x is logically 'less than', 'equal to', or 'greater than'
 y. Uses IComparable if available and google.array.defaultCompare for objects
of the same type and special-cases nil to be less than any other object.
```

Source code:

```clj
(defn compare
  [x y]
  (cond
   (identical? x y) 0

   (nil? x) -1

   (nil? y) 1

   (identical? (type x) (type y))
   (if (satisfies? IComparable x false)
     (-compare ^not-native x y)
     (garray/defaultCompare x y))

   :else
   (throw (js/Error. "compare on non-nil objects of different types"))))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1238-1257](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L1238-L1257)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/compare"]))
```

```clj
{:description "Comparator.\n\nReturns a negative number, zero, or a positive number when `x` is logically\n\"less than\", \"equal to\", or \"greater than\" `y`.\n\nUses `IComparable` if available and `google.array.defaultCompare` for objects of\nthe same type. nil is treated as a special case and is always less than any\nother object.",
 :ns "cljs.core",
 :name "compare",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort-by"
           "cljs.core/sorted-set-by"
           "cljs.core/sorted-map-by"],
 :full-name-encode "cljs.core_compare",
 :source {:code "(defn compare\n  [x y]\n  (cond\n   (identical? x y) 0\n\n   (nil? x) -1\n\n   (nil? y) 1\n\n   (identical? (type x) (type y))\n   (if (satisfies? IComparable x false)\n     (-compare ^not-native x y)\n     (garray/defaultCompare x y))\n\n   :else\n   (throw (js/Error. \"compare on non-nil objects of different types\"))))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1238 1257]},
 :examples [{:id "e13fa0",
             :content "```clj\n(compare 10 12)\n;;=> -1\n\n(compare 12 10)\n;;=> 1\n\n(compare 10 10)\n;;=> 0\n\n(compare 10 nil)\n;;=>  1\n\n(compare 10 (list 1 2 3))\n;; Error: compare on non-nil objects of different types\n```"}],
 :full-name "cljs.core/compare",
 :clj-symbol "clojure.core/compare",
 :docstring "Comparator. Returns a negative number, zero, or a positive number\n when x is logically 'less than', 'equal to', or 'greater than'\n y. Uses IComparable if available and google.array.defaultCompare for objects\nof the same type and special-cases nil to be less than any other object."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_compare.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_compare.cljsdoc)
</pre>

