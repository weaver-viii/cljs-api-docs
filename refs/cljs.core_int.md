## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/int)
</td>
</tr>
</table>

 <samp>
(__int__ x)<br>
</samp>

---

Coerces `x` to an integer by stripping decimal places.

---


See Also:

[`cljs.core/char`](cljs.core_char.md)<br>
[`cljs.core/integer?`](cljs.core_integerQMARK.md)<br>

---

Source docstring:

```
Coerce to int by stripping decimal places.
```

Source code:

```clj
(defn int
  [x]
  (bit-or x 0))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1586-1589](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L1586-L1589)</ins>
</pre>


---

```clj
(defmacro int [x]
  `(bit-or ~x 0))
```

 <pre>
clojurescript @ r1895
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:433-434](https://github.com/clojure/clojurescript/blob/r1895/src/clj/cljs/core.clj#L433-L434)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/int"]))
```

```clj
{:description "Coerces `x` to an integer by stripping decimal places.",
 :ns "cljs.core",
 :name "int",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/char" "cljs.core/integer?"],
 :full-name-encode "cljs.core_int",
 :source {:code "(defn int\n  [x]\n  (bit-or x 0))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1586 1589]},
 :extra-sources ({:code "(defmacro int [x]\n  `(bit-or ~x 0))",
                  :repo "clojurescript",
                  :tag "r1895",
                  :filename "src/clj/cljs/core.clj",
                  :lines [433 434]}),
 :full-name "cljs.core/int",
 :clj-symbol "clojure.core/int",
 :docstring "Coerce to int by stripping decimal places."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_int.cljsdoc)
</pre>

