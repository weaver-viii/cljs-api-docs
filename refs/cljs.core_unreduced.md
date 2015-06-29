## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unreduced

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unreduced__ x)<br>
</samp>

---




Source docstring:

```
If x is reduced?, returns (deref x), else returns x
```

Source code:

```clj
(defn unreduced
  [x]
  (if (reduced? x) (deref x) x))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1145-1148](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L1145-L1148)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unreduced"]))
```

```clj
{:ns "cljs.core",
 :name "unreduced",
 :signature ["[x]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core_unreduced",
 :source {:code "(defn unreduced\n  [x]\n  (if (reduced? x) (deref x) x))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1145 1148]},
 :full-name "cljs.core/unreduced",
 :docstring "If x is reduced?, returns (deref x), else returns x"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unreduced.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unreduced.cljsdoc)
</pre>

