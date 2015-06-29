## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/satisfies?

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/satisfies?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/satisfies?)
</td>
</tr>
</table>

 <samp>
(__satisfies?__ psym x)<br>
</samp>

---




Source docstring:

```
Returns true if x satisfies the protocol
```

Source code:

```clj
(defmacro satisfies?
  [psym x]
  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))
        prefix (protocol-prefix p)
        xsym (gensym)
        [part bit] (fast-path-protocols p)
        msym (symbol (core/str "-cljs$lang$protocol_mask$partition" part "$"))]
    `(let [~xsym ~x]
       (if (coercive-not= ~xsym nil)
         (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))
                 ~(bool-expr `(. ~xsym ~(symbol (core/str "-" prefix)))))
           true
           (if (coercive-not (. ~xsym ~msym))
             (cljs.core/type_satisfies_ ~psym ~xsym)
             false))
         (cljs.core/type_satisfies_ ~psym ~xsym)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:577-593](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L577-L593)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/satisfies?"]))
```

```clj
{:ns "cljs.core",
 :name "satisfies?",
 :signature ["[psym x]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_satisfiesQMARK",
 :source {:code "(defmacro satisfies?\n  [psym x]\n  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))\n        prefix (protocol-prefix p)\n        xsym (gensym)\n        [part bit] (fast-path-protocols p)\n        msym (symbol (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n    `(let [~xsym ~x]\n       (if (coercive-not= ~xsym nil)\n         (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n           true\n           (if (coercive-not (. ~xsym ~msym))\n             (cljs.core/type_satisfies_ ~psym ~xsym)\n             false))\n         (cljs.core/type_satisfies_ ~psym ~xsym)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/core.clj",
          :lines [577 593]},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_satisfiesQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_satisfiesQMARK.cljsdoc)
</pre>
