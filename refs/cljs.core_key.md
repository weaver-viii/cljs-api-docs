## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/key)
</td>
</tr>
</table>

 <samp>
(__key__ map-entry)<br>
</samp>

---

Returns the key of the map entry.

---


See Also:

[`cljs.core/keys`](cljs.core_keys.md)<br>

---

Source docstring:

```
Returns the key of the map entry.
```

Source code:

```clj
(defn key
  [map-entry]
  (-key map-entry))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6262-6265](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L6262-L6265)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/key"]))
```

```clj
{:description "Returns the key of the map entry.",
 :ns "cljs.core",
 :name "key",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core_key",
 :source {:code "(defn key\n  [map-entry]\n  (-key map-entry))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6262 6265]},
 :full-name "cljs.core/key",
 :clj-symbol "clojure.core/key",
 :docstring "Returns the key of the map entry."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_key.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_key.cljsdoc)
</pre>

