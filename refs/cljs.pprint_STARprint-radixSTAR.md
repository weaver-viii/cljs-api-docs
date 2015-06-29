## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/\*print-radix\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-radix\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-radix*)
</td>
</tr>
</table>





Source docstring:

```
Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,
or 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the
radix specifier is in the form #XXr where XX is the decimal value of *print-base* 
```

Source code:

```clj
(def ^:dynamic
^{:doc "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,
or 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the
radix specifier is in the form #XXr where XX is the decimal value of *print-base* "
  :added "1.2"}
*print-radix* nil)
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:666-671](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/pprint.cljs#L666-L671)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-radix*"]))
```

```clj
{:ns "cljs.pprint",
 :name "*print-radix*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint_STARprint-radixSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,\nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the\nradix specifier is in the form #XXr where XX is the decimal value of *print-base* \"\n  :added \"1.2\"}\n*print-radix* nil)",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [666 671]},
 :full-name "cljs.pprint/*print-radix*",
 :clj-symbol "clojure.pprint/*print-radix*",
 :docstring "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,\nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the\nradix specifier is in the form #XXr where XX is the decimal value of *print-base* "}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_STARprint-radixSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_STARprint-radixSTAR.cljsdoc)
</pre>

