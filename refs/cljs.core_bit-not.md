## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-not

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-not)
</td>
</tr>
</table>

 <samp>
(__bit-not__ x)<br>
</samp>

---

Bitwise complement.  Same as `~x` in JavaScript.

---

Example:

Bits can be entered using radix notation:

```clj
(bit-not 2r1100)
;;=> -13
```

Same numbers in decimal:

```clj
(bit-not 12)
;;=> -13
```

---


Source docstring:

```
Bitwise complement
```

Source code:

```clj
(defn bit-not
  [x] (cljs.core/bit-not x))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1186-1188](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1186-L1188)</ins>
</pre>


---

```clj
(defmacro bit-not [x]
  (list 'js* "(~ ~{})" x))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:191-192](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L191-L192)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-not"]))
```

```clj
{:description "Bitwise complement.  Same as `~x` in JavaScript.",
 :ns "cljs.core",
 :name "bit-not",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-not",
 :source {:code "(defn bit-not\n  [x] (cljs.core/bit-not x))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1186 1188]},
 :extra-sources ({:code "(defmacro bit-not [x]\n  (list 'js* \"(~ ~{})\" x))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [191 192]}),
 :examples [{:id "d4c5e3",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-not 2r1100)\n;;=> -13\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-not 12)\n;;=> -13\n```"}],
 :full-name "cljs.core/bit-not",
 :clj-symbol "clojure.core/bit-not",
 :docstring "Bitwise complement"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-not.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-not.cljsdoc)
</pre>
