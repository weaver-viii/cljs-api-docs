## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defonce

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defonce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defonce)
</td>
</tr>
</table>

 <samp>
(__defonce__ x init)<br>
</samp>

---





Source code:

```clj
(defmacro defonce [x init]
  `(when-not (exists? ~x)
     (def ~x ~init)))
```

 <pre>
clojurescript @ r2199
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:65-67](https://github.com/clojure/clojurescript/blob/r2199/src/clj/cljs/core.clj#L65-L67)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defonce"]))
```

```clj
{:ns "cljs.core",
 :name "defonce",
 :signature ["[x init]"],
 :history [["+" "0.0-2156"]],
 :type "macro",
 :full-name-encode "cljs.core_defonce",
 :source {:code "(defmacro defonce [x init]\n  `(when-not (exists? ~x)\n     (def ~x ~init)))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/clj/cljs/core.clj",
          :lines [65 67]},
 :full-name "cljs.core/defonce",
 :clj-symbol "clojure.core/defonce"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defonce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defonce.cljsdoc)
</pre>

