## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-clear

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-clear</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-clear)
</td>
</tr>
</table>

 <samp>
(__bit-clear__ x n)<br>
</samp>

---

Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-clear 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-clear 15 2)
;;=> 11
```

---

See Also:

[`cljs.core/bit-set`](cljs.core_bit-set.md)<br>
[`cljs.core/bit-flip`](cljs.core_bit-flip.md)<br>

---

Source docstring:

```
Clear bit at index n
```

Source code:

```clj
(defn bit-clear
  [x n]
  (cljs.core/bit-clear x n))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2107-2110](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L2107-L2110)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric bit-clear [x n]
  (core/list 'js* "(~{} & ~(1 << ~{}))" x n))
```

 <pre>
clojurescript @ r2760
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:517-518](https://github.com/clojure/clojurescript/blob/r2760/src/clj/cljs/core.clj#L517-L518)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-clear"]))
```

```clj
{:description "Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-clear",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-set" "cljs.core/bit-flip"],
 :full-name-encode "cljs.core_bit-clear",
 :source {:code "(defn bit-clear\n  [x n]\n  (cljs.core/bit-clear x n))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2107 2110]},
 :extra-sources ({:code "(defmacro ^::ana/numeric bit-clear [x n]\n  (core/list 'js* \"(~{} & ~(1 << ~{}))\" x n))",
                  :repo "clojurescript",
                  :tag "r2760",
                  :filename "src/clj/cljs/core.clj",
                  :lines [517 518]}),
 :examples [{:id "0f6748",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-clear 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-clear 15 2)\n;;=> 11\n```"}],
 :full-name "cljs.core/bit-clear",
 :clj-symbol "clojure.core/bit-clear",
 :docstring "Clear bit at index n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-clear.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-clear.cljsdoc)
</pre>

