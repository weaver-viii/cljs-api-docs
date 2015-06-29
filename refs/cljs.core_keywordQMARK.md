## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keyword?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword?)
</td>
</tr>
</table>

 <samp>
(__keyword?__ x)<br>
</samp>

---




Source docstring:

```
Return true if x is a Keyword
```

Source code:

```clj
(defn ^boolean keyword?
  [x]
  (instance? Keyword x))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2795-2798](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L2795-L2798)</ins>
</pre>


---

```clj
(defmacro keyword? [x]
  (bool-expr `(instance? Keyword ~x)))
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:355-356](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/core.clj#L355-L356)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "keyword?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keywordQMARK",
 :source {:code "(defn ^boolean keyword?\n  [x]\n  (instance? Keyword x))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2795 2798]},
 :extra-sources ({:code "(defmacro keyword? [x]\n  (bool-expr `(instance? Keyword ~x)))",
                  :repo "clojurescript",
                  :tag "r3165",
                  :filename "src/clj/cljs/core.clj",
                  :lines [355 356]}),
 :full-name "cljs.core/keyword?",
 :clj-symbol "clojure.core/keyword?",
 :docstring "Return true if x is a Keyword"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keywordQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keywordQMARK.cljsdoc)
</pre>

