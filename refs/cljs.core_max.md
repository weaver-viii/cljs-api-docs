## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/max

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/max</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/max)
</td>
</tr>
</table>

 <samp>
(__max__ x)<br>
</samp>
 <samp>
(__max__ x y)<br>
</samp>
 <samp>
(__max__ x y & more)<br>
</samp>

---

Returns the greatest number argument.

---


See Also:

[`cljs.core/min`](cljs.core_min.md)<br>
[`cljs.core/max-key`](cljs.core_max-key.md)<br>

---

Source docstring:

```
Returns the greatest of the nums.
```

Source code:

```clj
(defn ^number max
  ([x] x)
  ([x y] (cljs.core/max x y))
  ([x y & more]
   (reduce max (cljs.core/max x y) more)))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2184-2189](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L2184-L2189)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric max
  ([x] x)
  ([x y] `(let [x# ~x, y# ~y]
            (~'js* "((~{} > ~{}) ? ~{} : ~{})" x# y# x# y#)))
  ([x y & more] `(max (max ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:542-546](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/core.clj#L542-L546)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/max"]))
```

```clj
{:description "Returns the greatest number argument.",
 :return-type number,
 :ns "cljs.core",
 :name "max",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/min" "cljs.core/max-key"],
 :full-name-encode "cljs.core_max",
 :source {:code "(defn ^number max\n  ([x] x)\n  ([x y] (cljs.core/max x y))\n  ([x y & more]\n   (reduce max (cljs.core/max x y) more)))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2184 2189]},
 :extra-sources ({:code "(defmacro ^::ana/numeric max\n  ([x] x)\n  ([x y] `(let [x# ~x, y# ~y]\n            (~'js* \"((~{} > ~{}) ? ~{} : ~{})\" x# y# x# y#)))\n  ([x y & more] `(max (max ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r3211",
                  :filename "src/clj/cljs/core.clj",
                  :lines [542 546]}),
 :full-name "cljs.core/max",
 :clj-symbol "clojure.core/max",
 :docstring "Returns the greatest of the nums."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_max.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_max.cljsdoc)
</pre>

