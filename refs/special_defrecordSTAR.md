## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/defrecord\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'defrecord*
  [_ env form _ _]
  (parse-type :defrecord* env form) )
```

 <pre>
clojurescript @ r2511
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1265-1267](https://github.com/clojure/clojurescript/blob/r2511/src/clj/cljs/analyzer.clj#L1265-L1267)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/defrecord*"]))
```

```clj
{:ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env form _ _]\n  (parse-type :defrecord* env form) )",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1265 1267]},
 :full-name "special/defrecord*",
 :full-name-encode "special_defrecordSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_defrecordSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_defrecordSTAR.cljsdoc)
</pre>

