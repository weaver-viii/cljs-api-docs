## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/false?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>

 <samp>
(__false?__ x)<br>
</samp>

---

Returns true if `x` is the value false, false otherwise.

---


See Also:

[`cljs.core/true?`](cljs.core_trueQMARK.md)<br>
[`cljs.core/not`](cljs.core_not.md)<br>

---

Source docstring:

```
Returns true if x is the value false, false otherwise.
```

Source code:

```clj
(defn ^boolean false?
  [x] (cljs.core/false? x))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1427-1429](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L1427-L1429)</ins>
</pre>


---

```clj
(defmacro false? [x]
  (bool-expr (core/list 'js* "~{} === false" x)))
```

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:313-314](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/core.clj#L313-L314)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/false?"]))
```

```clj
{:description "Returns true if `x` is the value false, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/not"],
 :full-name-encode "cljs.core_falseQMARK",
 :source {:code "(defn ^boolean false?\n  [x] (cljs.core/false? x))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1427 1429]},
 :extra-sources ({:code "(defmacro false? [x]\n  (bool-expr (core/list 'js* \"~{} === false\" x)))",
                  :repo "clojurescript",
                  :tag "r2356",
                  :filename "src/clj/cljs/core.clj",
                  :lines [313 314]}),
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_falseQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_falseQMARK.cljsdoc)
</pre>

