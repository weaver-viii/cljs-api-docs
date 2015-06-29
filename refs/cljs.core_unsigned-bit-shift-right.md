## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unsigned-bit-shift-right

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2080"><img valign="middle" alt="[+] 0.0-2080" src="https://img.shields.io/badge/+-0.0--2080-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unsigned-bit-shift-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unsigned-bit-shift-right)
</td>
</tr>
</table>

 <samp>
(__unsigned-bit-shift-right__ x n)<br>
</samp>

---

Bitwise shift right with zero fill

---


See Also:

[`cljs.core/bit-shift-right`](cljs.core_bit-shift-right.md)<br>

---

Source docstring:

```
Bitwise shift right with zero fill
```

Source code:

```clj
(defn unsigned-bit-shift-right
  [x n] (cljs.core/unsigned-bit-shift-right x n))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2409-2411](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L2409-L2411)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unsigned-bit-shift-right [x n]
  (core/list 'js* "(~{} >>> ~{})" x n))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:553-554](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/core.clj#L553-L554)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unsigned-bit-shift-right"]))
```

```clj
{:description "Bitwise shift right with zero fill",
 :ns "cljs.core",
 :name "unsigned-bit-shift-right",
 :signature ["[x n]"],
 :history [["+" "0.0-2080"]],
 :type "function",
 :related ["cljs.core/bit-shift-right"],
 :full-name-encode "cljs.core_unsigned-bit-shift-right",
 :source {:code "(defn unsigned-bit-shift-right\n  [x n] (cljs.core/unsigned-bit-shift-right x n))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2409 2411]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unsigned-bit-shift-right [x n]\n  (core/list 'js* \"(~{} >>> ~{})\" x n))",
                  :repo "clojurescript",
                  :tag "r3149",
                  :filename "src/clj/cljs/core.clj",
                  :lines [553 554]}),
 :full-name "cljs.core/unsigned-bit-shift-right",
 :clj-symbol "clojure.core/unsigned-bit-shift-right",
 :docstring "Bitwise shift right with zero fill"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unsigned-bit-shift-right.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unsigned-bit-shift-right.cljsdoc)
</pre>

