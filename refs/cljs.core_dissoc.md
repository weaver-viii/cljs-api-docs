## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dissoc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc)
</td>
</tr>
</table>

 <samp>
(__dissoc__ coll)<br>
</samp>
 <samp>
(__dissoc__ coll k)<br>
</samp>
 <samp>
(__dissoc__ coll k & ks)<br>
</samp>

---

dissoc(iate)

Returns a new map that does not contain a mapping for key(s).

Has no effect on the map type (hashed/sorted).

---

Example:

```clj
(dissoc {:key "value" :key2 "value2"} :key)
;;=> {:key2 "value2"}
```

---

See Also:

[`cljs.core/assoc`](cljs.core_assoc.md)<br>
[`cljs.core/disj`](cljs.core_disj.md)<br>
[`cljs.core/select-keys`](cljs.core_select-keys.md)<br>

---

Source docstring:

```
dissoc[iate]. Returns a new map of the same (hashed/sorted) type,
that does not contain a mapping for key(s).
```

Source code:

```clj
(defn dissoc
  ([coll] coll)
  ([coll k]
    (when-not (nil? coll)
      (-dissoc coll k)))
  ([coll k & ks]
    (when-not (nil? coll)
      (let [ret (dissoc coll k)]
        (if ks
          (recur ret (first ks) (next ks))
          ret)))))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1314-1326](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L1314-L1326)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dissoc"]))
```

```clj
{:description "dissoc(iate)\n\nReturns a new map that does not contain a mapping for key(s).\n\nHas no effect on the map type (hashed/sorted).",
 :ns "cljs.core",
 :name "dissoc",
 :signature ["[coll]" "[coll k]" "[coll k & ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc" "cljs.core/disj" "cljs.core/select-keys"],
 :full-name-encode "cljs.core_dissoc",
 :source {:code "(defn dissoc\n  ([coll] coll)\n  ([coll k]\n    (when-not (nil? coll)\n      (-dissoc coll k)))\n  ([coll k & ks]\n    (when-not (nil? coll)\n      (let [ret (dissoc coll k)]\n        (if ks\n          (recur ret (first ks) (next ks))\n          ret)))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1314 1326]},
 :examples [{:id "fd6ae9",
             :content "```clj\n(dissoc {:key \"value\" :key2 \"value2\"} :key)\n;;=> {:key2 \"value2\"}\n```"}],
 :full-name "cljs.core/dissoc",
 :clj-symbol "clojure.core/dissoc",
 :docstring "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,\nthat does not contain a mapping for key(s)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dissoc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dissoc.cljsdoc)
</pre>

