## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/find

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find)
</td>
</tr>
</table>

 <samp>
(__find__ coll k)<br>
</samp>

---

Returns the map entry for key `k`, or nil if `k` is not found.

---


See Also:

[`cljs.core/get`](cljs.core_get.md)<br>
[`cljs.core/get-in`](cljs.core_get-in.md)<br>

---

Source docstring:

```
Returns the map entry for key, or nil if key not present.
```

Source code:

```clj
(defn find
  [coll k]
  (when (and (not (nil? coll))
             (associative? coll)
             (contains? coll k))
    [k (get coll k)]))
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1690-1696](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L1690-L1696)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/find"]))
```

```clj
{:description "Returns the map entry for key `k`, or nil if `k` is not found.",
 :ns "cljs.core",
 :name "find",
 :signature ["[coll k]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/get" "cljs.core/get-in"],
 :full-name-encode "cljs.core_find",
 :source {:code "(defn find\n  [coll k]\n  (when (and (not (nil? coll))\n             (associative? coll)\n             (contains? coll k))\n    [k (get coll k)]))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1690 1696]},
 :full-name "cljs.core/find",
 :clj-symbol "clojure.core/find",
 :docstring "Returns the map entry for key, or nil if key not present."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_find.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_find.cljsdoc)
</pre>

