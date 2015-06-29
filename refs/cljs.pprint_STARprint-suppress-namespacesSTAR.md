## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-suppress-namespaces\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-suppress-namespaces\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-suppress-namespaces*)
</td>
</tr>
</table>





Source docstring:

```
Don't print namespaces with symbols. This is particularly useful when
pretty printing the results of macro expansions
```

Source code:

```clj
(def ^:dynamic
^{:doc "Don't print namespaces with symbols. This is particularly useful when
pretty printing the results of macro expansions"
  :added "1.2"}
*print-suppress-namespaces* nil)
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:658-662](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.cljs#L658-L662)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-suppress-namespaces*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-suppress-namespaces*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-suppress-namespacesSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"Don't print namespaces with symbols. This is particularly useful when\npretty printing the results of macro expansions\"\n  :added \"1.2\"}\n*print-suppress-namespaces* nil)",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [658 662]},
 :full-name "cljs.pprint/*print-suppress-namespaces*",
 :clj-symbol "clojure.pprint/*print-suppress-namespaces*",
 :docstring "Don't print namespaces with symbols. This is particularly useful when\npretty printing the results of macro expansions"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-suppress-namespacesSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-suppress-namespacesSTAR.cljsdoc)
</pre>

