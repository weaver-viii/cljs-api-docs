## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/+

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/+</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/+)
</td>
</tr>
</table>

 <samp>
(__+__)<br>
</samp>
 <samp>
(__+__ x)<br>
</samp>
 <samp>
(__+__ x y)<br>
</samp>
 <samp>
(__+__ x y & more)<br>
</samp>

---

Returns the sum of nums.

`(+)` returns 0.

---

Example:

```clj
(+)
;;=> 0

(+ 1)
;;=> 1

(+ -10)
;;=> -10

(+ 1 2)
;;=> 3

(+ 1 2 3)
;;=> 6
```

---

See Also:

[`cljs.core/*`](cljs.core_STAR.md)<br>
[`cljs.core/-`](cljs.core_-.md)<br>

---

Source docstring:

```
Returns the sum of nums. (+) returns 0.
```

Source code:

```clj
(defn ^number +
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/+ x y))
  ([x y & more]
    (reduce + (cljs.core/+ x y) more)))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1458-1464](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L1458-L1464)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric +
  ([] 0)
  ([x] x)
  ([x y] (core/list 'js* "(~{} + ~{})" x y))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2202
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:344-348](https://github.com/clojure/clojurescript/blob/r2202/src/clj/cljs/core.clj#L344-L348)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/+"]))
```

```clj
{:description "Returns the sum of nums.\n\n`(+)` returns 0.",
 :return-type number,
 :ns "cljs.core",
 :name "+",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/*" "cljs.core/-"],
 :full-name-encode "cljs.core_PLUS",
 :source {:code "(defn ^number +\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/+ x y))\n  ([x y & more]\n    (reduce + (cljs.core/+ x y) more)))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1458 1464]},
 :extra-sources ({:code "(defmacro ^::ana/numeric +\n  ([] 0)\n  ([x] x)\n  ([x y] (core/list 'js* \"(~{} + ~{})\" x y))\n  ([x y & more] `(+ (+ ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2202",
                  :filename "src/clj/cljs/core.clj",
                  :lines [344 348]}),
 :examples [{:id "650668",
             :content "```clj\n(+)\n;;=> 0\n\n(+ 1)\n;;=> 1\n\n(+ -10)\n;;=> -10\n\n(+ 1 2)\n;;=> 3\n\n(+ 1 2 3)\n;;=> 6\n```"}],
 :full-name "cljs.core/+",
 :clj-symbol "clojure.core/+",
 :docstring "Returns the sum of nums. (+) returns 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PLUS.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PLUS.cljsdoc)
</pre>

