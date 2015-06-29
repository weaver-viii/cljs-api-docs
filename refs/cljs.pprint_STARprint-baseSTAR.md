## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-base\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-base\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-base*)
</td>
</tr>
</table>





Source docstring:

```
The base to use for printing integers and rationals.
```

Source code:

```clj
(def ^:dynamic
^{:doc "The base to use for printing integers and rationals."
  :added "1.2"}
*print-base* 10)
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:673-676](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.cljs#L673-L676)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-base*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-base*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-baseSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"The base to use for printing integers and rationals.\"\n  :added \"1.2\"}\n*print-base* 10)",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [673 676]},
 :full-name "cljs.pprint/*print-base*",
 :clj-symbol "clojure.pprint/*print-base*",
 :docstring "The base to use for printing integers and rationals."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-baseSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-baseSTAR.cljsdoc)
</pre>

