## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/quote

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quote</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quote)
</td>
</tr>
</table>

 <samp>
(__quote__ form)<br>
</samp>

---




Source docstring:

```
Yields the unevaluated form.
```

Source code:

```clj
(defmethod parse 'quote
  [_ env [_ x] _ _]
  (analyze (assoc env :quoted? true) x))
```

 <pre>
clojurescript @ r2985
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1026-1028](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/analyzer.clj#L1026-L1028)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/quote"]))
```

```clj
{:ns "special",
 :name "quote",
 :signature ["[form]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special_quote",
 :source {:code "(defmethod parse 'quote\n  [_ env [_ x] _ _]\n  (analyze (assoc env :quoted? true) x))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1026 1028]},
 :full-name "special/quote",
 :clj-symbol "clojure.core/quote",
 :docstring "Yields the unevaluated form."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_quote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_quote.cljsdoc)
</pre>

