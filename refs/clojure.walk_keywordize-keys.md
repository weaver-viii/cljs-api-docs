## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/keywordize-keys

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/keywordize-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/keywordize-keys)
</td>
</tr>
</table>

 <samp>
(__keywordize-keys__ m)<br>
</samp>

---




Source docstring:

```
Recursively transforms all map keys from strings to keywords.
```

Source code:

```clj
(defn keywordize-keys
  [m]
  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]
    ;; only apply to maps
    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))
```

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:64-70](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/clojure/walk.cljs#L64-L70)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/keywordize-keys"]))
```

```clj
{:ns "clojure.walk",
 :name "keywordize-keys",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_keywordize-keys",
 :source {:code "(defn keywordize-keys\n  [m]\n  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]\n    ;; only apply to maps\n    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [64 70]},
 :full-name "clojure.walk/keywordize-keys",
 :clj-symbol "clojure.walk/keywordize-keys",
 :docstring "Recursively transforms all map keys from strings to keywords."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.walk_keywordize-keys.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk_keywordize-keys.cljsdoc)
</pre>

