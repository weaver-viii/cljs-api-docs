## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-test

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-test</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-test)
</td>
</tr>
</table>

 <samp>
(__bit-test__ x n)<br>
</samp>

---

Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-test 2r0100 2)
;;=> true

(bit-test 2r0100 1)
;;=> false
```

Same numbers in decimal:

```clj
(bit-test 4 2)
;;=> true

(bit-test 4 1)
;;=> false
```

---


Source docstring:

```
Test bit at index n
```

Source code:

```clj
(defn ^boolean bit-test
  [x n]
  (cljs.core/bit-test x n))
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2196-2199](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L2196-L2199)</ins>
</pre>


---

```clj
(defmacro bit-test [x n]
  (bool-expr (core/list 'js* "((~{} & (1 << ~{})) != 0)" x n)))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:530-531](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/core.clj#L530-L531)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-test"]))
```

```clj
{:description "Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.",
 :return-type boolean,
 :ns "cljs.core",
 :name "bit-test",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-test",
 :source {:code "(defn ^boolean bit-test\n  [x n]\n  (cljs.core/bit-test x n))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2196 2199]},
 :extra-sources ({:code "(defmacro bit-test [x n]\n  (bool-expr (core/list 'js* \"((~{} & (1 << ~{})) != 0)\" x n)))",
                  :repo "clojurescript",
                  :tag "r3058",
                  :filename "src/clj/cljs/core.clj",
                  :lines [530 531]}),
 :examples [{:id "f64664",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-test 2r0100 2)\n;;=> true\n\n(bit-test 2r0100 1)\n;;=> false\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-test 4 2)\n;;=> true\n\n(bit-test 4 1)\n;;=> false\n```"}],
 :full-name "cljs.core/bit-test",
 :clj-symbol "clojure.core/bit-test",
 :docstring "Test bit at index n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-test.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-test.cljsdoc)
</pre>

