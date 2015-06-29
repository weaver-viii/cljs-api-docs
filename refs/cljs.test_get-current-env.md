## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/get-current-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-current-env__)<br>
</samp>

---





Source code:

```clj
(defn get-current-env []
  (or *current-env* (empty-env)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:261-262](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.cljs#L261-L262)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/get-current-env"]))
```

```clj
{:ns "cljs.test",
 :name "get-current-env",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn get-current-env []\n  (or *current-env* (empty-env)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [261 262]},
 :full-name "cljs.test/get-current-env",
 :full-name-encode "cljs.test_get-current-env",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_get-current-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_get-current-env.cljsdoc)
</pre>

