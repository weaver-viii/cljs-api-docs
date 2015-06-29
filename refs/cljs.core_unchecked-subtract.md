## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-subtract

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract)
</td>
</tr>
</table>

 <samp>
(__unchecked-subtract__ x)<br>
</samp>
 <samp>
(__unchecked-subtract__ x y)<br>
</samp>
 <samp>
(__unchecked-subtract__ x y & more)<br>
</samp>

---




Source docstring:

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

Source code:

```clj
(defn ^number unchecked-subtract
  ([x] (cljs.core/unchecked-subtract x))
  ([x y] (cljs.core/unchecked-subtract x y))
  ([x y & more] (reduce unchecked-subtract (cljs.core/unchecked-subtract x y) more)))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2279-2284](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L2279-L2284)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-subtract
  ([& xs] `(- ~@xs)))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:426-427](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/core.clj#L426-L427)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-subtract"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-subtract",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-subtract",
 :source {:code "(defn ^number unchecked-subtract\n  ([x] (cljs.core/unchecked-subtract x))\n  ([x y] (cljs.core/unchecked-subtract x y))\n  ([x y & more] (reduce unchecked-subtract (cljs.core/unchecked-subtract x y) more)))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2279 2284]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-subtract\n  ([& xs] `(- ~@xs)))",
                  :repo "clojurescript",
                  :tag "r3149",
                  :filename "src/clj/cljs/core.clj",
                  :lines [426 427]}),
 :full-name "cljs.core/unchecked-subtract",
 :clj-symbol "clojure.core/unchecked-subtract",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-subtract.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-subtract.cljsdoc)
</pre>

