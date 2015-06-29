## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/float

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/float</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/float)
</td>
</tr>
</table>

 <samp>
(__float__ x)<br>
</samp>

---





Source code:

```clj
(defn ^number float [x] x)
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2229](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L2229)</ins>
</pre>


---

```clj
(defmacro float [x] x)
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:430](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/core.clj#L430)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/float"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "float",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_float",
 :source {:code "(defn ^number float [x] x)",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2229]},
 :extra-sources ({:code "(defmacro float [x] x)",
                  :repo "clojurescript",
                  :tag "r3308",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [430]}),
 :full-name "cljs.core/float",
 :clj-symbol "clojure.core/float"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_float.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_float.cljsdoc)
</pre>

