## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/meta)
</td>
</tr>
</table>

 <samp>
(__meta__ o)<br>
</samp>

---




Source docstring:

```
Returns the metadata of obj, returns nil if there is no metadata.
```

Source code:

```clj
(defn meta
  [o]
  (when (and (not (nil? o))
             (satisfies? IMeta o))
    (-meta o)))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1279-1284](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L1279-L1284)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/meta"]))
```

```clj
{:ns "cljs.core",
 :name "meta",
 :signature ["[o]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_meta",
 :source {:code "(defn meta\n  [o]\n  (when (and (not (nil? o))\n             (satisfies? IMeta o))\n    (-meta o)))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1279 1284]},
 :full-name "cljs.core/meta",
 :clj-symbol "clojure.core/meta",
 :docstring "Returns the metadata of obj, returns nil if there is no metadata."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_meta.cljsdoc)
</pre>

