## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-and

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and)
</td>
</tr>
</table>

 <samp>
(__bit-and__ x y)<br>
</samp>
 <samp>
(__bit-and__ x y & more)<br>
</samp>

---

Bitwise "and".  Same as `x & y` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-and 2r1100 2r1010)
;;=> 8
;; 8 = 2r1000
```

Same numbers in decimal:

```clj
(bit-and 12 10)
;;=> 8
```

---

See Also:

[`cljs.core/bit-or`](cljs.core_bit-or.md)<br>

---

Source docstring:

```
Bitwise and
```

Source code:

```clj
(defn bit-and
  [x y] (cljs.core/bit-and x y))
```

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1659-1661](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L1659-L1661)</ins>
</pre>


---

```clj
(defmacro bit-and
  ([x y] (list 'js* "(~{} & ~{})" x y))
  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r1859
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:414-416](https://github.com/clojure/clojurescript/blob/r1859/src/clj/cljs/core.clj#L414-L416)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-and"]))
```

```clj
{:description "Bitwise \"and\".  Same as `x & y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-and",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-or"],
 :full-name-encode "cljs.core_bit-and",
 :source {:code "(defn bit-and\n  [x y] (cljs.core/bit-and x y))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1659 1661]},
 :extra-sources ({:code "(defmacro bit-and\n  ([x y] (list 'js* \"(~{} & ~{})\" x y))\n  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r1859",
                  :filename "src/clj/cljs/core.clj",
                  :lines [414 416]}),
 :examples [{:id "3c0470",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-and 2r1100 2r1010)\n;;=> 8\n;; 8 = 2r1000\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and 12 10)\n;;=> 8\n```"}],
 :full-name "cljs.core/bit-and",
 :clj-symbol "clojure.core/bit-and",
 :docstring "Bitwise and"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-and.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-and.cljsdoc)
</pre>

