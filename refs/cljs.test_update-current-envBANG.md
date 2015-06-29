## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/update-current-env!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__update-current-env!__ ks f & args)<br>
</samp>

---





Source code:

```clj
(defn update-current-env! [ks f & args]
  (set! *current-env* (apply update-in (get-current-env) ks f args)))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:264-265](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L264-L265)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/update-current-env!"]))
```

```clj
{:ns "cljs.test",
 :name "update-current-env!",
 :type "function",
 :signature ["[ks f & args]"],
 :source {:code "(defn update-current-env! [ks f & args]\n  (set! *current-env* (apply update-in (get-current-env) ks f args)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/test.cljs",
          :lines [264 265]},
 :full-name "cljs.test/update-current-env!",
 :full-name-encode "cljs.test_update-current-envBANG",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_update-current-envBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_update-current-envBANG.cljsdoc)
</pre>

