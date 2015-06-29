## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/short

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/short</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/short)
</td>
</tr>
</table>

 <samp>
(__short__ x)<br>
</samp>

---





Source code:

```clj
(defn ^number short [x] x)
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2207](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L2207)</ins>
</pre>


---

```clj
(defmacro short [x] x)
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:380](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/core.clj#L380)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/short"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "short",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_short",
 :source {:code "(defn ^number short [x] x)",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2207]},
 :extra-sources ({:code "(defmacro short [x] x)",
                  :repo "clojurescript",
                  :tag "r3117",
                  :filename "src/clj/cljs/core.clj",
                  :lines [380]}),
 :full-name "cljs.core/short",
 :clj-symbol "clojure.core/short"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_short.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_short.cljsdoc)
</pre>

