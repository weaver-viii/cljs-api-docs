## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/default-dispatch-val

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__default-dispatch-val__ multifn)<br>
</samp>

---




Source docstring:

```
Given a multimethod, return it's default-dispatch-val.
```

Source code:

```clj
(defn default-dispatch-val
  [multifn] (-default-dispatch-val multifn))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9480-9482](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L9480-L9482)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/default-dispatch-val"]))
```

```clj
{:ns "cljs.core",
 :name "default-dispatch-val",
 :signature ["[multifn]"],
 :history [["+" "0.0-3165"]],
 :type "function",
 :full-name-encode "cljs.core_default-dispatch-val",
 :source {:code "(defn default-dispatch-val\n  [multifn] (-default-dispatch-val multifn))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9480 9482]},
 :full-name "cljs.core/default-dispatch-val",
 :docstring "Given a multimethod, return it's default-dispatch-val."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_default-dispatch-val.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_default-dispatch-val.cljsdoc)
</pre>

