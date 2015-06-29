## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-inc-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-inc-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-inc-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-inc-int__ x)<br>
</samp>

---





Source code:

```clj
(defn ^number unchecked-inc-int [x]
  (cljs.core/unchecked-inc-int x))
```

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1575-1576](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L1575-L1576)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-inc-int
  ([x] `(inc ~x)))
```

 <pre>
clojurescript @ r2075
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:365-366](https://github.com/clojure/clojurescript/blob/r2075/src/clj/cljs/core.clj#L365-L366)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-inc-int"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-inc-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-inc-int",
 :source {:code "(defn ^number unchecked-inc-int [x]\n  (cljs.core/unchecked-inc-int x))",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1575 1576]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-inc-int\n  ([x] `(inc ~x)))",
                  :repo "clojurescript",
                  :tag "r2075",
                  :filename "src/clj/cljs/core.clj",
                  :lines [365 366]}),
 :full-name "cljs.core/unchecked-inc-int",
 :clj-symbol "clojure.core/unchecked-inc-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-inc-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-inc-int.cljsdoc)
</pre>

