## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-obj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-obj__ & keyvals)<br>
</samp>

---

Returns a new JavaScript object using the supplied mappings.

`keyvals` must be an even number of forms.

---

Example:

```clj
(js-obj "foo" 1 "bar" 2)
;;=> #js {:foo 1, :bar 2}
```

---

See Also:

[`cljs.core/array`](cljs.core_array.md)<br>

---

Source docstring:

```
Create JavaSript object from an even number arguments representing
interleaved keys and values.
```

Source code:

```clj
(defn js-obj
  ([]
     (cljs.core/js-obj))
  ([& keyvals]
     (apply gobject/create keyvals)))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1792-1798](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L1792-L1798)</ins>
</pre>


---

```clj
(defmacro js-obj [& rest]
  (let [sym-or-str? (fn [x] (core/or (core/symbol? x) (core/string? x)))
        filter-on-keys (fn [f coll]
                         (->> coll
                              (filter (fn [[k _]] (f k)))
                              (into {})))
        kvs (into {} (map vec (partition 2 rest)))
        sym-pairs (filter-on-keys core/symbol? kvs)
        expr->local (zipmap
                     (filter (complement sym-or-str?) (keys kvs))
                     (repeatedly gensym))
        obj (gensym "obj")]
    `(let [~@(apply concat (clojure.set/map-invert expr->local))
           ~obj ~(js-obj* (filter-on-keys core/string? kvs))]
       ~@(map (fn [[k v]] `(aset ~obj ~k ~v)) sym-pairs)
       ~@(map (fn [[k v]] `(aset ~obj ~v ~(core/get kvs k))) expr->local)
       ~obj)))
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1750-1766](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/core.clj#L1750-L1766)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-obj"]))
```

```clj
{:description "Returns a new JavaScript object using the supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "js-obj",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/array"],
 :full-name-encode "cljs.core_js-obj",
 :source {:code "(defn js-obj\n  ([]\n     (cljs.core/js-obj))\n  ([& keyvals]\n     (apply gobject/create keyvals)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1792 1798]},
 :extra-sources ({:code "(defmacro js-obj [& rest]\n  (let [sym-or-str? (fn [x] (core/or (core/symbol? x) (core/string? x)))\n        filter-on-keys (fn [f coll]\n                         (->> coll\n                              (filter (fn [[k _]] (f k)))\n                              (into {})))\n        kvs (into {} (map vec (partition 2 rest)))\n        sym-pairs (filter-on-keys core/symbol? kvs)\n        expr->local (zipmap\n                     (filter (complement sym-or-str?) (keys kvs))\n                     (repeatedly gensym))\n        obj (gensym \"obj\")]\n    `(let [~@(apply concat (clojure.set/map-invert expr->local))\n           ~obj ~(js-obj* (filter-on-keys core/string? kvs))]\n       ~@(map (fn [[k v]] `(aset ~obj ~k ~v)) sym-pairs)\n       ~@(map (fn [[k v]] `(aset ~obj ~v ~(core/get kvs k))) expr->local)\n       ~obj)))",
                  :repo "clojurescript",
                  :tag "r3165",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1750 1766]}),
 :examples [{:id "657cd7",
             :content "```clj\n(js-obj \"foo\" 1 \"bar\" 2)\n;;=> #js {:foo 1, :bar 2}\n```"}],
 :full-name "cljs.core/js-obj",
 :docstring "Create JavaSript object from an even number arguments representing\ninterleaved keys and values."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-obj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-obj.cljsdoc)
</pre>

