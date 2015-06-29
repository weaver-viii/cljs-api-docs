## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-set)
</td>
</tr>
</table>

 <samp>
(__bit-set__ x n)<br>
</samp>

---

Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-set 2r1100 1)
;;=> 14
;; 14 = 2r1110
```

Same number in decimal:

```clj
(bit-set 12 1)
;;=> 14
```

---

See Also:

[`cljs.core/bit-clear`](cljs.core_bit-clear.md)<br>

---

Source docstring:

```
Set bit at index n
```

Source code:

```clj
(defn bit-set
  [x n]
  (cljs.core/bit-set x n))
```

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1605-1608](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1605-L1608)</ins>
</pre>


---

```clj
(defmacro bit-set [x n]
  (list 'js* "(~{} | (1 << ~{}))" x n))
```

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:442-443](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L442-L443)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-set"]))
```

```clj
{:description "Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-set",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-clear"],
 :full-name-encode "cljs.core_bit-set",
 :source {:code "(defn bit-set\n  [x n]\n  (cljs.core/bit-set x n))",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1605 1608]},
 :extra-sources ({:code "(defmacro bit-set [x n]\n  (list 'js* \"(~{} | (1 << ~{}))\" x n))",
                  :repo "clojurescript",
                  :tag "r1803",
                  :filename "src/clj/cljs/core.clj",
                  :lines [442 443]}),
 :examples [{:id "6a8a49",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-set 2r1100 1)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame number in decimal:\n\n```clj\n(bit-set 12 1)\n;;=> 14\n```"}],
 :full-name "cljs.core/bit-set",
 :clj-symbol "clojure.core/bit-set",
 :docstring "Set bit at index n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-set.cljsdoc)
</pre>

