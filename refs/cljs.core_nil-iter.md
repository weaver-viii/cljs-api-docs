## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nil-iter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__nil-iter__)<br>
</samp>

---





Source code:

```clj
(defn nil-iter []
  (reify
    Object
    (hasNext [_] false)
    (next [_] (js/Error. "No such element"))
    (remove [_] (js/Error. "Unsupported operation"))))
```

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3002-3007](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L3002-L3007)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nil-iter"]))
```

```clj
{:ns "cljs.core",
 :name "nil-iter",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn nil-iter []\n  (reify\n    Object\n    (hasNext [_] false)\n    (next [_] (js/Error. \"No such element\"))\n    (remove [_] (js/Error. \"Unsupported operation\"))))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3002 3007]},
 :full-name "cljs.core/nil-iter",
 :full-name-encode "cljs.core_nil-iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nil-iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nil-iter.cljsdoc)
</pre>

