## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/namespace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/namespace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/namespace)
</td>
</tr>
</table>

 <samp>
(__namespace__ x)<br>
</samp>

---




Source docstring:

```
Returns the namespace String of a symbol or keyword, or nil if not present.
```

Source code:

```clj
(defn namespace
  [x]
  (if (or (keyword? x) (symbol? x))
    (let [i (.lastIndexOf x "/")]
      (when (> i -1)
        (subs x 2 i)))
    (throw (js/Error. (str "Doesn't support namespace: " x)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5322-5329](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5322-L5329)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/namespace"]))
```

```clj
{:ns "cljs.core",
 :name "namespace",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_namespace",
 :source {:code "(defn namespace\n  [x]\n  (if (or (keyword? x) (symbol? x))\n    (let [i (.lastIndexOf x \"/\")]\n      (when (> i -1)\n        (subs x 2 i)))\n    (throw (js/Error. (str \"Doesn't support namespace: \" x)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5322 5329]},
 :full-name "cljs.core/namespace",
 :clj-symbol "clojure.core/namespace",
 :docstring "Returns the namespace String of a symbol or keyword, or nil if not present."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_namespace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_namespace.cljsdoc)
</pre>
