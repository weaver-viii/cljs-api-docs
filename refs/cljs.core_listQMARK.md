## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list?)
</td>
</tr>
</table>

 <samp>
(__list?__ x)<br>
</samp>

---

Returns true if `x` is a list, false otherwise.

---


See Also:

[`cljs.core/seq?`](cljs.core_seqQMARK.md)<br>
[`cljs.core/sequential?`](cljs.core_sequentialQMARK.md)<br>
[`cljs.core/coll?`](cljs.core_collQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean list? [x]
  (satisfies? IList x))
```

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2084-2085](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L2084-L2085)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list?"]))
```

```clj
{:description "Returns true if `x` is a list, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "list?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/sequential?" "cljs.core/coll?"],
 :full-name-encode "cljs.core_listQMARK",
 :source {:code "(defn ^boolean list? [x]\n  (satisfies? IList x))",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2084 2085]},
 :full-name "cljs.core/list?",
 :clj-symbol "clojure.core/list?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_listQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_listQMARK.cljsdoc)
</pre>

