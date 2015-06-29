## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol?)
</td>
</tr>
</table>

 <samp>
(__symbol?__ x)<br>
</samp>

---





Source code:

```clj
(defn ^boolean symbol? [x]
  (instance? Symbol x))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:530-531](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L530-L531)</ins>
</pre>


---

```clj
(defmacro symbol? [x]
  (bool-expr `(instance? Symbol ~x)))
```

 <pre>
clojurescript @ r2268
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:348-349](https://github.com/clojure/clojurescript/blob/r2268/src/clj/cljs/core.clj#L348-L349)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbolQMARK",
 :source {:code "(defn ^boolean symbol? [x]\n  (instance? Symbol x))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [530 531]},
 :extra-sources ({:code "(defmacro symbol? [x]\n  (bool-expr `(instance? Symbol ~x)))",
                  :repo "clojurescript",
                  :tag "r2268",
                  :filename "src/clj/cljs/core.clj",
                  :lines [348 349]}),
 :full-name "cljs.core/symbol?",
 :clj-symbol "clojure.core/symbol?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_symbolQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_symbolQMARK.cljsdoc)
</pre>

