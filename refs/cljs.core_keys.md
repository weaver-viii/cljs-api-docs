## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keys

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keys)
</td>
</tr>
</table>

 <samp>
(__keys__ hash-map)<br>
</samp>

---

Returns a sequence of the keys in `hash-map`.

---


See Also:

[`cljs.core/vals`](cljs.core_vals.md)<br>

---

Source docstring:

```
Returns a sequence of the map's keys.
```

Source code:

```clj
(defn keys
  [hash-map]
  (when-let [mseq (seq hash-map)]
    (KeySeq. mseq nil)))
```

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5934-5938](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L5934-L5938)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keys"]))
```

```clj
{:description "Returns a sequence of the keys in `hash-map`.",
 :ns "cljs.core",
 :name "keys",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vals"],
 :full-name-encode "cljs.core_keys",
 :source {:code "(defn keys\n  [hash-map]\n  (when-let [mseq (seq hash-map)]\n    (KeySeq. mseq nil)))",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5934 5938]},
 :full-name "cljs.core/keys",
 :clj-symbol "clojure.core/keys",
 :docstring "Returns a sequence of the map's keys."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keys.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keys.cljsdoc)
</pre>

