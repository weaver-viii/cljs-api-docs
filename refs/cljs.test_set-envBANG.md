## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/set-env!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-env!__ new-env)<br>
</samp>

---





Source code:

```clj
(defn set-env! [new-env]
  (set! *current-env* new-env))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:267-268](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/test.cljs#L267-L268)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/set-env!"]))
```

```clj
{:ns "cljs.test",
 :name "set-env!",
 :type "function",
 :signature ["[new-env]"],
 :source {:code "(defn set-env! [new-env]\n  (set! *current-env* new-env))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [267 268]},
 :full-name "cljs.test/set-env!",
 :full-name-encode "cljs.test_set-envBANG",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_set-envBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_set-envBANG.cljsdoc)
</pre>

