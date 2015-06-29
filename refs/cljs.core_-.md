## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/-

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/-</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-)
</td>
</tr>
</table>

 <samp>
(__-__ x)<br>
</samp>
 <samp>
(__-__ x y)<br>
</samp>
 <samp>
(__-__ x y & more)<br>
</samp>

---

If no `y`s are supplied, returns the negation of `x`, else subtracts the `y`s
from `x` and returns the result.

---

Example:

```clj
(- 1)
;;=> -1

(- 6 3)
;;=> 3

(- 10 3 2)
;;=> 5
```

---

See Also:

[`cljs.core/+`](cljs.core_PLUS.md)<br>

---

Source docstring:

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

Source code:

```clj
(defn ^number -
  ([x] (cljs.core/- x))
  ([x y] (cljs.core/- x y))
  ([x y & more] (reduce - (cljs.core/- x y) more)))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1789-1794](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L1789-L1794)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric -
  ([x] (core/list 'js* "(- ~{})" x))
  ([x y] (core/list 'js* "(~{} - ~{})" x y))
  ([x y & more] `(- (- ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2505
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:413-416](https://github.com/clojure/clojurescript/blob/r2505/src/clj/cljs/core.clj#L413-L416)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/-"]))
```

```clj
{:description "If no `y`s are supplied, returns the negation of `x`, else subtracts the `y`s\nfrom `x` and returns the result.",
 :return-type number,
 :ns "cljs.core",
 :name "-",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/+"],
 :full-name-encode "cljs.core_-",
 :source {:code "(defn ^number -\n  ([x] (cljs.core/- x))\n  ([x y] (cljs.core/- x y))\n  ([x y & more] (reduce - (cljs.core/- x y) more)))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1789 1794]},
 :extra-sources ({:code "(defmacro ^::ana/numeric -\n  ([x] (core/list 'js* \"(- ~{})\" x))\n  ([x y] (core/list 'js* \"(~{} - ~{})\" x y))\n  ([x y & more] `(- (- ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2505",
                  :filename "src/clj/cljs/core.clj",
                  :lines [413 416]}),
 :examples [{:id "0a974e",
             :content "```clj\n(- 1)\n;;=> -1\n\n(- 6 3)\n;;=> 3\n\n(- 10 3 2)\n;;=> 5\n```"}],
 :full-name "cljs.core/-",
 :clj-symbol "clojure.core/-",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_-.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_-.cljsdoc)
</pre>

