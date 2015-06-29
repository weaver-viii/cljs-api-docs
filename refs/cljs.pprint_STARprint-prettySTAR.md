## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-pretty\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-pretty\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pretty*)
</td>
</tr>
</table>





Source docstring:

```
Bind to true if you want write to use pretty printing
```

Source code:

```clj
(def ^:dynamic
 ^{:doc "Bind to true if you want write to use pretty printing"}
 *print-pretty* true)
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:617-619](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/pprint.cljs#L617-L619)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-pretty*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-pretty*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-prettySTAR",
 :source {:code "(def ^:dynamic\n ^{:doc \"Bind to true if you want write to use pretty printing\"}\n *print-pretty* true)",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [617 619]},
 :full-name "cljs.pprint/*print-pretty*",
 :clj-symbol "clojure.pprint/*print-pretty*",
 :docstring "Bind to true if you want write to use pretty printing"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-prettySTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-prettySTAR.cljsdoc)
</pre>

