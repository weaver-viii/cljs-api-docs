## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dispatch-fn

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-fn__ multifn)<br>
</samp>

---




Source docstring:

```
Given a multimethod, return it's dispatch-fn.
```

Source code:

```clj
(defn dispatch-fn
  [multifn] (-dispatch-fn multifn))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9498-9500](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L9498-L9500)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dispatch-fn"]))
```

```clj
{:ns "cljs.core",
 :name "dispatch-fn",
 :signature ["[multifn]"],
 :history [["+" "0.0-3165"]],
 :type "function",
 :full-name-encode "cljs.core_dispatch-fn",
 :source {:code "(defn dispatch-fn\n  [multifn] (-dispatch-fn multifn))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9498 9500]},
 :full-name "cljs.core/dispatch-fn",
 :docstring "Given a multimethod, return it's dispatch-fn."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dispatch-fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dispatch-fn.cljsdoc)
</pre>

