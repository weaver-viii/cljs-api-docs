## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get)
</td>
</tr>
</table>

 <samp>
(__get__ o k)<br>
</samp>
 <samp>
(__get__ o k not-found)<br>
</samp>

---

Returns the value mapped to key `k`.

Returns `not-found` or nil if `k` is not present in `o`.

---


See Also:

[`cljs.core/get-in`](cljs.core_get-in.md)<br>

---

Source docstring:

```
Returns the value mapped to key, not-found or nil if key not present.
```

Source code:

```clj
(defn get
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:769-774](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L769-L774)</ins>
</pre>


---

```clj
(defmacro get
  ([coll k]
     `(-lookup ~coll ~k nil))
  ([coll k not-found]
     `(-lookup ~coll ~k ~not-found)))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:358-362](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/core.clj#L358-L362)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get"]))
```

```clj
{:description "Returns the value mapped to key `k`.\n\nReturns `not-found` or nil if `k` is not present in `o`.",
 :ns "cljs.core",
 :name "get",
 :signature ["[o k]" "[o k not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/get-in"],
 :full-name-encode "cljs.core_get",
 :source {:code "(defn get\n  ([o k]\n     (-lookup o k))\n  ([o k not-found]\n     (-lookup o k not-found)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [769 774]},
 :extra-sources ({:code "(defmacro get\n  ([coll k]\n     `(-lookup ~coll ~k nil))\n  ([coll k not-found]\n     `(-lookup ~coll ~k ~not-found)))",
                  :repo "clojurescript",
                  :tag "r1450",
                  :filename "src/clj/cljs/core.clj",
                  :lines [358 362]}),
 :full-name "cljs.core/get",
 :clj-symbol "clojure.core/get",
 :docstring "Returns the value mapped to key, not-found or nil if key not present."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_get.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_get.cljsdoc)
</pre>

