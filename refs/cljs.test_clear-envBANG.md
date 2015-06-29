## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/clear-env!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__clear-env!__)<br>
</samp>

---





Source code:

```clj
(defn clear-env! []
  (set! *current-env* nil))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:255-256](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/test.cljs#L255-L256)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/clear-env!"]))
```

```clj
{:ns "cljs.test",
 :name "clear-env!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn clear-env! []\n  (set! *current-env* nil))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/test.cljs",
          :lines [255 256]},
 :full-name "cljs.test/clear-env!",
 :full-name-encode "cljs.test_clear-envBANG",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_clear-envBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_clear-envBANG.cljsdoc)
</pre>

