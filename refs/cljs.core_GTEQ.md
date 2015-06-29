## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/>=

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/>=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/%3E=)
</td>
</tr>
</table>

 <samp>
(__>=__ x)<br>
</samp>
 <samp>
(__>=__ x y)<br>
</samp>
 <samp>
(__>=__ x y & more)<br>
</samp>

---

Returns true if each successive number argument is less than or equal to the
previous one, false otherwise.

---

Example:

```clj
(>= 2 1)
;;=> true

(>= 2 2)
;;=> true

(>= 1 2)
;;=> false

(>= 6 5 4 3 2)
;;=> true
```

---

See Also:

[`cljs.core/>`](cljs.core_GT.md)<br>

---

Source docstring:

```
Returns non-nil if nums are in monotonically non-increasing order,
otherwise false.
```

Source code:

```clj
(defn ^boolean >=
  ([x] true)
  ([x y] (cljs.core/>= x y))
  ([x y & more]
   (if (cljs.core/>= x y)
     (if (next more)
       (recur y (first more) (next more))
       (cljs.core/>= y (first more)))
     false)))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1459-1469](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L1459-L1469)</ins>
</pre>


---

```clj
(defmacro >=
  ([x] true)
  ([x y] (bool-expr (list 'js* "(~{} >= ~{})" x y)))
  ([x y & more] `(and (>= ~x ~y) (>= ~y ~@more))))
```

 <pre>
clojurescript @ r1895
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:377-380](https://github.com/clojure/clojurescript/blob/r1895/src/clj/cljs/core.clj#L377-L380)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/>="]))
```

```clj
{:description "Returns true if each successive number argument is less than or equal to the\nprevious one, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name ">=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/>"],
 :full-name-encode "cljs.core_GTEQ",
 :source {:code "(defn ^boolean >=\n  ([x] true)\n  ([x y] (cljs.core/>= x y))\n  ([x y & more]\n   (if (cljs.core/>= x y)\n     (if (next more)\n       (recur y (first more) (next more))\n       (cljs.core/>= y (first more)))\n     false)))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1459 1469]},
 :extra-sources ({:code "(defmacro >=\n  ([x] true)\n  ([x y] (bool-expr (list 'js* \"(~{} >= ~{})\" x y)))\n  ([x y & more] `(and (>= ~x ~y) (>= ~y ~@more))))",
                  :repo "clojurescript",
                  :tag "r1895",
                  :filename "src/clj/cljs/core.clj",
                  :lines [377 380]}),
 :examples [{:id "de73d7",
             :content "```clj\n(>= 2 1)\n;;=> true\n\n(>= 2 2)\n;;=> true\n\n(>= 1 2)\n;;=> false\n\n(>= 6 5 4 3 2)\n;;=> true\n```"}],
 :full-name "cljs.core/>=",
 :clj-symbol "clojure.core/>=",
 :docstring "Returns non-nil if nums are in monotonically non-increasing order,\notherwise false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_GTEQ.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_GTEQ.cljsdoc)
</pre>

