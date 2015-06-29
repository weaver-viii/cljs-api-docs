## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/select

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/select</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/select)
</td>
</tr>
</table>

 <samp>
(__select__ pred xset)<br>
</samp>

---

Returns a set of the elements for which `pred` is true.

---


See Also:

[`cljs.core/filter`](cljs.core_filter.md)<br>

---

Source docstring:

```
Returns a set of the elements for which pred is true
```

Source code:

```clj
(defn select
  [pred xset]
    (reduce (fn [s k] (if (pred k) s (disj s k)))
            xset xset))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:61-65](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/set.cljs#L61-L65)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/select"]))
```

```clj
{:description "Returns a set of the elements for which `pred` is true.",
 :ns "clojure.set",
 :name "select",
 :signature ["[pred xset]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/filter"],
 :full-name-encode "clojure.set_select",
 :source {:code "(defn select\n  [pred xset]\n    (reduce (fn [s k] (if (pred k) s (disj s k)))\n            xset xset))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/clojure/set.cljs",
          :lines [61 65]},
 :full-name "clojure.set/select",
 :clj-symbol "clojure.set/select",
 :docstring "Returns a set of the elements for which pred is true"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_select.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_select.cljsdoc)
</pre>

