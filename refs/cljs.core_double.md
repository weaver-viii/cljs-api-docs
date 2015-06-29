## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/double

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/double</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/double)
</td>
</tr>
</table>

 <samp>
(__double__ x)<br>
</samp>

---





Source code:

```clj
(defn double [x] x)
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1537](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L1537)</ins>
</pre>


---

```clj
(defmacro double [x] x)
```

 <pre>
clojurescript @ r2069
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:339](https://github.com/clojure/clojurescript/blob/r2069/src/clj/cljs/core.clj#L339)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/double"]))
```

```clj
{:ns "cljs.core",
 :name "double",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_double",
 :source {:code "(defn double [x] x)",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1537]},
 :extra-sources ({:code "(defmacro double [x] x)",
                  :repo "clojurescript",
                  :tag "r2069",
                  :filename "src/clj/cljs/core.clj",
                  :lines [339]}),
 :full-name "cljs.core/double",
 :clj-symbol "clojure.core/double"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_double.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_double.cljsdoc)
</pre>

