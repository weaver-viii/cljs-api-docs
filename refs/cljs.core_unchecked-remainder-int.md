## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-remainder-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-remainder-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-remainder-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-remainder-int__ x n)<br>
</samp>

---





Source code:

```clj
(defn unchecked-remainder-int [x n]
  (cljs.core/unchecked-remainder-int x n))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1571-1572](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1571-L1572)</ins>
</pre>


---

```clj
(defmacro unchecked-remainder-int
  ([x n] `(mod ~x ~n)))
```

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:378-379](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L378-L379)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-remainder-int"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-remainder-int",
 :signature ["[x n]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-remainder-int",
 :source {:code "(defn unchecked-remainder-int [x n]\n  (cljs.core/unchecked-remainder-int x n))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1571 1572]},
 :extra-sources ({:code "(defmacro unchecked-remainder-int\n  ([x n] `(mod ~x ~n)))",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [378 379]}),
 :full-name "cljs.core/unchecked-remainder-int",
 :clj-symbol "clojure.core/unchecked-remainder-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-remainder-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-remainder-int.cljsdoc)
</pre>

