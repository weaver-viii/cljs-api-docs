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
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1513-1518](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L1513-L1518)</ins>
</pre>


---

```clj
(defmacro unchecked-add
  ([& xs] `(+ ~@xs)))
```

 <pre>
clojurescript @ r1978
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:341-342](https://github.com/clojure/clojurescript/blob/r1978/src/clj/cljs/core.clj#L341-L342)</ins>
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
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1513 1518]},
 :extra-sources ({:code "(defmacro unchecked-add\n  ([& xs] `(+ ~@xs)))",
                  :repo "clojurescript",
                  :tag "r1978",
                  :filename "src/clj/cljs/core.clj",
                  :lines [341 342]}),
 :full-name "cljs.core/unchecked-add",
 :clj-symbol "clojure.core/unchecked-add",
 :docstring "Returns the sum of nums. (+) returns 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-add.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-add.cljsdoc)
</pre>

