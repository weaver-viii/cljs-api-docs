## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-multiply

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply)
</td>
</tr>
</table>

 <samp>
(__unchecked-multiply__)<br>
</samp>
 <samp>
(__unchecked-multiply__ x)<br>
</samp>
 <samp>
(__unchecked-multiply__ x y)<br>
</samp>
 <samp>
(__unchecked-multiply__ x y & more)<br>
</samp>

---




Source docstring:

```
Returns the product of nums. (*) returns 1.
```

Source code:

```clj
(defn ^number unchecked-multiply
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply x y))
  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2254-2259](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2254-L2259)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-multiply
  ([& xs] `(* ~@xs)))
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:460-461](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/core.clj#L460-L461)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-multiply"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-multiply",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-multiply",
 :source {:code "(defn ^number unchecked-multiply\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply x y))\n  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2254 2259]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-multiply\n  ([& xs] `(* ~@xs)))",
                  :repo "clojurescript",
                  :tag "r3191",
                  :filename "src/clj/cljs/core.clj",
                  :lines [460 461]}),
 :full-name "cljs.core/unchecked-multiply",
 :clj-symbol "clojure.core/unchecked-multiply",
 :docstring "Returns the product of nums. (*) returns 1."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-multiply.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-multiply.cljsdoc)
</pre>

