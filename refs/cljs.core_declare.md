## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/declare

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/declare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/declare)
</td>
</tr>
</table>

 <samp>
(__declare__ & names)<br>
</samp>

---

Uses `def` to establish symbols of `names` with no bindings.

Useful for making forward declarations.

---

Example:

```clj
a
;; WARNING: Use of undeclared Var

(declare a)
a
;;=> nil
```

---

See Also:

[`special/def`](special_def.md)<br>

---

Source docstring:

```
defs the supplied var names with no bindings, useful for making forward declarations.
```

Source code:

```clj
(defmacro declare
  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))
```

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:2643-2646](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L2643-L2646)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/declare"]))
```

```clj
{:description "Uses `def` to establish symbols of `names` with no bindings.\n\nUseful for making forward declarations.",
 :ns "cljs.core",
 :name "declare",
 :signature ["[& names]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/def"],
 :full-name-encode "cljs.core_declare",
 :source {:code "(defmacro declare\n  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [2643 2646]},
 :examples [{:id "5a2dc2",
             :content "```clj\na\n;; WARNING: Use of undeclared Var\n\n(declare a)\na\n;;=> nil\n```"}],
 :full-name "cljs.core/declare",
 :clj-symbol "clojure.core/declare",
 :docstring "defs the supplied var names with no bindings, useful for making forward declarations."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_declare.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_declare.cljsdoc)
</pre>

