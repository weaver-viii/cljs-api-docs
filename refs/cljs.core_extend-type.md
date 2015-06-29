## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/extend-type

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-type)
</td>
</tr>
</table>

 <samp>
(__extend-type__ type-sym & impls)<br>
</samp>

---




Source docstring:

```
Extend a type to a series of protocols. Useful when you are
 supplying the definitions explicitly inline. Propagates the
 type as a type hint on the first argument of all fns.

(extend-type MyType
  ICounted
  (-count [c] ...)
  Foo
  (bar [x y] ...)
  (baz ([x] ...) ([x y & zs] ...))
```

Source code:

```clj
(defmacro extend-type
  [type-sym & impls]
  (let [env &env
        _ (validate-impls env impls)
        resolve (partial resolve-var env)
        impl-map (->impl-map impls)
        [type assign-impls] (if-let [type (base-type type-sym)]
                              [type base-assign-impls]
                              [(resolve type-sym) proto-assign-impls])]
    (when (core/and (:extending-base-js-type cljs.analyzer/*cljs-warnings*)
                    (js-base-type type-sym))
      (cljs.analyzer/warning :extending-base-js-type env
          {:current-symbol type-sym :suggested-symbol (js-base-type type-sym)}))
    `(do ~@(mapcat #(assign-impls env resolve type-sym type %) impl-map))))
```

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:886-909](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/core.clj#L886-L909)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/extend-type"]))
```

```clj
{:ns "cljs.core",
 :name "extend-type",
 :signature ["[type-sym & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_extend-type",
 :source {:code "(defmacro extend-type\n  [type-sym & impls]\n  (let [env &env\n        _ (validate-impls env impls)\n        resolve (partial resolve-var env)\n        impl-map (->impl-map impls)\n        [type assign-impls] (if-let [type (base-type type-sym)]\n                              [type base-assign-impls]\n                              [(resolve type-sym) proto-assign-impls])]\n    (when (core/and (:extending-base-js-type cljs.analyzer/*cljs-warnings*)\n                    (js-base-type type-sym))\n      (cljs.analyzer/warning :extending-base-js-type env\n          {:current-symbol type-sym :suggested-symbol (js-base-type type-sym)}))\n    `(do ~@(mapcat #(assign-impls env resolve type-sym type %) impl-map))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/core.clj",
          :lines [886 909]},
 :full-name "cljs.core/extend-type",
 :clj-symbol "clojure.core/extend-type",
 :docstring "Extend a type to a series of protocols. Useful when you are\n supplying the definitions explicitly inline. Propagates the\n type as a type hint on the first argument of all fns.\n\n(extend-type MyType\n  ICounted\n  (-count [c] ...)\n  Foo\n  (bar [x y] ...)\n  (baz ([x] ...) ([x y & zs] ...))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_extend-type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_extend-type.cljsdoc)
</pre>

