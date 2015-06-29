## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/neg?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/neg?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/neg?)
</td>
</tr>
</table>

 <samp>
(__neg?__ n)<br>
</samp>

---

Returns true if `n` is less than 0, false otherwise.

---


See Also:

[`cljs.core/pos?`](cljs.core_posQMARK.md)<br>
[`cljs.core/zero?`](cljs.core_zeroQMARK.md)<br>

---

Source docstring:

```
Returns true if num is less than zero, else false
```

Source code:

```clj
(defn neg?
  [x] (js* "(~{x} < 0)"))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:966-968](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L966-L968)</ins>
</pre>


---

```clj
(defmacro neg? [x]
  `(< ~x 0))
```

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:115-116](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L115-L116)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/neg?"]))
```

```clj
{:description "Returns true if `n` is less than 0, false otherwise.",
 :ns "cljs.core",
 :name "neg?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/pos?" "cljs.core/zero?"],
 :full-name-encode "cljs.core_negQMARK",
 :source {:code "(defn neg?\n  [x] (js* \"(~{x} < 0)\"))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [966 968]},
 :extra-sources ({:code "(defmacro neg? [x]\n  `(< ~x 0))",
                  :repo "clojurescript",
                  :tag "r927",
                  :filename "src/clj/cljs/core.clj",
                  :lines [115 116]}),
 :full-name "cljs.core/neg?",
 :clj-symbol "clojure.core/neg?",
 :docstring "Returns true if num is less than zero, else false"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_negQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_negQMARK.cljsdoc)
</pre>

