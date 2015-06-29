## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/indexed?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__indexed?__ x)<br>
</samp>

---




Source docstring:

```
Returns true if coll implements nth in constant time
```

Source code:

```clj
(defn ^boolean indexed?
  [x] (satisfies? IIndexed x))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:990-992](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L990-L992)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/indexed?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "indexed?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_indexedQMARK",
 :source {:code "(defn ^boolean indexed?\n  [x] (satisfies? IIndexed x))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [990 992]},
 :full-name "cljs.core/indexed?",
 :docstring "Returns true if coll implements nth in constant time"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_indexedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_indexedQMARK.cljsdoc)
</pre>

