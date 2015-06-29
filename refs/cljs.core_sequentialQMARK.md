## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sequential?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sequential?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequential?)
</td>
</tr>
</table>

 <samp>
(__sequential?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `ISequential` protocol, false otherwise.

Lists and vectors are sequential.

---


See Also:

[`cljs.core/seq?`](cljs.core_seqQMARK.md)<br>
[`cljs.core/coll?`](cljs.core_collQMARK.md)<br>

---

Source docstring:

```
Returns true if coll satisfies ISequential
```

Source code:

```clj
(defn ^boolean sequential?
  [x] (satisfies? ISequential x))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1522-1524](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L1522-L1524)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sequential?"]))
```

```clj
{:description "Returns true if `coll` implements the `ISequential` protocol, false otherwise.\n\nLists and vectors are sequential.",
 :return-type boolean,
 :ns "cljs.core",
 :name "sequential?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/coll?"],
 :full-name-encode "cljs.core_sequentialQMARK",
 :source {:code "(defn ^boolean sequential?\n  [x] (satisfies? ISequential x))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1522 1524]},
 :full-name "cljs.core/sequential?",
 :clj-symbol "clojure.core/sequential?",
 :docstring "Returns true if coll satisfies ISequential"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sequentialQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sequentialQMARK.cljsdoc)
</pre>

