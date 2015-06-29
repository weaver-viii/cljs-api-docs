## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/as->

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/as-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/as-%3E)
</td>
</tr>
</table>

 <samp>
(__as->__ expr name & forms)<br>
</samp>

---

Binds `name` to `expr`, evaluates the first form in the lexical context of that
binding, then binds `name` to that result, repeating for each successive form,
returning the result of the last form.

Useful for when you want a threading macro to use different "places" at each
form.

---

Example:

```clj
(as-> [1 2 3 4] x
  (reduce + x)
  (/ x 2))
;;=> 5
```

---

See Also:

[`cljs.core/->`](cljs.core_-GT.md)<br>
[`cljs.core/->>`](cljs.core_-GTGT.md)<br>
[`cljs.core/cond->`](cljs.core_cond-GT.md)<br>
[`cljs.core/cond->>`](cljs.core_cond-GTGT.md)<br>
[`cljs.core/some->`](cljs.core_some-GT.md)<br>
[`cljs.core/some->>`](cljs.core_some-GTGT.md)<br>

---

Source docstring:

```
Binds name to expr, evaluates the first form in the lexical context
of that binding, then binds name to that result, repeating for each
successive form, returning the result of the last form.
```

Source code:

```clj
(defmacro as->
  [expr name & forms]
  `(let [~name ~expr
         ~@(interleave (repeat name) forms)]
     ~name))
```

 <pre>
clojure @ clojure-1.7.0-RC1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:7257-7265](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/clj/clojure/core.clj#L7257-L7265)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/as->"]))
```

```clj
{:description "Binds `name` to `expr`, evaluates the first form in the lexical context of that\nbinding, then binds `name` to that result, repeating for each successive form,\nreturning the result of the last form.\n\nUseful for when you want a threading macro to use different \"places\" at each\nform.",
 :ns "cljs.core",
 :name "as->",
 :signature ["[expr name & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :related ["cljs.core/->"
           "cljs.core/->>"
           "cljs.core/cond->"
           "cljs.core/cond->>"
           "cljs.core/some->"
           "cljs.core/some->>"],
 :full-name-encode "cljs.core_as-GT",
 :source {:code "(defmacro as->\n  [expr name & forms]\n  `(let [~name ~expr\n         ~@(interleave (repeat name) forms)]\n     ~name))",
          :repo "clojure",
          :tag "clojure-1.7.0-RC1",
          :filename "src/clj/clojure/core.clj",
          :lines [7257 7265]},
 :examples [{:id "5e7eef",
             :content "```clj\n(as-> [1 2 3 4] x\n  (reduce + x)\n  (/ x 2))\n;;=> 5\n```"}],
 :full-name "cljs.core/as->",
 :clj-symbol "clojure.core/as->",
 :docstring "Binds name to expr, evaluates the first form in the lexical context\nof that binding, then binds name to that result, repeating for each\nsuccessive form, returning the result of the last form."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_as-GT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_as-GT.cljsdoc)
</pre>

