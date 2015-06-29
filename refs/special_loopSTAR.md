## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/loop\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'loop*
  [op encl-env form _ _]
  (analyze-let encl-env form true))
```

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:981-983](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/analyzer.clj#L981-L983)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/loop*"]))
```

```clj
{:ns "special",
 :name "loop*",
 :type "special form",
 :source {:code "(defmethod parse 'loop*\n  [op encl-env form _ _]\n  (analyze-let encl-env form true))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [981 983]},
 :full-name "special/loop*",
 :full-name-encode "special_loopSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_loopSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_loopSTAR.cljsdoc)
</pre>

