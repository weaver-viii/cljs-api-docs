## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/select-keys

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/select-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/select-keys)
</td>
</tr>
</table>

 <samp>
(__select-keys__ map keys)<br>
</samp>

---

Returns a map containing only those entries in `map` whose key is in `keys`.

---



Source docstring:

```
Returns a map containing only those entries in map whose key is in keys
```

Source code:

```clj
(defn select-keys
  [map keyseq]
    (loop [ret {} keys (seq keyseq)]
      (if keys
        (let [key   (first keys)
              entry (get map key ::not-found)]
          (recur
           (if (not= entry ::not-found)
             (assoc ret key entry)
             ret)
           (next keys)))
        (with-meta ret (meta map)))))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7333-7345](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L7333-L7345)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/select-keys"]))
```

```clj
{:description "Returns a map containing only those entries in `map` whose key is in `keys`.",
 :ns "cljs.core",
 :name "select-keys",
 :signature ["[map keys]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_select-keys",
 :source {:code "(defn select-keys\n  [map keyseq]\n    (loop [ret {} keys (seq keyseq)]\n      (if keys\n        (let [key   (first keys)\n              entry (get map key ::not-found)]\n          (recur\n           (if (not= entry ::not-found)\n             (assoc ret key entry)\n             ret)\n           (next keys)))\n        (with-meta ret (meta map)))))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7333 7345]},
 :full-name "cljs.core/select-keys",
 :clj-symbol "clojure.core/select-keys",
 :docstring "Returns a map containing only those entries in map whose key is in keys"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_select-keys.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_select-keys.cljsdoc)
</pre>

