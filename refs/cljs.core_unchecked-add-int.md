## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-add-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-add-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-add-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-add-int__)<br>
</samp>
 <samp>
(__unchecked-add-int__ x)<br>
</samp>
 <samp>
(__unchecked-add-int__ x y)<br>
</samp>
 <samp>
(__unchecked-add-int__ x y & more)<br>
</samp>

---




Source docstring:

```
Returns the sum of nums. (+) returns 0.
```

Source code:

```clj
(defn ^number unchecked-add-int
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/unchecked-add-int x y))
  ([x y & more] (reduce unchecked-add-int (cljs.core/unchecked-add-int x y) more)))
```

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1798-1803](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L1798-L1803)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-add-int
  ([& xs] `(+ ~@xs)))
```

 <pre>
clojurescript @ r2301
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:389-390](https://github.com/clojure/clojurescript/blob/r2301/src/clj/cljs/core.clj#L389-L390)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-add-int"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-add-int",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-add-int",
 :source {:code "(defn ^number unchecked-add-int\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-add-int x y))\n  ([x y & more] (reduce unchecked-add-int (cljs.core/unchecked-add-int x y) more)))",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1798 1803]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-add-int\n  ([& xs] `(+ ~@xs)))",
                  :repo "clojurescript",
                  :tag "r2301",
                  :filename "src/clj/cljs/core.clj",
                  :lines [389 390]}),
 :full-name "cljs.core/unchecked-add-int",
 :clj-symbol "clojure.core/unchecked-add-int",
 :docstring "Returns the sum of nums. (+) returns 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-add-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-add-int.cljsdoc)
</pre>

