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






Source code:

```clj
(defmethod parse 'quote
  [_ env [_ x] _]
  (analyze (assoc env :quoted? true) x))
```

 <pre>
clojurescript @ r2199
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:876-878](https://github.com/clojure/clojurescript/blob/r2199/src/clj/cljs/analyzer.clj#L876-L878)</ins>
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
 :type "special form",
 :source {:code "(defmethod parse 'quote\n  [_ env [_ x] _]\n  (analyze (assoc env :quoted? true) x))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [876 878]},
 :full-name "special/quote",
 :full-name-encode "special_quote",
 :clj-symbol "clojure.core/quote",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_quote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_quote.cljsdoc)
</pre>

