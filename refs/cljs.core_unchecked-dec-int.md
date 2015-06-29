## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-dec-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-dec-int__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-dec-int [x]
  (cljs.core/unchecked-dec-int x))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1592-1593](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L1592-L1593)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-dec-int
  ([x] `(dec ~x)))
```

 <pre>
clojurescript @ r2202
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:370-371](https://github.com/clojure/clojurescript/blob/r2202/src/clj/cljs/core.clj#L370-L371)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-dec-int"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-dec-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-dec-int",
 :source {:code "(defn unchecked-dec-int [x]\n  (cljs.core/unchecked-dec-int x))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1592 1593]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-dec-int\n  ([x] `(dec ~x)))",
                  :repo "clojurescript",
                  :tag "r2202",
                  :filename "src/clj/cljs/core.clj",
                  :lines [370 371]}),
 :full-name "cljs.core/unchecked-dec-int",
 :clj-symbol "clojure.core/unchecked-dec-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-dec-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-dec-int.cljsdoc)
</pre>

