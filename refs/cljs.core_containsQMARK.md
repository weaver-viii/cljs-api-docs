## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/contains?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/contains?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/contains?)
</td>
</tr>
</table>

 <samp>
(__contains?__ coll k)<br>
</samp>

---

Returns true if `k` is present in `coll`, otherwise returns false.

Note that for numerically indexed collections like vectors and arrays, this
tests if the numeric key is within the range of indexes.

`contains?` operates in constant or logarithmic time; it will not perform a
linear search for a value.

---


See Also:

[`cljs.core/some`](cljs.core_some.md)<br>
[`cljs.core/get`](cljs.core_get.md)<br>

---

Source docstring:

```
Returns true if key is present in the given collection, otherwise
returns false.  Note that for numerically indexed collections like
vectors and arrays, this tests if the numeric key is within the
range of indexes. 'contains?' operates constant or logarithmic time;
it will not perform a linear search for a value.  See also 'some'.
```

Source code:

```clj
(defn ^boolean contains?
  [coll v]
  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)
    false
    true))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1618-1627](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L1618-L1627)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/contains?"]))
```

```clj
{:description "Returns true if `k` is present in `coll`, otherwise returns false.\n\nNote that for numerically indexed collections like vectors and arrays, this\ntests if the numeric key is within the range of indexes.\n\n`contains?` operates in constant or logarithmic time; it will not perform a\nlinear search for a value.",
 :return-type boolean,
 :ns "cljs.core",
 :name "contains?",
 :signature ["[coll k]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/some" "cljs.core/get"],
 :full-name-encode "cljs.core_containsQMARK",
 :source {:code "(defn ^boolean contains?\n  [coll v]\n  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)\n    false\n    true))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1618 1627]},
 :full-name "cljs.core/contains?",
 :clj-symbol "clojure.core/contains?",
 :docstring "Returns true if key is present in the given collection, otherwise\nreturns false.  Note that for numerically indexed collections like\nvectors and arrays, this tests if the numeric key is within the\nrange of indexes. 'contains?' operates constant or logarithmic time;\nit will not perform a linear search for a value.  See also 'some'."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_containsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_containsQMARK.cljsdoc)
</pre>

