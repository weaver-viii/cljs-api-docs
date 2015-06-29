## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seq?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq?)
</td>
</tr>
</table>

 <samp>
(__seq?__ x)<br>
</samp>

---

Returns true if `x` is a sequence, false otherwise.

All collections can be converted into a sequence using `seq`.

---


See Also:

[`cljs.core/seq`](cljs.core_seq.md)<br>
[`cljs.core/sequential?`](cljs.core_sequentialQMARK.md)<br>
[`cljs.core/vector?`](cljs.core_vectorQMARK.md)<br>
[`cljs.core/coll?`](cljs.core_collQMARK.md)<br>
[`cljs.core/list?`](cljs.core_listQMARK.md)<br>
[`cljs.core/map?`](cljs.core_mapQMARK.md)<br>
[`cljs.core/set?`](cljs.core_setQMARK.md)<br>

---

Source docstring:

```
Return true if s satisfies ISeq
```

Source code:

```clj
(defn ^boolean seq?
  [s]
  (if (nil? s)
    false
    (satisfies? ISeq s)))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1845-1850](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L1845-L1850)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq?"]))
```

```clj
{:description "Returns true if `x` is a sequence, false otherwise.\n\nAll collections can be converted into a sequence using `seq`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "seq?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq"
           "cljs.core/sequential?"
           "cljs.core/vector?"
           "cljs.core/coll?"
           "cljs.core/list?"
           "cljs.core/map?"
           "cljs.core/set?"],
 :full-name-encode "cljs.core_seqQMARK",
 :source {:code "(defn ^boolean seq?\n  [s]\n  (if (nil? s)\n    false\n    (satisfies? ISeq s)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1845 1850]},
 :full-name "cljs.core/seq?",
 :clj-symbol "clojure.core/seq?",
 :docstring "Return true if s satisfies ISeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_seqQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_seqQMARK.cljsdoc)
</pre>

