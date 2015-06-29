## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/implements?

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2014"><img valign="middle" alt="[+] 0.0-2014" src="https://img.shields.io/badge/+-0.0--2014-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__implements?__ psym x)<br>
</samp>

---




Source docstring:

```
EXPERIMENTAL
```

Source code:

```clj
(defmacro implements?
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
             false))
         false))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:1347-1365](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L1347-L1365)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/implements?"]))
```

```clj
{:ns "cljs.core",
 :name "implements?",
 :signature ["[psym x]"],
 :history [["+" "0.0-2014"]],
 :type "macro",
 :full-name-encode "cljs.core_implementsQMARK",
 :source {:code "(defmacro implements?\n  [psym x]\n  (let [p          (:name\n                    (cljs.analyzer/resolve-var\n                      (dissoc &env :locals) psym))\n        prefix     (protocol-prefix p)\n        xsym       (bool-expr (gensym))\n        [part bit] (fast-path-protocols p)\n        msym       (symbol\n                      (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n    `(let [~xsym ~x]\n       (if ~xsym\n         (let [bit# ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))]\n           (if (or bit#\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n             true\n             false))\n         false))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/clojure/cljs/core.clj",
          :lines [1347 1365]},
 :full-name "cljs.core/implements?",
 :docstring "EXPERIMENTAL"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_implementsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_implementsQMARK.cljsdoc)
</pre>

