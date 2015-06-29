## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq)
</td>
</tr>
</table>

 <samp>
(__seq__ coll)<br>
</samp>

---

Returns a sequence on the collection. If the collection is empty, returns nil.

`(seq nil)` returns nil.

`seq` also works on strings.

---


See Also:

[`cljs.core/seq?`](cljs.core_seqQMARK.md)<br>
[`cljs.core/empty?`](cljs.core_emptyQMARK.md)<br>

---

Source docstring:

```
Returns a seq on the collection. If the collection is
empty, returns nil.  (seq nil) returns nil. seq also works on
Strings.
```

Source code:

```clj
(defn ^seq seq
  [coll]
  (when-not (nil? coll)
    (cond
      (satisfies? ISeqable coll false)
      (-seq ^not-native coll)

      (array? coll)
      (when-not (zero? (alength coll))
        (IndexedSeq. coll 0))

      (string? coll)
      (when-not (zero? (alength coll))
        (IndexedSeq. coll 0))

      (type_satisfies_ ISeqable coll)
      (-seq coll)

      :else (throw (js/Error. (str coll "is not ISeqable"))))))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:423-444](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L423-L444)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq"]))
```

```clj
{:description "Returns a sequence on the collection. If the collection is empty, returns nil.\n\n`(seq nil)` returns nil.\n\n`seq` also works on strings.",
 :return-type seq,
 :ns "cljs.core",
 :name "seq",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/empty?"],
 :full-name-encode "cljs.core_seq",
 :source {:code "(defn ^seq seq\n  [coll]\n  (when-not (nil? coll)\n    (cond\n      (satisfies? ISeqable coll false)\n      (-seq ^not-native coll)\n\n      (array? coll)\n      (when-not (zero? (alength coll))\n        (IndexedSeq. coll 0))\n\n      (string? coll)\n      (when-not (zero? (alength coll))\n        (IndexedSeq. coll 0))\n\n      (type_satisfies_ ISeqable coll)\n      (-seq coll)\n\n      :else (throw (js/Error. (str coll \"is not ISeqable\"))))))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [423 444]},
 :full-name "cljs.core/seq",
 :clj-symbol "clojure.core/seq",
 :docstring "Returns a seq on the collection. If the collection is\nempty, returns nil.  (seq nil) returns nil. seq also works on\nStrings."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_seq.cljsdoc)
</pre>

