## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-add

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-add</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-add)
</td>
</tr>
</table>

 <samp>
(__unchecked-add__)<br>
</samp>
 <samp>
(__unchecked-add__ x)<br>
</samp>
 <samp>
(__unchecked-add__ x y)<br>
</samp>
 <samp>
(__unchecked-add__ x y & more)<br>
</samp>

---




Source docstring:

```
Returns the sum of nums. (+) returns 0.
```

Source code:

```clj
(defn unchecked-add
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/unchecked-add x y))
  ([x y & more] (reduce unchecked-add (cljs.core/unchecked-add x y) more)))
```

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1511-1516](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L1511-L1516)</ins>
</pre>


---

```clj
(defmacro unchecked-add
  ([& xs] `(+ ~@xs)))
```

 <pre>
clojurescript @ r1909
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:299-300](https://github.com/clojure/clojurescript/blob/r1909/src/clj/cljs/core.clj#L299-L300)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-add"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-add",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-add",
 :source {:code "(defn unchecked-add\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-add x y))\n  ([x y & more] (reduce unchecked-add (cljs.core/unchecked-add x y) more)))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1511 1516]},
 :extra-sources ({:code "(defmacro unchecked-add\n  ([& xs] `(+ ~@xs)))",
                  :repo "clojurescript",
                  :tag "r1909",
                  :filename "src/clj/cljs/core.clj",
                  :lines [299 300]}),
 :full-name "cljs.core/unchecked-add",
 :clj-symbol "clojure.core/unchecked-add",
 :docstring "Returns the sum of nums. (+) returns 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-add.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-add.cljsdoc)
</pre>

