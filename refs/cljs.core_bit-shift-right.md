## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-right

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-shift-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-shift-right)
</td>
</tr>
</table>

 <samp>
(__bit-shift-right__ x n)<br>
</samp>

---

Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-shift-right 2r1010 1)
;;=> 5
;; 5 = 2r0101
```

Same numbers in decimal:

```clj
(bit-shift-right 10 1)
;;=> 5
```

---

See Also:

[`cljs.core/bit-shift-left`](cljs.core_bit-shift-left.md)<br>
[`cljs.core/unsigned-bit-shift-right`](cljs.core_unsigned-bit-shift-right.md)<br>

---

Source docstring:

```
Bitwise shift right
```

Source code:

```clj
(defn bit-shift-right
  [x n] (cljs.core/bit-shift-right x n))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1681-1683](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1681-L1683)</ins>
</pre>


---

```clj
(defmacro bit-shift-right [x n]
  (list 'js* "(~{} >> ~{})" x n))
```

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:450-451](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L450-L451)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-shift-right"]))
```

```clj
{:description "Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.",
 :ns "cljs.core",
 :name "bit-shift-right",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-shift-left"
           "cljs.core/unsigned-bit-shift-right"],
 :full-name-encode "cljs.core_bit-shift-right",
 :source {:code "(defn bit-shift-right\n  [x n] (cljs.core/bit-shift-right x n))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1681 1683]},
 :extra-sources ({:code "(defmacro bit-shift-right [x n]\n  (list 'js* \"(~{} >> ~{})\" x n))",
                  :repo "clojurescript",
                  :tag "r1843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [450 451]}),
 :examples [{:id "5b75af",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-shift-right 2r1010 1)\n;;=> 5\n;; 5 = 2r0101\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-shift-right 10 1)\n;;=> 5\n```"}],
 :full-name "cljs.core/bit-shift-right",
 :clj-symbol "clojure.core/bit-shift-right",
 :docstring "Bitwise shift right"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-shift-right.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-shift-right.cljsdoc)
</pre>

