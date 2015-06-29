## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-inc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-inc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-inc)
</td>
</tr>
</table>

 <samp>
(__unchecked-inc__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-inc [x]
  (cljs.core/unchecked-inc x))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1830-1831](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L1830-L1831)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-inc
  ([x] `(inc ~x)))
```

 <pre>
clojurescript @ r2342
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:401-402](https://github.com/clojure/clojurescript/blob/r2342/src/clj/cljs/core.clj#L401-L402)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-inc"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-inc",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-inc",
 :source {:code "(defn unchecked-inc [x]\n  (cljs.core/unchecked-inc x))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1830 1831]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-inc\n  ([x] `(inc ~x)))",
                  :repo "clojurescript",
                  :tag "r2342",
                  :filename "src/clj/cljs/core.clj",
                  :lines [401 402]}),
 :full-name "cljs.core/unchecked-inc",
 :clj-symbol "clojure.core/unchecked-inc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-inc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-inc.cljsdoc)
</pre>

