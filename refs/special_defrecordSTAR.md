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
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:1637-1639](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/analyzer.cljc#L1637-L1639)</ins>
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
          :tag "r3264",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [1637 1639]},
 :full-name "special/defrecord*",
 :full-name-encode "special_defrecordSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_defrecordSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_defrecordSTAR.cljsdoc)
</pre>

