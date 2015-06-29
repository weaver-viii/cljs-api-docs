## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/empty-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__empty-env__)<br>
</samp>
 <samp>
(__empty-env__ reporter)<br>
</samp>

---





Source code:

```clj
(defn empty-env
  ([] (empty-env ::default))
  ([reporter]
   {:report-counters {:test 0 :pass 0 :fail 0 :error 0}
    :testing-vars ()
    :testing-contexts ()
    :reporter reporter}))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:251-257](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/test.cljs#L251-L257)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/empty-env"]))
```

```clj
{:ns "cljs.test",
 :name "empty-env",
 :type "function",
 :signature ["[]" "[reporter]"],
 :source {:code "(defn empty-env\n  ([] (empty-env ::default))\n  ([reporter]\n   {:report-counters {:test 0 :pass 0 :fail 0 :error 0}\n    :testing-vars ()\n    :testing-contexts ()\n    :reporter reporter}))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/test.cljs",
          :lines [251 257]},
 :full-name "cljs.test/empty-env",
 :full-name-encode "cljs.test_empty-env",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_empty-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_empty-env.cljsdoc)
</pre>

