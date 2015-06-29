## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-index-of

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3178"><img valign="middle" alt="[+] 0.0-3178" src="https://img.shields.io/badge/+-0.0--3178-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-index-of__ arr k)<br>
</samp>

---





Source code:

```clj
(defn array-index-of [arr k]
  (cond
    (keyword? k) (array-index-of-keyword? arr k)

    (or ^boolean (goog/isString k) (number? k))
    (array-index-of-identical? arr k)

    (symbol? k) (array-index-of-symbol? arr k)

    (nil? k)
    (array-index-of-nil? arr)

    :else (array-index-of-equiv? arr k)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5554-5566](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L5554-L5566)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-index-of"]))
```

```clj
{:ns "cljs.core",
 :name "array-index-of",
 :type "function",
 :signature ["[arr k]"],
 :source {:code "(defn array-index-of [arr k]\n  (cond\n    (keyword? k) (array-index-of-keyword? arr k)\n\n    (or ^boolean (goog/isString k) (number? k))\n    (array-index-of-identical? arr k)\n\n    (symbol? k) (array-index-of-symbol? arr k)\n\n    (nil? k)\n    (array-index-of-nil? arr)\n\n    :else (array-index-of-equiv? arr k)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5554 5566]},
 :full-name "cljs.core/array-index-of",
 :full-name-encode "cljs.core_array-index-of",
 :history [["+" "0.0-3178"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-index-of.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-index-of.cljsdoc)
</pre>

