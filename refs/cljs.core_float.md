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
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1889](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L1889)</ins>
</pre>


---

```clj
(defmacro float [x] x)
```

 <pre>
clojurescript @ r2505
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:362](https://github.com/clojure/clojurescript/blob/r2505/src/clj/cljs/core.clj#L362)</ins>
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
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1889]},
 :extra-sources ({:code "(defmacro float [x] x)",
                  :repo "clojurescript",
                  :tag "r2505",
                  :filename "src/clj/cljs/core.clj",
                  :lines [362]}),
 :full-name "cljs.core/float",
 :clj-symbol "clojure.core/float"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_float.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_float.cljsdoc)
</pre>

