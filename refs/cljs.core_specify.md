## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/specify

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2138"><img valign="middle" alt="[+] 0.0-2138" src="https://img.shields.io/badge/+-0.0--2138-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__specify__ expr & impls)<br>
</samp>

---





Source code:

```clj
(defmacro specify [expr & impls]
  `(cljs.core/specify! (cljs.core/clone ~expr)
     ~@impls))
```

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:637-639](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L637-L639)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/specify"]))
```

```clj
{:ns "cljs.core",
 :name "specify",
 :type "macro",
 :signature ["[expr & impls]"],
 :source {:code "(defmacro specify [expr & impls]\n  `(cljs.core/specify! (cljs.core/clone ~expr)\n     ~@impls))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/core.clj",
          :lines [637 639]},
 :full-name "cljs.core/specify",
 :full-name-encode "cljs.core_specify",
 :history [["+" "0.0-2138"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_specify.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_specify.cljsdoc)
</pre>

