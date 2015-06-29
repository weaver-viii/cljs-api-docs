## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*out\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *out* nil)
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:20](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/pprint.cljs#L20)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*out*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*out*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *out* nil)",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [20]},
 :full-name "cljs.pprint/*out*",
 :full-name-encode "cljs.pprint_STARoutSTAR",
 :history [["+" "0.0-3255"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARoutSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARoutSTAR.cljsdoc)
</pre>

