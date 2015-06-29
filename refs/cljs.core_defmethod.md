## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defmethod

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmethod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmethod)
</td>
</tr>
</table>

 <samp>
(__defmethod__ multifn dispatch-val & fn-tail)<br>
</samp>

---




Source docstring:

```
Creates and installs a new method of multimethod associated with dispatch-value. 
```

Source code:

```clj
(defmacro defmethod
  [multifn dispatch-val & fn-tail]
  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1821-1824](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L1821-L1824)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defmethod"]))
```

```clj
{:ns "cljs.core",
 :name "defmethod",
 :signature ["[multifn dispatch-val & fn-tail]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defmethod",
 :source {:code "(defmacro defmethod\n  [multifn dispatch-val & fn-tail]\n  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/core.clj",
          :lines [1821 1824]},
 :full-name "cljs.core/defmethod",
 :clj-symbol "clojure.core/defmethod",
 :docstring "Creates and installs a new method of multimethod associated with dispatch-value. "}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defmethod.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defmethod.cljsdoc)
</pre>

