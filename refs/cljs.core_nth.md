## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nth

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nth)
</td>
</tr>
</table>

 <samp>
(__nth__ coll n)<br>
</samp>
 <samp>
(__nth__ coll n not-found)<br>
</samp>

---

Returns the value at index `n` or `not-found` if the index is out of bounds.

`nth` will throw an exception if `n` is out of bounds and `not-found` is not
supplied.

`nth` works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For
Sequences, `nth` takes O(n) time.

---


See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/second`](cljs.core_second.md)<br>
[`cljs.core/nthnext`](cljs.core_nthnext.md)<br>
[`cljs.core/get`](cljs.core_get.md)<br>

---

Source docstring:

```
Returns the value at the index. get returns nil if index out of
bounds, nth throws an exception unless not-found is supplied.  nth
also works for strings, arrays, regex Matchers and Lists, and,
in O(n) time, for sequences.
```

Source code:

```clj
(defn nth
  ([coll n]
    (cond
      (not (number? n))
      (throw (js/Error. "index argument to nth must be a number"))

      (nil? coll)
      coll

      (implements? IIndexed coll)
      (-nth ^not-native coll n)

      (array? coll)
      (when (< n (.-length coll))
        (aget coll n))

      (string? coll)
      (when (< n (.-length coll))
        (aget coll n))

      (native-satisfies? IIndexed coll)
      (-nth coll n)

      (satisfies? ISeq coll)
      (linear-traversal-nth coll n)

      :else
      (throw (js/Error. (str "nth not supported on this type "
                          (type->str (type coll)))))))
  ([coll n not-found]
    (cond
      (not (number? n))
      (throw (js/Error. "index argument to nth must be a number."))

      (nil? coll)
      not-found

      (implements? IIndexed coll)
      (-nth ^not-native coll n not-found)

      (array? coll)
      (if (< n (.-length coll))
        (aget coll n)
        not-found)

      (string? coll)
      (if (< n (.-length coll))
        (aget coll n)
        not-found)

      (native-satisfies? IIndexed coll)
      (-nth coll n)

      (satisfies? ISeq coll)
      (linear-traversal-nth coll n not-found)

      :else
      (throw (js/Error. (str "nth not supported on this type "
                          (type->str (type coll))))))))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1495-1557](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L1495-L1557)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nth"]))
```

```clj
{:description "Returns the value at index `n` or `not-found` if the index is out of bounds.\n\n`nth` will throw an exception if `n` is out of bounds and `not-found` is not\nsupplied.\n\n`nth` works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For\nSequences, `nth` takes O(n) time.",
 :ns "cljs.core",
 :name "nth",
 :signature ["[coll n]" "[coll n not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/second"
           "cljs.core/nthnext"
           "cljs.core/get"],
 :full-name-encode "cljs.core_nth",
 :source {:code "(defn nth\n  ([coll n]\n    (cond\n      (not (number? n))\n      (throw (js/Error. \"index argument to nth must be a number\"))\n\n      (nil? coll)\n      coll\n\n      (implements? IIndexed coll)\n      (-nth ^not-native coll n)\n\n      (array? coll)\n      (when (< n (.-length coll))\n        (aget coll n))\n\n      (string? coll)\n      (when (< n (.-length coll))\n        (aget coll n))\n\n      (native-satisfies? IIndexed coll)\n      (-nth coll n)\n\n      (satisfies? ISeq coll)\n      (linear-traversal-nth coll n)\n\n      :else\n      (throw (js/Error. (str \"nth not supported on this type \"\n                          (type->str (type coll)))))))\n  ([coll n not-found]\n    (cond\n      (not (number? n))\n      (throw (js/Error. \"index argument to nth must be a number.\"))\n\n      (nil? coll)\n      not-found\n\n      (implements? IIndexed coll)\n      (-nth ^not-native coll n not-found)\n\n      (array? coll)\n      (if (< n (.-length coll))\n        (aget coll n)\n        not-found)\n\n      (string? coll)\n      (if (< n (.-length coll))\n        (aget coll n)\n        not-found)\n\n      (native-satisfies? IIndexed coll)\n      (-nth coll n)\n\n      (satisfies? ISeq coll)\n      (linear-traversal-nth coll n not-found)\n\n      :else\n      (throw (js/Error. (str \"nth not supported on this type \"\n                          (type->str (type coll))))))))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1495 1557]},
 :full-name "cljs.core/nth",
 :clj-symbol "clojure.core/nth",
 :docstring "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nth.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nth.cljsdoc)
</pre>

