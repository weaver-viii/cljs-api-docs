## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-count

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bit-count__ x)<br>
</samp>

---

Counts the number of bits set in `x`.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-count 2r1011)
;;=> 3
```

Same number in decimal:

```clj
(bit-count 11)
;;=> 3
```

---


Source docstring:

```
Counts the number of bits set in n
```

Source code:

```clj
(defn bit-count
  [n]
  (loop [c 0 n n]
    (if (zero? n)
      c
      (recur (inc c) (bit-and n (dec n))))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1212-1218](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1212-L1218)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-count"]))
```

```clj
{:description "Counts the number of bits set in `x`.",
 :ns "cljs.core",
 :name "bit-count",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_bit-count",
 :source {:code "(defn bit-count\n  [n]\n  (loop [c 0 n n]\n    (if (zero? n)\n      c\n      (recur (inc c) (bit-and n (dec n))))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1212 1218]},
 :examples [{:id "35c78c",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-count 2r1011)\n;;=> 3\n```\n\nSame number in decimal:\n\n```clj\n(bit-count 11)\n;;=> 3\n```"}],
 :full-name "cljs.core/bit-count",
 :docstring "Counts the number of bits set in n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-count.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-count.cljsdoc)
</pre>

