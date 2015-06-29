## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key->js

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__key->js__ k)<br>
</samp>

---





Source code:

```clj
(defn key->js [k]
  (if (satisfies? IEncodeJS k)
    (-clj->js k)
    (if (or (string? k)
            (number? k)
            (keyword? k)
            (symbol? k))
      (clj->js k)
      (pr-str k))))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7695-7703](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L7695-L7703)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/key->js"]))
```

```clj
{:ns "cljs.core",
 :name "key->js",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn key->js [k]\n  (if (satisfies? IEncodeJS k)\n    (-clj->js k)\n    (if (or (string? k)\n            (number? k)\n            (keyword? k)\n            (symbol? k))\n      (clj->js k)\n      (pr-str k))))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7695 7703]},
 :full-name "cljs.core/key->js",
 :full-name-encode "cljs.core_key-GTjs",
 :history [["+" "0.0-1798"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_key-GTjs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_key-GTjs.cljsdoc)
</pre>

