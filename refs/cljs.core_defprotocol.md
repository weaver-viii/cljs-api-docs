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




Source docstring:

```
A protocol is a named set of named methods and their signatures:

(defprotocol AProtocolName
  ;optional doc string
  "A doc string for AProtocol abstraction"

;method signatures
  (bar [this a b] "bar docs")
  (baz [this a] [this a b] [this a b c] "baz docs"))

No implementations are provided. Docs can be specified for the
protocol overall and for each method. The above yields a set of
polymorphic functions and a protocol object. All are
namespace-qualified by the ns enclosing the definition The resulting
functions dispatch on the type of their first argument, which is
required and corresponds to the implicit target object ('this' in
JavaScript parlance). defprotocol is dynamic, has no special compile-time
effect, and defines no new types.

(defprotocol P
  (foo [this])
  (bar-me [this] [this y]))

(deftype Foo [a b c]
  P
  (foo [this] a)
  (bar-me [this] b)
  (bar-me [this y] (+ c y)))

(bar-me (Foo. 1 2 3) 42)
=> 45

(foo
  (let [x 42]
    (reify P
      (foo [this] 17)
      (bar-me [this] x)
      (bar-me [this y] x))))
=> 17
```

Source code:

```clj
(defmacro defprotocol
  [psym & doc+methods]
  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))
        [doc methods] (if (core/string? (first doc+methods))
                        [(first doc+methods) (next doc+methods)]
                        [nil doc+methods])
        psym (vary-meta psym assoc
               :doc doc
               :protocol-symbol true)
        ns-name (-> &env :ns :name)
        fqn (fn [n] (symbol (core/str ns-name "." n)))
        prefix (protocol-prefix p)
        _ (core/doseq [[mname & arities] methods]
            (when (some #{0} (map count (filter vector? arities)))
              (throw (Exception.
                       (core/str "Invalid protocol, " psym
                                 " defines method " mname " with arity 0")))))
        expand-sig (fn [fname slot sig]
                     `(~sig
                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str "-" slot)))) ;; Property access needed here.
                         (. ~(first sig) ~slot ~@sig)
                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]
                           ((or
                             (aget ~(fqn fname) (goog/typeOf x#))
                             (aget ~(fqn fname) "_")
                             (throw (missing-protocol
                                     ~(core/str psym "." fname) ~(first sig))))
                            ~@sig)))))
        psym   (vary-meta psym assoc-in [:protocol-info :methods]
                 (into {}
                   (map
                     (fn [[fname & sigs]]
                       (let [doc (as-> (last sigs) doc
                                   (when (core/string? doc) doc))
                             sigs (take-while vector? sigs)]
                         [(vary-meta fname assoc :doc doc)
                          (vec sigs)]))
                     methods)))
        method (fn [[fname & sigs]]
                 (let [doc (as-> (last sigs) doc
                             (when (core/string? doc) doc))
                       sigs (take-while vector? sigs)
                       slot (symbol (core/str prefix (name fname)))
                       fname (vary-meta fname assoc
                               :protocol p
                               :doc doc)]
                   `(defn ~fname
                      ~@(map (fn [sig]
                               (expand-sig fname
                                 (symbol (core/str slot "$arity$" (count sig)))
                                 sig))
                          sigs))))]
    `(do
       (set! ~'*unchecked-if* true)
       (def ~psym (js-obj))
       ~@(map method methods)
       (set! ~'*unchecked-if* false))))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1199-1294](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/core.clj#L1199-L1294)</ins>
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
 :source {:code "(defmacro defprotocol\n  [psym & doc+methods]\n  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))\n        [doc methods] (if (core/string? (first doc+methods))\n                        [(first doc+methods) (next doc+methods)]\n                        [nil doc+methods])\n        psym (vary-meta psym assoc\n               :doc doc\n               :protocol-symbol true)\n        ns-name (-> &env :ns :name)\n        fqn (fn [n] (symbol (core/str ns-name \".\" n)))\n        prefix (protocol-prefix p)\n        _ (core/doseq [[mname & arities] methods]\n            (when (some #{0} (map count (filter vector? arities)))\n              (throw (Exception.\n                       (core/str \"Invalid protocol, \" psym\n                                 \" defines method \" mname \" with arity 0\")))))\n        expand-sig (fn [fname slot sig]\n                     `(~sig\n                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str \"-\" slot)))) ;; Property access needed here.\n                         (. ~(first sig) ~slot ~@sig)\n                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]\n                           ((or\n                             (aget ~(fqn fname) (goog/typeOf x#))\n                             (aget ~(fqn fname) \"_\")\n                             (throw (missing-protocol\n                                     ~(core/str psym \".\" fname) ~(first sig))))\n                            ~@sig)))))\n        psym   (vary-meta psym assoc-in [:protocol-info :methods]\n                 (into {}\n                   (map\n                     (fn [[fname & sigs]]\n                       (let [doc (as-> (last sigs) doc\n                                   (when (core/string? doc) doc))\n                             sigs (take-while vector? sigs)]\n                         [(vary-meta fname assoc :doc doc)\n                          (vec sigs)]))\n                     methods)))\n        method (fn [[fname & sigs]]\n                 (let [doc (as-> (last sigs) doc\n                             (when (core/string? doc) doc))\n                       sigs (take-while vector? sigs)\n                       slot (symbol (core/str prefix (name fname)))\n                       fname (vary-meta fname assoc\n                               :protocol p\n                               :doc doc)]\n                   `(defn ~fname\n                      ~@(map (fn [sig]\n                               (expand-sig fname\n                                 (symbol (core/str slot \"$arity$\" (count sig)))\n                                 sig))\n                          sigs))))]\n    `(do\n       (set! ~'*unchecked-if* true)\n       (def ~psym (js-obj))\n       ~@(map method methods)\n       (set! ~'*unchecked-if* false))))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/core.clj",
          :lines [1199 1294]},
 :full-name "cljs.core/defprotocol",
 :clj-symbol "clojure.core/defprotocol",
 :docstring "A protocol is a named set of named methods and their signatures:\n\n(defprotocol AProtocolName\n  ;optional doc string\n  \"A doc string for AProtocol abstraction\"\n\n;method signatures\n  (bar [this a b] \"bar docs\")\n  (baz [this a] [this a b] [this a b c] \"baz docs\"))\n\nNo implementations are provided. Docs can be specified for the\nprotocol overall and for each method. The above yields a set of\npolymorphic functions and a protocol object. All are\nnamespace-qualified by the ns enclosing the definition The resulting\nfunctions dispatch on the type of their first argument, which is\nrequired and corresponds to the implicit target object ('this' in\nJavaScript parlance). defprotocol is dynamic, has no special compile-time\neffect, and defines no new types.\n\n(defprotocol P\n  (foo [this])\n  (bar-me [this] [this y]))\n\n(deftype Foo [a b c]\n  P\n  (foo [this] a)\n  (bar-me [this] b)\n  (bar-me [this y] (+ c y)))\n\n(bar-me (Foo. 1 2 3) 42)\n=> 45\n\n(foo\n  (let [x 42]\n    (reify P\n      (foo [this] 17)\n      (bar-me [this] x)\n      (bar-me [this y] x))))\n=> 17"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defprotocol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defprotocol.cljsdoc)
</pre>

