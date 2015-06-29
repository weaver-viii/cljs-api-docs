## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IComparable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IComparable
  (^number -compare [x y]))
```

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:382-383](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L382-L383)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IComparable"]))
```

```clj
{:ns "cljs.core",
 :name "IComparable",
 :type "protocol",
 :full-name-encode "cljs.core_IComparable",
 :source {:code "(defprotocol IComparable\n  (^number -compare [x y]))",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [382 383]},
 :methods [{:name "-compare", :signature ["[x y]"], :docstring nil}],
 :full-name "cljs.core/IComparable",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IComparable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IComparable.cljsdoc)
</pre>

