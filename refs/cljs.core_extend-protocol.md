## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/extend-protocol

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-protocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-protocol)
</td>
</tr>
</table>

 <samp>
(__extend-protocol__ p & specs)<br>
</samp>

---




Source docstring:

```
Useful when you want to provide several implementations of the same
protocol all at once. Takes a single protocol and the implementation
of that protocol for one or more types. Expands into calls to
extend-type:

(extend-protocol Protocol
  AType
    (foo [x] ...)
    (bar [x y] ...)
  BType
    (foo [x] ...)
    (bar [x y] ...)
  AClass
    (foo [x] ...)
    (bar [x y] ...)
  nil
    (foo [x] ...)
    (bar [x y] ...))

expands into:

(do
 (clojure.core/extend-type AType Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type BType Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type AClass Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type nil Protocol 
   (foo [x] ...) 
   (bar [x y] ...)))
```

Source code:

```clj
(defmacro extend-protocol 
  [p & specs]
  (emit-extend-protocol p specs))
```

 <pre>
clojure @ clojure-1.6.0
└── src
    └── clj
        └── clojure
            └── <ins>[core_deftype.clj:807-845](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core_deftype.clj#L807-L845)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/extend-protocol"]))
```

```clj
{:ns "cljs.core",
 :name "extend-protocol",
 :signature ["[p & specs]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_extend-protocol",
 :source {:code "(defmacro extend-protocol \n  [p & specs]\n  (emit-extend-protocol p specs))",
          :repo "clojure",
          :tag "clojure-1.6.0",
          :filename "src/clj/clojure/core_deftype.clj",
          :lines [807 845]},
 :full-name "cljs.core/extend-protocol",
 :clj-symbol "clojure.core/extend-protocol",
 :docstring "Useful when you want to provide several implementations of the same\nprotocol all at once. Takes a single protocol and the implementation\nof that protocol for one or more types. Expands into calls to\nextend-type:\n\n(extend-protocol Protocol\n  AType\n    (foo [x] ...)\n    (bar [x y] ...)\n  BType\n    (foo [x] ...)\n    (bar [x y] ...)\n  AClass\n    (foo [x] ...)\n    (bar [x y] ...)\n  nil\n    (foo [x] ...)\n    (bar [x y] ...))\n\nexpands into:\n\n(do\n (clojure.core/extend-type AType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type BType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type AClass Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type nil Protocol \n   (foo [x] ...) \n   (bar [x y] ...)))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_extend-protocol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_extend-protocol.cljsdoc)
</pre>

