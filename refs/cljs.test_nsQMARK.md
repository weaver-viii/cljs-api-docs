## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/ns?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ns?__ x)<br>
</samp>

---





Source code:

```clj
(defn ns? [x]
  (and (seq? x) (= (first x) 'quote)))
```

 <pre>
clojurescript @ r2723
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:225-226](https://github.com/clojure/clojurescript/blob/r2723/src/clj/cljs/test.clj#L225-L226)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/ns?"]))
```

```clj
{:ns "cljs.test",
 :name "ns?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn ns? [x]\n  (and (seq? x) (= (first x) 'quote)))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/clj/cljs/test.clj",
          :lines [225 226]},
 :full-name "cljs.test/ns?",
 :full-name-encode "cljs.test_nsQMARK",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_nsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_nsQMARK.cljsdoc)
</pre>

