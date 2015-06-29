## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/empty?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty?)
</td>
</tr>
</table>

 <samp>
(__empty?__ coll)<br>
</samp>

---

Returns true if `coll` has no items - same as `(not (seq coll))`.

Please use the idiom `(seq x)` rather than `(not (empty? x))`.

---


See Also:

[`cljs.core/seq`](cljs.core_seq.md)<br>

---

Source docstring:

```
Returns true if coll has no items - same as (not (seq coll)).
Please use the idiom (seq x) rather than (not (empty? x))
```

Source code:

```clj
(defn ^boolean empty?
  [coll] (or (nil? coll)
             (not (seq coll))))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1498-1502](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L1498-L1502)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/empty?"]))
```

```clj
{:description "Returns true if `coll` has no items - same as `(not (seq coll))`.\n\nPlease use the idiom `(seq x)` rather than `(not (empty? x))`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "empty?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq"],
 :full-name-encode "cljs.core_emptyQMARK",
 :source {:code "(defn ^boolean empty?\n  [coll] (or (nil? coll)\n             (not (seq coll))))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1498 1502]},
 :full-name "cljs.core/empty?",
 :clj-symbol "clojure.core/empty?",
 :docstring "Returns true if coll has no items - same as (not (seq coll)).\nPlease use the idiom (seq x) rather than (not (empty? x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_emptyQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_emptyQMARK.cljsdoc)
</pre>

