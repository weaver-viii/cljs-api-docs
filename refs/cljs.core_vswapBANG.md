## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vswap!

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__vswap!__ vol f & args)<br>
</samp>

---




Source docstring:

```
Non-atomically swaps the value of the volatile as if:
(apply f current-value-of-vol args). Returns the value that
was swapped in.
```

Source code:

```clj
(defmacro vswap!
  [vol f & args]
  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1687-1692](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1687-L1692)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vswap!"]))
```

```clj
{:ns "cljs.core",
 :name "vswap!",
 :signature ["[vol f & args]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.core_vswapBANG",
 :source {:code "(defmacro vswap!\n  [vol f & args]\n  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/core.clj",
          :lines [1687 1692]},
 :full-name "cljs.core/vswap!",
 :docstring "Non-atomically swaps the value of the volatile as if:\n(apply f current-value-of-vol args). Returns the value that\nwas swapped in."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vswapBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vswapBANG.cljsdoc)
</pre>

