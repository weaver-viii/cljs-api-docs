## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-negate

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate)
</td>
</tr>
</table>

 <samp>
(__unchecked-negate__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-negate [x]
  (cljs.core/unchecked-negate x))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1793-1794](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L1793-L1794)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-negate
  ([x] `(- ~x)))
```

 <pre>
clojurescript @ r2261
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:413-414](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/core.clj#L413-L414)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-negate"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-negate",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-negate",
 :source {:code "(defn unchecked-negate [x]\n  (cljs.core/unchecked-negate x))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1793 1794]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-negate\n  ([x] `(- ~x)))",
                  :repo "clojurescript",
                  :tag "r2261",
                  :filename "src/clj/cljs/core.clj",
                  :lines [413 414]}),
 :full-name "cljs.core/unchecked-negate",
 :clj-symbol "clojure.core/unchecked-negate"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-negate.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-negate.cljsdoc)
</pre>

