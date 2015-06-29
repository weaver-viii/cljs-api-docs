## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Var

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Var</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Var.java)
</td>
</tr>
</table>

 <samp>
(__Var.__ val sym _meta)<br>
</samp>

---





Source code:

```clj
(deftype Var [val sym _meta]
  IDeref
  (-deref [_] val)
  IMeta
  (-meta [_] _meta))
```

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:626-630](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L626-L630)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Var"]))
```

```clj
{:ns "cljs.core",
 :name "Var",
 :signature ["[val sym _meta]"],
 :history [["+" "0.0-2496"]],
 :type "type",
 :full-name-encode "cljs.core_Var",
 :source {:code "(deftype Var [val sym _meta]\n  IDeref\n  (-deref [_] val)\n  IMeta\n  (-meta [_] _meta))",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [626 630]},
 :full-name "cljs.core/Var",
 :clj-symbol "clojure.lang/Var"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Var.cljsdoc)
</pre>

