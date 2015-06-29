## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-multiply-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-multiply-int__)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x y)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x y & more)<br>
</samp>

---




Source docstring:

```
Returns the product of nums. (*) returns 1.
```

Source code:

```clj
(defn ^number unchecked-multiply-int
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply-int x y))
  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2065-2070](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2065-L2070)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-multiply-int
  ([& xs] `(* ~@xs)))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:403-404](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L403-L404)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-multiply-int"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-multiply-int",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-multiply-int",
 :source {:code "(defn ^number unchecked-multiply-int\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply-int x y))\n  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2065 2070]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-multiply-int\n  ([& xs] `(* ~@xs)))",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/clj/cljs/core.clj",
                  :lines [403 404]}),
 :full-name "cljs.core/unchecked-multiply-int",
 :clj-symbol "clojure.core/unchecked-multiply-int",
 :docstring "Returns the product of nums. (*) returns 1."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-multiply-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-multiply-int.cljsdoc)
</pre>

