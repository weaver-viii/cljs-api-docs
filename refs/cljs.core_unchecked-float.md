## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-float

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-float</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-float)
</td>
</tr>
</table>

 <samp>
(__unchecked-float__ x)<br>
</samp>

---





Source code:

```clj
(defn ^number unchecked-float [x] x)
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1744](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L1744)</ins>
</pre>


---

```clj
(defmacro unchecked-float [x] x)
```

 <pre>
clojurescript @ r2268
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:383](https://github.com/clojure/clojurescript/blob/r2268/src/clj/cljs/core.clj#L383)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-float"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-float",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-float",
 :source {:code "(defn ^number unchecked-float [x] x)",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1744]},
 :extra-sources ({:code "(defmacro unchecked-float [x] x)",
                  :repo "clojurescript",
                  :tag "r2268",
                  :filename "src/clj/cljs/core.clj",
                  :lines [383]}),
 :full-name "cljs.core/unchecked-float",
 :clj-symbol "clojure.core/unchecked-float"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-float.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-float.cljsdoc)
</pre>

