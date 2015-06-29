## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-pprint-dispatch\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-pprint-dispatch\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pprint-dispatch*)
</td>
</tr>
</table>





Source docstring:

```
The pretty print dispatch function. Use with-pprint-dispatch or
set-pprint-dispatch to modify.
```

Source code:

```clj
(defonce ^:dynamic
 ^{:doc "The pretty print dispatch function. Use with-pprint-dispatch or
set-pprint-dispatch to modify."
   :added "1.2"}
 *print-pprint-dispatch* nil)
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:620-624](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.cljs#L620-L624)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-pprint-dispatch*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-pprint-dispatch*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-pprint-dispatchSTAR",
 :source {:code "(defonce ^:dynamic\n ^{:doc \"The pretty print dispatch function. Use with-pprint-dispatch or\nset-pprint-dispatch to modify.\"\n   :added \"1.2\"}\n *print-pprint-dispatch* nil)",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [620 624]},
 :full-name "cljs.pprint/*print-pprint-dispatch*",
 :clj-symbol "clojure.pprint/*print-pprint-dispatch*",
 :docstring "The pretty print dispatch function. Use with-pprint-dispatch or\nset-pprint-dispatch to modify."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-pprint-dispatchSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-pprint-dispatchSTAR.cljsdoc)
</pre>

