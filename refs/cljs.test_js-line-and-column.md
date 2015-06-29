## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/js-line-and-column

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-line-and-column__ stack-element)<br>
</samp>

---





Source code:

```clj
(defn js-line-and-column [stack-element]
  (let [parts (.split stack-element ":")
        cnt   (count parts)]
    [(js/parseInt (nth parts (- cnt 2)))
     (js/parseInt (nth parts (dec cnt)))]))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:347-351](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/test.cljs#L347-L351)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/js-line-and-column"]))
```

```clj
{:ns "cljs.test",
 :name "js-line-and-column",
 :type "function",
 :signature ["[stack-element]"],
 :source {:code "(defn js-line-and-column [stack-element]\n  (let [parts (.split stack-element \":\")\n        cnt   (count parts)]\n    [(js/parseInt (nth parts (- cnt 2)))\n     (js/parseInt (nth parts (dec cnt)))]))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/test.cljs",
          :lines [347 351]},
 :full-name "cljs.test/js-line-and-column",
 :full-name-encode "cljs.test_js-line-and-column",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_js-line-and-column.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_js-line-and-column.cljsdoc)
</pre>

