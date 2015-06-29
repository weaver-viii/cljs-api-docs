## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-and-not

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and-not)
</td>
</tr>
</table>

 <samp>
(__bit-and-not__ x y)<br>
</samp>
 <samp>
(__bit-and-not__ x y & more)<br>
</samp>

---

Bitwise "and" `x` with bitwise "not" `y`.  Same as `x & ~y` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-and-not 2r1100 2r1010)
;;=> 4
;; 4 = 2r0100
```

Same numbers in decimal:

```clj
(bit-and-not 12 10)
;;=> 4
```

Same result using `bit-and` and `bit-not`:

```clj
(bit-and 12 (bit-not 10))
;;=> 4
```

---

See Also:

[`cljs.core/bit-and`](cljs.core_bit-and.md)<br>
[`cljs.core/bit-not`](cljs.core_bit-not.md)<br>

---

Source docstring:

```
Bitwise and
```

Source code:

```clj
(defn bit-and-not
  [x y] (cljs.core/bit-and-not x y))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1908-1910](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L1908-L1910)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric bit-and-not
  ([x y] (core/list 'js* "(~{} & ~~{})" x y))
  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2280
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:527-529](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/core.clj#L527-L529)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-and-not"]))
```

```clj
{:description "Bitwise \"and\" `x` with bitwise \"not\" `y`.  Same as `x & ~y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-and-not",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/bit-and" "cljs.core/bit-not"],
 :full-name-encode "cljs.core_bit-and-not",
 :source {:code "(defn bit-and-not\n  [x y] (cljs.core/bit-and-not x y))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1908 1910]},
 :extra-sources ({:code "(defmacro ^::ana/numeric bit-and-not\n  ([x y] (core/list 'js* \"(~{} & ~~{})\" x y))\n  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2280",
                  :filename "src/clj/cljs/core.clj",
                  :lines [527 529]}),
 :examples [{:id "16f35d",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-and-not 2r1100 2r1010)\n;;=> 4\n;; 4 = 2r0100\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and-not 12 10)\n;;=> 4\n```\n\nSame result using `bit-and` and `bit-not`:\n\n```clj\n(bit-and 12 (bit-not 10))\n;;=> 4\n```"}],
 :full-name "cljs.core/bit-and-not",
 :clj-symbol "clojure.core/bit-and-not",
 :docstring "Bitwise and"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-and-not.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-and-not.cljsdoc)
</pre>

