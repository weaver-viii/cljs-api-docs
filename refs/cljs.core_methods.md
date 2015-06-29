## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/methods

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/methods)
</td>
</tr>
</table>

 <samp>
(__methods__ multifn)<br>
</samp>

---




Source docstring:

```
Given a multimethod, returns a map of dispatch values -> dispatch fns
```

Source code:

```clj
(defn methods
  [multifn] (-methods multifn))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7843-7845](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L7843-L7845)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/methods"]))
```

```clj
{:ns "cljs.core",
 :name "methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_methods",
 :source {:code "(defn methods\n  [multifn] (-methods multifn))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7843 7845]},
 :full-name "cljs.core/methods",
 :clj-symbol "clojure.core/methods",
 :docstring "Given a multimethod, returns a map of dispatch values -> dispatch fns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_methods.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_methods.cljsdoc)
</pre>

