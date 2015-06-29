## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/interpose

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/interpose</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/interpose)
</td>
</tr>
</table>

 <samp>
(__interpose__ sep coll)<br>
</samp>

---

Returns a lazy seq of the elements of `coll` separated by `sep`.

---


See Also:

[`cljs.core/interleave`](cljs.core_interleave.md)<br>
[`clojure.string/join`](clojure.string_join.md)<br>

---

Source docstring:

```
Returns a lazy seq of the elements of coll separated by sep
```

Source code:

```clj
(defn interpose
  ([sep]
    (fn [rf]
      (let [started (volatile! false)]
        (fn
          ([] (rf))
          ([result] (rf result))
          ([result input]
            (if @started
              (let [sepr (rf result sep)]
                (if (reduced? sepr)
                  sepr
                  (rf sepr input)))
              (do
                (vreset! started true)
                (rf result input))))))))
  ([sep coll] (drop 1 (interleave (repeat sep) coll))))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4200-4217](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L4200-L4217)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/interpose"]))
```

```clj
{:description "Returns a lazy seq of the elements of `coll` separated by `sep`.",
 :ns "cljs.core",
 :name "interpose",
 :signature ["[sep coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/interleave" "clojure.string/join"],
 :full-name-encode "cljs.core_interpose",
 :source {:code "(defn interpose\n  ([sep]\n    (fn [rf]\n      (let [started (volatile! false)]\n        (fn\n          ([] (rf))\n          ([result] (rf result))\n          ([result input]\n            (if @started\n              (let [sepr (rf result sep)]\n                (if (reduced? sepr)\n                  sepr\n                  (rf sepr input)))\n              (do\n                (vreset! started true)\n                (rf result input))))))))\n  ([sep coll] (drop 1 (interleave (repeat sep) coll))))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4200 4217]},
 :full-name "cljs.core/interpose",
 :clj-symbol "clojure.core/interpose",
 :docstring "Returns a lazy seq of the elements of coll separated by sep"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_interpose.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_interpose.cljsdoc)
</pre>

