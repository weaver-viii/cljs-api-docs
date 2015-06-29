## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/let\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'let*
  [op encl-env form _]
  (analyze-let encl-env form false))
```

 <pre>
clojurescript @ r1844
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:516-518](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/analyzer.clj#L516-L518)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/let*"]))
```

```clj
{:ns "special",
 :name "let*",
 :type "special form",
 :source {:code "(defmethod parse 'let*\n  [op encl-env form _]\n  (analyze-let encl-env form false))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [516 518]},
 :full-name "special/let*",
 :full-name-encode "special_letSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_letSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_letSTAR.cljsdoc)
</pre>

