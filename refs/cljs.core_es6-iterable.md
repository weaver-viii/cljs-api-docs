## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/es6-iterable

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__es6-iterable__ ty)<br>
</samp>

---





Source code:

```clj
(defmacro es6-iterable [ty]
  `(aset (.-prototype ~ty) cljs.core/ITER_SYMBOL
     (fn []
       (this-as this#
         (cljs.core/es6-iterator this#)))))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1669-1673](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/core.clj#L1669-L1673)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-iterable"]))
```

```clj
{:ns "cljs.core",
 :name "es6-iterable",
 :type "macro",
 :signature ["[ty]"],
 :source {:code "(defmacro es6-iterable [ty]\n  `(aset (.-prototype ~ty) cljs.core/ITER_SYMBOL\n     (fn []\n       (this-as this#\n         (cljs.core/es6-iterator this#)))))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/core.clj",
          :lines [1669 1673]},
 :full-name "cljs.core/es6-iterable",
 :full-name-encode "cljs.core_es6-iterable",
 :history [["+" "0.0-2411"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_es6-iterable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_es6-iterable.cljsdoc)
</pre>

