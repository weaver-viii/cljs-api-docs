## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/get-and-clear-env!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-and-clear-env!__)<br>
</samp>

---





Source code:

```clj
(defn get-and-clear-env! []
  "Like get-current-env, but cleans env before returning."
  (let [env (cljs.test/get-current-env)]
    (clear-env!)
    env))
```

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:273-277](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/test.cljs#L273-L277)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/get-and-clear-env!"]))
```

```clj
{:ns "cljs.test",
 :name "get-and-clear-env!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn get-and-clear-env! []\n  \"Like get-current-env, but cleans env before returning.\"\n  (let [env (cljs.test/get-current-env)]\n    (clear-env!)\n    env))",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/test.cljs",
          :lines [273 277]},
 :full-name "cljs.test/get-and-clear-env!",
 :full-name-encode "cljs.test_get-and-clear-envBANG",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_get-and-clear-envBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_get-and-clear-envBANG.cljsdoc)
</pre>

