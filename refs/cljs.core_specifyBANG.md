## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/specify!

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__specify!__ expr & impls)<br>
</samp>

---





Source code:

```clj
(defmacro specify! [expr & impls]
  (let [x (with-meta (gensym "x") {:extend :instance})]
    `(let [~x ~expr]
       (extend-type ~x ~@impls)
       ~x)))
```

 <pre>
clojurescript @ r2342
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:645-649](https://github.com/clojure/clojurescript/blob/r2342/src/clj/cljs/core.clj#L645-L649)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/specify!"]))
```

```clj
{:ns "cljs.core",
 :name "specify!",
 :type "macro",
 :signature ["[expr & impls]"],
 :source {:code "(defmacro specify! [expr & impls]\n  (let [x (with-meta (gensym \"x\") {:extend :instance})]\n    `(let [~x ~expr]\n       (extend-type ~x ~@impls)\n       ~x)))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/clj/cljs/core.clj",
          :lines [645 649]},
 :full-name "cljs.core/specify!",
 :full-name-encode "cljs.core_specifyBANG",
 :history [["+" "0.0-2156"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_specifyBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_specifyBANG.cljsdoc)
</pre>

