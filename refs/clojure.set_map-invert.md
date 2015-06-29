## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/map-invert

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/map-invert</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/map-invert)
</td>
</tr>
</table>

 <samp>
(__map-invert__ m)<br>
</samp>

---




Source docstring:

```
Returns the map with the vals mapped to the keys.
```

Source code:

```clj
(defn map-invert
  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:97-99](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/clojure/set.cljs#L97-L99)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/map-invert"]))
```

```clj
{:ns "clojure.set",
 :name "map-invert",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_map-invert",
 :source {:code "(defn map-invert\n  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/clojure/set.cljs",
          :lines [97 99]},
 :full-name "clojure.set/map-invert",
 :clj-symbol "clojure.set/map-invert",
 :docstring "Returns the map with the vals mapped to the keys."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_map-invert.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_map-invert.cljsdoc)
</pre>

