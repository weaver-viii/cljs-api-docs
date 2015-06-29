## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/some->>

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some->></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some-%3E%3E)
</td>
</tr>
</table>

 <samp>
(__some->>__ expr & forms)<br>
</samp>

---

When `expr` is not nil, threads it into the first form (via `->>`), and when
that result is not nil, through the next, etc.

---


See Also:

[`cljs.core/->`](cljs.core_-GT.md)<br>
[`cljs.core/->>`](cljs.core_-GTGT.md)<br>
[`cljs.core/some->`](cljs.core_some-GT.md)<br>
[`cljs.core/some`](cljs.core_some.md)<br>

---

Source docstring:

```
When expr is not nil, threads it into the first form (via ->>),
and when that result is not nil, through the next etc
```

Source code:

```clj
(defmacro some->>
  [expr & forms]
  (let [g (gensym)
        pstep (fn [step] `(if (nil? ~g) nil (->> ~g ~step)))]
    `(let [~g ~expr
           ~@(interleave (repeat g) (map pstep forms))]
       ~g)))
```

 <pre>
clojure @ clojure-1.7.0-beta2
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:7278-7287](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L7278-L7287)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some->>"]))
```

```clj
{:description "When `expr` is not nil, threads it into the first form (via `->>`), and when\nthat result is not nil, through the next, etc.",
 :ns "cljs.core",
 :name "some->>",
 :signature ["[expr & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :related ["cljs.core/->"
           "cljs.core/->>"
           "cljs.core/some->"
           "cljs.core/some"],
 :full-name-encode "cljs.core_some-GTGT",
 :source {:code "(defmacro some->>\n  [expr & forms]\n  (let [g (gensym)\n        pstep (fn [step] `(if (nil? ~g) nil (->> ~g ~step)))]\n    `(let [~g ~expr\n           ~@(interleave (repeat g) (map pstep forms))]\n       ~g)))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta2",
          :filename "src/clj/clojure/core.clj",
          :lines [7278 7287]},
 :full-name "cljs.core/some->>",
 :clj-symbol "clojure.core/some->>",
 :docstring "When expr is not nil, threads it into the first form (via ->>),\nand when that result is not nil, through the next etc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_some-GTGT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_some-GTGT.cljsdoc)
</pre>

