## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-ns-block

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__test-ns-block__ env \[quote ns :as form\])<br>
</samp>

---




Source docstring:

```
Like test-ns, but returns a block for further composition and
later execution.  Does not clear the current env.
```

Source code:

```clj
(defmacro test-ns-block
  ([env [quote ns :as form]]
   (assert (and (= quote 'quote) (symbol? ns)) "Argument to test-ns must be a quoted symbol")
   (assert (ana-api/find-ns ns) (str "Namespace " ns " does not exist"))
   `[(fn []
       (cljs.test/set-env! ~env)
       (cljs.test/do-report {:type :begin-test-ns, :ns ~form})
       ;; If the namespace has a test-ns-hook function, call that:
       ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]
          `(~(symbol (name ns) "test-ns-hook"))
          ;; Otherwise, just test every var in the namespace.
          `(cljs.test/block (cljs.test/test-all-vars-block ~form))))
     (fn []
       (cljs.test/do-report {:type :end-test-ns, :ns ~form}))]))
```

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:335-350](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/test.clj#L335-L350)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-ns-block"]))
```

```clj
{:ns "cljs.test",
 :name "test-ns-block",
 :signature ["[env [quote ns :as form]]"],
 :history [["+" "0.0-2814"]],
 :type "macro",
 :full-name-encode "cljs.test_test-ns-block",
 :source {:code "(defmacro test-ns-block\n  ([env [quote ns :as form]]\n   (assert (and (= quote 'quote) (symbol? ns)) \"Argument to test-ns must be a quoted symbol\")\n   (assert (ana-api/find-ns ns) (str \"Namespace \" ns \" does not exist\"))\n   `[(fn []\n       (cljs.test/set-env! ~env)\n       (cljs.test/do-report {:type :begin-test-ns, :ns ~form})\n       ;; If the namespace has a test-ns-hook function, call that:\n       ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]\n          `(~(symbol (name ns) \"test-ns-hook\"))\n          ;; Otherwise, just test every var in the namespace.\n          `(cljs.test/block (cljs.test/test-all-vars-block ~form))))\n     (fn []\n       (cljs.test/do-report {:type :end-test-ns, :ns ~form}))]))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/test.clj",
          :lines [335 350]},
 :full-name "cljs.test/test-ns-block",
 :docstring "Like test-ns, but returns a block for further composition and\nlater execution.  Does not clear the current env."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-ns-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-ns-block.cljsdoc)
</pre>

