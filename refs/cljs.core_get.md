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
    (when-not (nil? o)
      (cond
        (implements? ILookup o)
        (-lookup ^not-native o k)

        (array? o)
        (when (< k (.-length o))
          (aget o k))
        
        (string? o)
        (when (< k (.-length o))
          (aget o k))

        (native-satisfies? ILookup o)
        (-lookup o k)
        
        :else nil)))
  ([o k not-found]
    (if-not (nil? o)
      (cond
        (implements? ILookup o)
        (-lookup ^not-native o k not-found)

        (array? o)
        (if (< k (.-length o))
          (aget o k)
          not-found)
        
        (string? o)
        (if (< k (.-length o))
          (aget o k)
          not-found)

        (native-satisfies? ILookup o)
        (-lookup o k not-found)

        :else not-found)
      not-found)))
```

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1562-1602](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L1562-L1602)</ins>
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
 :source {:code "(defn get\n  ([o k]\n    (when-not (nil? o)\n      (cond\n        (implements? ILookup o)\n        (-lookup ^not-native o k)\n\n        (array? o)\n        (when (< k (.-length o))\n          (aget o k))\n        \n        (string? o)\n        (when (< k (.-length o))\n          (aget o k))\n\n        (native-satisfies? ILookup o)\n        (-lookup o k)\n        \n        :else nil)))\n  ([o k not-found]\n    (if-not (nil? o)\n      (cond\n        (implements? ILookup o)\n        (-lookup ^not-native o k not-found)\n\n        (array? o)\n        (if (< k (.-length o))\n          (aget o k)\n          not-found)\n        \n        (string? o)\n        (if (< k (.-length o))\n          (aget o k)\n          not-found)\n\n        (native-satisfies? ILookup o)\n        (-lookup o k not-found)\n\n        :else not-found)\n      not-found)))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1562 1602]},
 :full-name "cljs.core/get",
 :clj-symbol "clojure.core/get",
 :docstring "Returns the value mapped to key, not-found or nil if key not present."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_get.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_get.cljsdoc)
</pre>

