## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-miser-width\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-miser-width\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-miser-width*)
</td>
</tr>
</table>





Source docstring:

```
The column at which to enter miser style. Depending on the dispatch table,
miser style add newlines in more places to try to keep lines short allowing for further
levels of nesting.
```

Source code:

```clj
(def ^:dynamic
 ^{:doc "The column at which to enter miser style. Depending on the dispatch table,
miser style add newlines in more places to try to keep lines short allowing for further
levels of nesting.",
   :added "1.2"}
 *print-miser-width* 40)
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:633-638](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/pprint.cljs#L633-L638)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-miser-width*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-miser-width*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-miser-widthSTAR",
 :source {:code "(def ^:dynamic\n ^{:doc \"The column at which to enter miser style. Depending on the dispatch table,\nmiser style add newlines in more places to try to keep lines short allowing for further\nlevels of nesting.\",\n   :added \"1.2\"}\n *print-miser-width* 40)",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [633 638]},
 :full-name "cljs.pprint/*print-miser-width*",
 :clj-symbol "clojure.pprint/*print-miser-width*",
 :docstring "The column at which to enter miser style. Depending on the dispatch table,\nmiser style add newlines in more places to try to keep lines short allowing for further\nlevels of nesting."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-miser-widthSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-miser-widthSTAR.cljsdoc)
</pre>

