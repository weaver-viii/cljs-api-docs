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
     (when-not (nil? coll)
       (cond
         (satisfies? IIndexed coll false)
         (-nth ^not-native coll (.floor js/Math n))

         (array? coll)
         (when (< n (.-length coll))
           (aget coll n))
         
         (string? coll)
         (when (< n (.-length coll))
           (aget coll n))
         
         :else
         (linear-traversal-nth coll (.floor js/Math n)))))
  ([coll n not-found]
     (if-not (nil? coll)
       (cond
         (satisfies? IIndexed coll false)
         (-nth ^not-native coll (.floor js/Math n) not-found)

         (array? coll)
         (if (< n (.-length coll))
           (aget coll n)
           not-found)
         
         (string? coll)
         (if (< n (.-length coll))
           (aget coll n)
           not-found)
         
         :else
         (linear-traversal-nth coll (.floor js/Math n) not-found))
       not-found)))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:813-852](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L813-L852)</ins>
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
 :source {:code "(defn nth\n  ([coll n]\n     (when-not (nil? coll)\n       (cond\n         (satisfies? IIndexed coll false)\n         (-nth ^not-native coll (.floor js/Math n))\n\n         (array? coll)\n         (when (< n (.-length coll))\n           (aget coll n))\n         \n         (string? coll)\n         (when (< n (.-length coll))\n           (aget coll n))\n         \n         :else\n         (linear-traversal-nth coll (.floor js/Math n)))))\n  ([coll n not-found]\n     (if-not (nil? coll)\n       (cond\n         (satisfies? IIndexed coll false)\n         (-nth ^not-native coll (.floor js/Math n) not-found)\n\n         (array? coll)\n         (if (< n (.-length coll))\n           (aget coll n)\n           not-found)\n         \n         (string? coll)\n         (if (< n (.-length coll))\n           (aget coll n)\n           not-found)\n         \n         :else\n         (linear-traversal-nth coll (.floor js/Math n) not-found))\n       not-found)))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/core.cljs",
          :lines [813 852]},
 :full-name "cljs.core/nth",
 :clj-symbol "clojure.core/nth",
 :docstring "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nth.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nth.cljsdoc)
</pre>

