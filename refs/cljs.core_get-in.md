## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get-in

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-in)
</td>
</tr>
</table>

 <samp>
(__get-in__ m ks)<br>
</samp>
 <samp>
(__get-in__ m ks not-found)<br>
</samp>

---

Returns the value in a nested associative structure, where `ks` is a sequence of
keys.

Returns nil if the key is not found, or `not-found` if supplied.

---


See Also:

[`cljs.core/assoc-in`](cljs.core_assoc-in.md)<br>
[`cljs.core/update-in`](cljs.core_update-in.md)<br>
[`cljs.core/find`](cljs.core_find.md)<br>
[`cljs.core/get`](cljs.core_get.md)<br>

---

Source docstring:

```
Returns the value in a nested associative structure,
where ks is a sequence of keys. Returns nil if the key is not present,
or the not-found value if supplied.
```

Source code:

```clj
(defn get-in
  ([m ks]
     (get-in m ks nil))
  ([m ks not-found]
     (loop [sentinel lookup-sentinel
            m m
            ks (seq ks)]
       (if ks
         (if (not (satisfies? ILookup m))
           not-found
           (let [m (get m (first ks) sentinel)]
             (if (identical? sentinel m)
               not-found
               (recur sentinel m (next ks)))))
         m))))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3169-3188](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L3169-L3188)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get-in"]))
```

```clj
{:description "Returns the value in a nested associative structure, where `ks` is a sequence of\nkeys.\n\nReturns nil if the key is not found, or `not-found` if supplied.",
 :ns "cljs.core",
 :name "get-in",
 :signature ["[m ks]" "[m ks not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc-in"
           "cljs.core/update-in"
           "cljs.core/find"
           "cljs.core/get"],
 :full-name-encode "cljs.core_get-in",
 :source {:code "(defn get-in\n  ([m ks]\n     (get-in m ks nil))\n  ([m ks not-found]\n     (loop [sentinel lookup-sentinel\n            m m\n            ks (seq ks)]\n       (if ks\n         (if (not (satisfies? ILookup m))\n           not-found\n           (let [m (get m (first ks) sentinel)]\n             (if (identical? sentinel m)\n               not-found\n               (recur sentinel m (next ks)))))\n         m))))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3169 3188]},
 :full-name "cljs.core/get-in",
 :clj-symbol "clojure.core/get-in",
 :docstring "Returns the value in a nested associative structure,\nwhere ks is a sequence of keys. Returns nil if the key is not present,\nor the not-found value if supplied."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_get-in.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_get-in.cljsdoc)
</pre>

