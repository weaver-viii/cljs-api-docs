## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get-method

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-method)
</td>
</tr>
</table>

 <samp>
(__get-method__ multifn dispatch-val)<br>
</samp>

---




Source docstring:

```
Given a multimethod and a dispatch value, returns the dispatch fn
that would apply to that value, or nil if none apply and no default
```

Source code:

```clj
(defn get-method
  [multifn dispatch-val] (-get-method multifn dispatch-val))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7453-7456](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L7453-L7456)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get-method"]))
```

```clj
{:ns "cljs.core",
 :name "get-method",
 :signature ["[multifn dispatch-val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_get-method",
 :source {:code "(defn get-method\n  [multifn dispatch-val] (-get-method multifn dispatch-val))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7453 7456]},
 :full-name "cljs.core/get-method",
 :clj-symbol "clojure.core/get-method",
 :docstring "Given a multimethod and a dispatch value, returns the dispatch fn\nthat would apply to that value, or nil if none apply and no default"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_get-method.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_get-method.cljsdoc)
</pre>

