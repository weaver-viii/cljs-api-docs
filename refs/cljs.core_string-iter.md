## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string-iter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__string-iter__ x)<br>
</samp>

---





Source code:

```clj
(defn string-iter [x]
  (StringIter. x 0))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3376-3377](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L3376-L3377)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string-iter"]))
```

```clj
{:ns "cljs.core",
 :name "string-iter",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string-iter [x]\n  (StringIter. x 0))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3376 3377]},
 :full-name "cljs.core/string-iter",
 :full-name-encode "cljs.core_string-iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_string-iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_string-iter.cljsdoc)
</pre>

