## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defprotocol

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defprotocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defprotocol)
</td>
</tr>
</table>

 <samp>
(__defprotocol__ psym & doc+methods)<br>
</samp>

---





Source code:

```clj
(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))
        ns-name (-> &env :ns :name)
        fqn (fn [n] (symbol (core/str ns-name "." n)))
        prefix (protocol-prefix p)
        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)
        expand-sig (fn [fname slot sig]
                     `(~sig
                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str "-" slot)))) ;; Property access needed here.
                         (. ~(first sig) ~slot ~@sig)
                         ((or
                           (aget ~(fqn fname) (goog.typeOf ~(first sig)))
                           (aget ~(fqn fname) "_")
                           (throw (missing-protocol
                                    ~(core/str psym "." fname) ~(first sig))))
                          ~@sig))))
        method (fn [[fname & sigs]]
                 (let [sigs (take-while vector? sigs)
                       slot (symbol (core/str prefix (name fname)))]
                   `(defn ~fname ~@(map (fn [sig]
                                          (expand-sig fname
                                                      (symbol (core/str slot "$arity$" (count sig)))
                                                      sig))
                                        sigs))))]
    `(do
       (set! ~'*unchecked-if* true)
       (def ~psym (~'js* "{}"))
       ~@(map method methods)
       (set! ~'*unchecked-if* false))))
```

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:513-541](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L513-L541)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defprotocol"]))
```

```clj
{:ns "cljs.core",
 :name "defprotocol",
 :signature ["[psym & doc+methods]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defprotocol",
 :source {:code "(defmacro defprotocol [psym & doc+methods]\n  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))\n        ns-name (-> &env :ns :name)\n        fqn (fn [n] (symbol (core/str ns-name \".\" n)))\n        prefix (protocol-prefix p)\n        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)\n        expand-sig (fn [fname slot sig]\n                     `(~sig\n                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str \"-\" slot)))) ;; Property access needed here.\n                         (. ~(first sig) ~slot ~@sig)\n                         ((or\n                           (aget ~(fqn fname) (goog.typeOf ~(first sig)))\n                           (aget ~(fqn fname) \"_\")\n                           (throw (missing-protocol\n                                    ~(core/str psym \".\" fname) ~(first sig))))\n                          ~@sig))))\n        method (fn [[fname & sigs]]\n                 (let [sigs (take-while vector? sigs)\n                       slot (symbol (core/str prefix (name fname)))]\n                   `(defn ~fname ~@(map (fn [sig]\n                                          (expand-sig fname\n                                                      (symbol (core/str slot \"$arity$\" (count sig)))\n                                                      sig))\n                                        sigs))))]\n    `(do\n       (set! ~'*unchecked-if* true)\n       (def ~psym (~'js* \"{}\"))\n       ~@(map method methods)\n       (set! ~'*unchecked-if* false))))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/clj/cljs/core.clj",
          :lines [513 541]},
 :full-name "cljs.core/defprotocol",
 :clj-symbol "clojure.core/defprotocol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defprotocol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defprotocol.cljsdoc)
</pre>

