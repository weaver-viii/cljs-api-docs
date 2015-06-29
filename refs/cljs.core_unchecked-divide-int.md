## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-divide-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-divide-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-divide-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-divide-int__ x)<br>
</samp>
 <samp>
(__unchecked-divide-int__ x y)<br>
</samp>
 <samp>
(__unchecked-divide-int__ x y & more)<br>
</samp>

---




Source docstring:

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```

Source code:

```clj
(defn unchecked-divide-int
  ([x] (unchecked-divide-int 1 x))
  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1536-1541](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1536-L1541)</ins>
</pre>


---

```clj
(defmacro unchecked-divide-int
  ([& xs] `(/ ~@xs)))
```

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:357-358](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L357-L358)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-divide-int"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-divide-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-divide-int",
 :source {:code "(defn unchecked-divide-int\n  ([x] (unchecked-divide-int 1 x))\n  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1536 1541]},
 :extra-sources ({:code "(defmacro unchecked-divide-int\n  ([& xs] `(/ ~@xs)))",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [357 358]}),
 :full-name "cljs.core/unchecked-divide-int",
 :clj-symbol "clojure.core/unchecked-divide-int",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-divide-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-divide-int.cljsdoc)
</pre>
