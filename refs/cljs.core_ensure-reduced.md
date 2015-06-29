## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ensure-reduced

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ensure-reduced__ x)<br>
</samp>

---




Source docstring:

```
If x is already reduced?, returns it, else returns (reduced x)
```

Source code:

```clj
(defn ensure-reduced
  [x]
  (if (reduced? x) x (reduced x)))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:839-842](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L839-L842)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ensure-reduced"]))
```

```clj
{:ns "cljs.core",
 :name "ensure-reduced",
 :signature ["[x]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core_ensure-reduced",
 :source {:code "(defn ensure-reduced\n  [x]\n  (if (reduced? x) x (reduced x)))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [839 842]},
 :full-name "cljs.core/ensure-reduced",
 :docstring "If x is already reduced?, returns it, else returns (reduced x)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ensure-reduced.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ensure-reduced.cljsdoc)
</pre>
