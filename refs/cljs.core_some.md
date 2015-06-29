## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/some

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some)
</td>
</tr>
</table>

 <samp>
(__some__ pred coll)<br>
</samp>

---

Returns the first logical true value of `(pred x)` for any `x` in `coll`, else
nil.

A common idiom is to use a set as pred, for example this will return `:fred` if
`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`

---


See Also:

[`cljs.core/every?`](cljs.core_everyQMARK.md)<br>
[`cljs.core/not-any?`](cljs.core_not-anyQMARK.md)<br>
[`cljs.core/keep`](cljs.core_keep.md)<br>
[`cljs.core/keep-indexed`](cljs.core_keep-indexed.md)<br>
[`cljs.core/some-fn`](cljs.core_some-fn.md)<br>

---

Source docstring:

```
Returns the first logical true value of (pred x) for any x in coll,
else nil.  One common idiom is to use a set as pred, for example
this will return :fred if :fred is in the sequence, otherwise nil:
(some #{:fred} coll)
```

Source code:

```clj
(defn some
  [pred coll]
    (when (seq coll)
      (or (pred (first coll)) (recur pred (next coll)))))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2827-2834](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L2827-L2834)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some"]))
```

```clj
{:description "Returns the first logical true value of `(pred x)` for any `x` in `coll`, else\nnil.\n\nA common idiom is to use a set as pred, for example this will return `:fred` if\n`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`",
 :ns "cljs.core",
 :name "some",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every?"
           "cljs.core/not-any?"
           "cljs.core/keep"
           "cljs.core/keep-indexed"
           "cljs.core/some-fn"],
 :full-name-encode "cljs.core_some",
 :source {:code "(defn some\n  [pred coll]\n    (when (seq coll)\n      (or (pred (first coll)) (recur pred (next coll)))))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2827 2834]},
 :full-name "cljs.core/some",
 :clj-symbol "clojure.core/some",
 :docstring "Returns the first logical true value of (pred x) for any x in coll,\nelse nil.  One common idiom is to use a set as pred, for example\nthis will return :fred if :fred is in the sequence, otherwise nil:\n(some #{:fred} coll)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_some.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_some.cljsdoc)
</pre>

