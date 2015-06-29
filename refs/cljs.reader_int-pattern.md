## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/int-pattern

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def int-pattern (re-pattern "([-+]?)(?:(0)|([1-9][0-9]*)|0[xX]([0-9A-Fa-f]+)|0([0-7]+)|([1-9][0-9]?)[rR]([0-9A-Za-z]+)|0[0-9]+)(N)?"))
```

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:99](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/reader.cljs#L99)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/int-pattern"]))
```

```clj
{:ns "cljs.reader",
 :name "int-pattern",
 :type "var",
 :source {:code "(def int-pattern (re-pattern \"([-+]?)(?:(0)|([1-9][0-9]*)|0[xX]([0-9A-Fa-f]+)|0([0-7]+)|([1-9][0-9]?)[rR]([0-9A-Za-z]+)|0[0-9]+)(N)?\"))",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [99]},
 :full-name "cljs.reader/int-pattern",
 :full-name-encode "cljs.reader_int-pattern",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_int-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_int-pattern.cljsdoc)
</pre>

