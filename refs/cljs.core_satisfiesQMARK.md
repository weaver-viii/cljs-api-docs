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
  (let [p          (:name
                     (cljs.analyzer/resolve-var
                       (dissoc &env :locals) psym))
         prefix     (protocol-prefix p)
         xsym       (bool-expr (gensym))
         [part bit] (fast-path-protocols p)
         msym       (symbol
                      (core/str "-cljs$lang$protocol_mask$partition" part "$"))]
    `(let [~xsym ~x]
       (if ~xsym
         (let [bit# ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))]
           (if (or bit#
                 ~(bool-expr `(. ~xsym ~(symbol (core/str "-" prefix)))))
             true
             (if (coercive-not (. ~xsym ~msym))
               (cljs.core/native-satisfies? ~psym ~xsym)
               false)))
         (cljs.core/native-satisfies? ~psym ~xsym)))))
```

 <pre>
clojurescript @ r2511
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1071-1091](https://github.com/clojure/clojurescript/blob/r2511/src/clj/cljs/core.clj#L1071-L1091)</ins>
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
 :source {:code "(defmacro satisfies?\n  [psym x]\n  (let [p          (:name\n                     (cljs.analyzer/resolve-var\n                       (dissoc &env :locals) psym))\n         prefix     (protocol-prefix p)\n         xsym       (bool-expr (gensym))\n         [part bit] (fast-path-protocols p)\n         msym       (symbol\n                      (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n    `(let [~xsym ~x]\n       (if ~xsym\n         (let [bit# ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))]\n           (if (or bit#\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n             true\n             (if (coercive-not (. ~xsym ~msym))\n               (cljs.core/native-satisfies? ~psym ~xsym)\n               false)))\n         (cljs.core/native-satisfies? ~psym ~xsym)))))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/clj/cljs/core.clj",
          :lines [1071 1091]},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_satisfiesQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_satisfiesQMARK.cljsdoc)
</pre>

