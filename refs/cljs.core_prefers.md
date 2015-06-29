## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prefers

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prefers</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prefers)
</td>
</tr>
</table>

 <samp>
(__prefers__ multifn)<br>
</samp>

---




Source docstring:

```
Given a multimethod, returns a map of preferred value -> set of other values
```

Source code:

```clj
(defn prefers
  [multifn] (-prefers multifn))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9464-9466](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L9464-L9466)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prefers"]))
```

```clj
{:ns "cljs.core",
 :name "prefers",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prefers",
 :source {:code "(defn prefers\n  [multifn] (-prefers multifn))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9464 9466]},
 :full-name "cljs.core/prefers",
 :clj-symbol "clojure.core/prefers",
 :docstring "Given a multimethod, returns a map of preferred value -> set of other values"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prefers.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prefers.cljsdoc)
</pre>

