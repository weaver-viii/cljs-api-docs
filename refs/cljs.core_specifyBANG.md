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




Source docstring:

```
Identical to reify but mutates its first argument.
```

Source code:

```clj
(defmacro specify!
  [expr & impls]
  (let [x (with-meta (gensym "x") {:extend :instance})]
    `(let [~x ~expr]
       (extend-type ~x ~@impls)
       ~x)))
```

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:687-693](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/core.clj#L687-L693)</ins>
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
 :signature ["[expr & impls]"],
 :history [["+" "0.0-2156"]],
 :type "macro",
 :full-name-encode "cljs.core_specifyBANG",
 :source {:code "(defmacro specify!\n  [expr & impls]\n  (let [x (with-meta (gensym \"x\") {:extend :instance})]\n    `(let [~x ~expr]\n       (extend-type ~x ~@impls)\n       ~x)))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/core.clj",
          :lines [687 693]},
 :full-name "cljs.core/specify!",
 :docstring "Identical to reify but mutates its first argument."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_specifyBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_specifyBANG.cljsdoc)
</pre>

