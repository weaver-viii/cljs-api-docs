## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-xor

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-xor</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-xor)
</td>
</tr>
</table>

 <samp>
(__bit-xor__ x y)<br>
</samp>
 <samp>
(__bit-xor__ x y & more)<br>
</samp>

---

Bitwise "exclusive or". Same as `x ^ y` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-xor 2r1100 2r1010)
;;=> 6
;; 6 = 2r0110
```

Same numbers in decimal:

```clj
(bit-xor 12 10)
;;=> 6
```

---

See Also:

[`cljs.core/bit-and`](cljs.core_bit-and.md)<br>
[`cljs.core/bit-or`](cljs.core_bit-or.md)<br>

---

Source docstring:

```
Bitwise exclusive or
```

Source code:

```clj
(defn bit-xor
  [x y] (cljs.core/bit-xor x y))
```

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2035-2037](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L2035-L2037)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric bit-xor
  ([x y] (core/list 'js* "(~{} ^ ~{})" x y))
  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:508-510](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/core.clj#L508-L510)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-xor"]))
```

```clj
{:description "Bitwise \"exclusive or\". Same as `x ^ y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-xor",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-and" "cljs.core/bit-or"],
 :full-name-encode "cljs.core_bit-xor",
 :source {:code "(defn bit-xor\n  [x y] (cljs.core/bit-xor x y))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2035 2037]},
 :extra-sources ({:code "(defmacro ^::ana/numeric bit-xor\n  ([x y] (core/list 'js* \"(~{} ^ ~{})\" x y))\n  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2498",
                  :filename "src/clj/cljs/core.clj",
                  :lines [508 510]}),
 :examples [{:id "3ccd99",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-xor 2r1100 2r1010)\n;;=> 6\n;; 6 = 2r0110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-xor 12 10)\n;;=> 6\n```"}],
 :full-name "cljs.core/bit-xor",
 :clj-symbol "clojure.core/bit-xor",
 :docstring "Bitwise exclusive or"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-xor.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-xor.cljsdoc)
</pre>

