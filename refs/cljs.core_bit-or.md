## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-or

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-or</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-or)
</td>
</tr>
</table>

 <samp>
(__bit-or__ x y)<br>
</samp>
 <samp>
(__bit-or__ x y & more)<br>
</samp>

---

Bitwise "or". Same as `x | y` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-or 2r1100 2r1010)
;;=> 14
;; 14 = 2r1110
```

Same numbers in decimal:

```clj
(bit-or 12 10)
;;=> 14
```

---

See Also:

[`cljs.core/bit-and`](cljs.core_bit-and.md)<br>
[`cljs.core/bit-xor`](cljs.core_bit-xor.md)<br>

---

Source docstring:

```
Bitwise or
```

Source code:

```clj
(defn bit-or
  [x y] (cljs.core/bit-or x y))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1348-1350](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1348-L1350)</ins>
</pre>


---

```clj
(defmacro bit-or
  ([x y] (list 'js* "(~{} | ~{})" x y))
  ([x y & more] `(bit-or (bit-or ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:308-310](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L308-L310)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-or"]))
```

```clj
{:description "Bitwise \"or\". Same as `x | y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-or",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-and" "cljs.core/bit-xor"],
 :full-name-encode "cljs.core_bit-or",
 :source {:code "(defn bit-or\n  [x y] (cljs.core/bit-or x y))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1348 1350]},
 :extra-sources ({:code "(defmacro bit-or\n  ([x y] (list 'js* \"(~{} | ~{})\" x y))\n  ([x y & more] `(bit-or (bit-or ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r1513",
                  :filename "src/clj/cljs/core.clj",
                  :lines [308 310]}),
 :examples [{:id "ecea10",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-or 2r1100 2r1010)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-or 12 10)\n;;=> 14\n```"}],
 :full-name "cljs.core/bit-or",
 :clj-symbol "clojure.core/bit-or",
 :docstring "Bitwise or"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-or.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-or.cljsdoc)
</pre>

