## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-flip

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-flip</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-flip)
</td>
</tr>
</table>

 <samp>
(__bit-flip__ x n)<br>
</samp>

---

Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-flip 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-flip 15 2)
;;=> 11
```

---

See Also:

[`cljs.core/bit-set`](cljs.core_bit-set.md)<br>
[`cljs.core/bit-clear`](cljs.core_bit-clear.md)<br>

---

Source docstring:

```
Flip bit at index n
```

Source code:

```clj
(defn bit-flip
  [x n]
  (cljs.core/bit-flip x n))
```

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1674-1677](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L1674-L1677)</ins>
</pre>


---

```clj
(defmacro bit-flip [x n]
  (list 'js* "(~{} ^ (1 << ~{}))" x n))
```

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:444-445](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/core.clj#L444-L445)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-flip"]))
```

```clj
{:description "Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-flip",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-set" "cljs.core/bit-clear"],
 :full-name-encode "cljs.core_bit-flip",
 :source {:code "(defn bit-flip\n  [x n]\n  (cljs.core/bit-flip x n))",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1674 1677]},
 :extra-sources ({:code "(defmacro bit-flip [x n]\n  (list 'js* \"(~{} ^ (1 << ~{}))\" x n))",
                  :repo "clojurescript",
                  :tag "r1878",
                  :filename "src/clj/cljs/core.clj",
                  :lines [444 445]}),
 :examples [{:id "5d7ee0",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-flip 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-flip 15 2)\n;;=> 11\n```"}],
 :full-name "cljs.core/bit-flip",
 :clj-symbol "clojure.core/bit-flip",
 :docstring "Flip bit at index n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-flip.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-flip.cljsdoc)
</pre>

