## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-left

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-shift-left</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-shift-left)
</td>
</tr>
</table>

 <samp>
(__bit-shift-left__ x n)<br>
</samp>

---

Bitwise shift left `n` bits.  Same as `x << n` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-shift-left 2r0101 1)
;;=> 10
;; 10 = 2r1010
```

Same numbers in decimal:

```clj
(bit-shift-left 5 1)
;;=> 10
```

---

See Also:

[`cljs.core/bit-shift-right`](cljs.core_bit-shift-right.md)<br>

---

Source docstring:

```
Bitwise shift left
```

Source code:

```clj
(defn bit-shift-left
  [x n] (cljs.core/bit-shift-left x n))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2397-2399](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L2397-L2399)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric bit-shift-left [x n]
  (core/list 'js* "(~{} << ~{})" x n))
```

 <pre>
clojurescript @ r3169
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:544-545](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/core.clj#L544-L545)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-shift-left"]))
```

```clj
{:description "Bitwise shift left `n` bits.  Same as `x << n` in JavaScript.",
 :ns "cljs.core",
 :name "bit-shift-left",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-shift-right"],
 :full-name-encode "cljs.core_bit-shift-left",
 :source {:code "(defn bit-shift-left\n  [x n] (cljs.core/bit-shift-left x n))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2397 2399]},
 :extra-sources ({:code "(defmacro ^::ana/numeric bit-shift-left [x n]\n  (core/list 'js* \"(~{} << ~{})\" x n))",
                  :repo "clojurescript",
                  :tag "r3169",
                  :filename "src/clj/cljs/core.clj",
                  :lines [544 545]}),
 :examples [{:id "67c34a",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-shift-left 2r0101 1)\n;;=> 10\n;; 10 = 2r1010\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-shift-left 5 1)\n;;=> 10\n```"}],
 :full-name "cljs.core/bit-shift-left",
 :clj-symbol "clojure.core/bit-shift-left",
 :docstring "Bitwise shift left"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-shift-left.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-shift-left.cljsdoc)
</pre>

