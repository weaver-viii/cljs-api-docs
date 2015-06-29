## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/iterable?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2356"><img valign="middle" alt="[+] 0.0-2356" src="https://img.shields.io/badge/+-0.0--2356-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__iterable?__ x)<br>
</samp>

---





Source code:

```clj
(defn iterable? [x]
  (satisfies? IIterable x))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:693-694](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L693-L694)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iterable?"]))
```

```clj
{:ns "cljs.core",
 :name "iterable?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn iterable? [x]\n  (satisfies? IIterable x))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [693 694]},
 :full-name "cljs.core/iterable?",
 :full-name-encode "cljs.core_iterableQMARK",
 :history [["+" "0.0-2356"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iterableQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iterableQMARK.cljsdoc)
</pre>

