## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/deftype\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'deftype*
  [_ env form _ _]
  (parse-type :deftype* env form))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1512-1514](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/analyzer.clj#L1512-L1514)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/deftype*"]))
```

```clj
{:ns "special",
 :name "deftype*",
 :type "special form",
 :source {:code "(defmethod parse 'deftype*\n  [_ env form _ _]\n  (parse-type :deftype* env form))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1512 1514]},
 :full-name "special/deftype*",
 :full-name-encode "special_deftypeSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_deftypeSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_deftypeSTAR.cljsdoc)
</pre>

