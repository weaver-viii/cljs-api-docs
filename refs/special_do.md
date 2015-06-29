## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/do

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/do</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)
</td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'do
  [op env [_ & exprs :as form] _]
  (let [block (analyze-block env exprs)]
    (merge {:env env :op :do :form form :children (block-children block)} block)))
```

 <pre>
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:447-450](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/analyzer.clj#L447-L450)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/do"]))
```

```clj
{:ns "special",
 :name "do",
 :type "special form",
 :source {:code "(defmethod parse 'do\n  [op env [_ & exprs :as form] _]\n  (let [block (analyze-block env exprs)]\n    (merge {:env env :op :do :form form :children (block-children block)} block)))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [447 450]},
 :full-name "special/do",
 :full-name-encode "special_do",
 :clj-symbol "clojure.core/do",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_do.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_do.cljsdoc)
</pre>

