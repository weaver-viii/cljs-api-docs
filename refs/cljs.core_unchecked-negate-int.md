## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-negate-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-negate-int__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-negate-int [x]
  (cljs.core/unchecked-negate-int x))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1566-1567](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1566-L1567)</ins>
</pre>


---

```clj
(defmacro unchecked-negate-int
  ([x] `(- ~x)))
```

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:375-376](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L375-L376)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-negate-int"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-negate-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-negate-int",
 :source {:code "(defn unchecked-negate-int [x]\n  (cljs.core/unchecked-negate-int x))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1566 1567]},
 :extra-sources ({:code "(defmacro unchecked-negate-int\n  ([x] `(- ~x)))",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [375 376]}),
 :full-name "cljs.core/unchecked-negate-int",
 :clj-symbol "clojure.core/unchecked-negate-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-negate-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-negate-int.cljsdoc)
</pre>

