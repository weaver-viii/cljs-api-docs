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
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2221](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L2221)</ins>
</pre>


---

```clj
(defmacro short [x] x)
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:429](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/core.clj#L429)</ins>
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
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2221]},
 :extra-sources ({:code "(defmacro short [x] x)",
                  :repo "clojurescript",
                  :tag "r3297",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [429]}),
 :full-name "cljs.core/short",
 :clj-symbol "clojure.core/short"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_short.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_short.cljsdoc)
</pre>

