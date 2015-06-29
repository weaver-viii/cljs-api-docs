## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-short

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-short</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-short)
</td>
</tr>
</table>

 <samp>
(__unchecked-short__ x)<br>
</samp>

---





Source code:

```clj
(defn ^number unchecked-short [x] x)
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1955](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L1955)</ins>
</pre>


---

```clj
(defmacro unchecked-short [x] x)
```

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:368](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/core.clj#L368)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-short"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-short",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-short",
 :source {:code "(defn ^number unchecked-short [x] x)",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1955]},
 :extra-sources ({:code "(defmacro unchecked-short [x] x)",
                  :repo "clojurescript",
                  :tag "r2911",
                  :filename "src/clj/cljs/core.clj",
                  :lines [368]}),
 :full-name "cljs.core/unchecked-short",
 :clj-symbol "clojure.core/unchecked-short"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-short.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-short.cljsdoc)
</pre>

