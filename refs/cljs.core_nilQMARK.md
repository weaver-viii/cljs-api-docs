## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nil?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nil?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nil?)
</td>
</tr>
</table>

 <samp>
(__nil?__ x)<br>
</samp>

---

Returns true if `x` is nil, false otherwise.

---


See Also:

[`cljs.core/true?`](cljs.core_trueQMARK.md)<br>
[`cljs.core/false?`](cljs.core_falseQMARK.md)<br>
[`cljs.core/identity`](cljs.core_identity.md)<br>

---

Source docstring:

```
Returns true if x is nil, false otherwise.
```

Source code:

```clj
(defn nil?
  [x]
  (identical? x nil))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:214-217](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L214-L217)</ins>
</pre>


---

```clj
(defmacro nil? [x]
  `(identical? ~x nil))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:45-46](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/core.clj#L45-L46)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nil?"]))
```

```clj
{:description "Returns true if `x` is nil, false otherwise.",
 :ns "cljs.core",
 :name "nil?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/false?" "cljs.core/identity"],
 :full-name-encode "cljs.core_nilQMARK",
 :source {:code "(defn nil?\n  [x]\n  (identical? x nil))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [214 217]},
 :extra-sources ({:code "(defmacro nil? [x]\n  `(identical? ~x nil))",
                  :repo "clojurescript",
                  :tag "r993",
                  :filename "src/clj/cljs/core.clj",
                  :lines [45 46]}),
 :full-name "cljs.core/nil?",
 :clj-symbol "clojure.core/nil?",
 :docstring "Returns true if x is nil, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nilQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nilQMARK.cljsdoc)
</pre>

