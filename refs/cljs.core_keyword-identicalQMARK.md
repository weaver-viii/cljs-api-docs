## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keyword-identical?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1877"><img valign="middle" alt="[+] 0.0-1877" src="https://img.shields.io/badge/+-0.0--1877-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__keyword-identical?__ x y)<br>
</samp>

---





Source code:

```clj
(defn ^boolean keyword-identical? [x y]
  (if (identical? x y)
    true
    (if (and (keyword? x)
             (keyword? y))
      (identical? (.-fqn x) (.-fqn y))
      false)))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2167-2173](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L2167-L2173)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword-identical?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "keyword-identical?",
 :signature ["[x y]"],
 :history [["+" "0.0-1877"]],
 :type "function",
 :full-name-encode "cljs.core_keyword-identicalQMARK",
 :source {:code "(defn ^boolean keyword-identical? [x y]\n  (if (identical? x y)\n    true\n    (if (and (keyword? x)\n             (keyword? y))\n      (identical? (.-fqn x) (.-fqn y))\n      false)))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2167 2173]},
 :full-name "cljs.core/keyword-identical?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keyword-identicalQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keyword-identicalQMARK.cljsdoc)
</pre>

