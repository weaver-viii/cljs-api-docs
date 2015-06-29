## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-substract-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unchecked-substract-int__ x)<br>
</samp>
 <samp>
(__unchecked-substract-int__ x y)<br>
</samp>
 <samp>
(__unchecked-substract-int__ x y & more)<br>
</samp>

---




Source docstring:

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

Source code:

```clj
(defn ^number unchecked-substract-int
  ([x] (cljs.core/unchecked-subtract-int x))
  ([x y] (cljs.core/unchecked-subtract-int x y))
  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))
```

 <pre>
clojurescript @ r2156
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1627-1632](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L1627-L1632)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-substract-int"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-substract-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-substract-int",
 :source {:code "(defn ^number unchecked-substract-int\n  ([x] (cljs.core/unchecked-subtract-int x))\n  ([x y] (cljs.core/unchecked-subtract-int x y))\n  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1627 1632]},
 :full-name "cljs.core/unchecked-substract-int",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-substract-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-substract-int.cljsdoc)
</pre>

