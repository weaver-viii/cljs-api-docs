## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/identical?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/identical?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/identical?)
</td>
</tr>
</table>

 <samp>
(__identical?__ x y)<br>
</samp>

---

Returns true if `x` and `y` are the same object, false otherwise.

---


See Also:

[`cljs.core/=`](cljs.core_EQ.md)<br>
[`cljs.core/==`](cljs.core_EQEQ.md)<br>

---

Source docstring:

```
Tests if 2 arguments are the same object
```

Source code:

```clj
(defn ^boolean identical?
  [x y]
  (cljs.core/identical? x y))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:61-64](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L61-L64)</ins>
</pre>


---

```clj
(defmacro identical? [a b]
  (bool-expr (list 'js* "(~{} === ~{})" a b)))
```

 <pre>
clojurescript @ r1933
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:246-247](https://github.com/clojure/clojurescript/blob/r1933/src/clj/cljs/core.clj#L246-L247)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/identical?"]))
```

```clj
{:description "Returns true if `x` and `y` are the same object, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "identical?",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/=" "cljs.core/=="],
 :full-name-encode "cljs.core_identicalQMARK",
 :source {:code "(defn ^boolean identical?\n  [x y]\n  (cljs.core/identical? x y))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [61 64]},
 :extra-sources ({:code "(defmacro identical? [a b]\n  (bool-expr (list 'js* \"(~{} === ~{})\" a b)))",
                  :repo "clojurescript",
                  :tag "r1933",
                  :filename "src/clj/cljs/core.clj",
                  :lines [246 247]}),
 :full-name "cljs.core/identical?",
 :clj-symbol "clojure.core/identical?",
 :docstring "Tests if 2 arguments are the same object"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_identicalQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_identicalQMARK.cljsdoc)
</pre>

