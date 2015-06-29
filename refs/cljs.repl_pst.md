## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/pst

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/pst</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/pst)
</td>
</tr>
</table>

 <samp>
(__pst__ e)<br>
</samp>

---

__P__rint __s__tack __t__race for a given exception `e` or the most recent
exception, stored implicitly by `*e`.

---




Source code:

```clj
(defmacro pst
  ([] `(pst *e))
  ([e]
   (let [{:keys [repl-env] :as env} &env]
     (when (and e repl-env)
       (when-let [ret (if (satisfies? IGetError repl-env)
                   (-get-error repl-env e env *repl-opts*)
                   (edn/read-string
                     (evaluate-form repl-env env "<cljs repl>"
                       `(when ~e
                          (pr-str
                            {:value (str ~e)
                             :stacktrace (.-stack ~e)})))))]
         (display-error repl-env
           (if (satisfies? IParseError repl-env)
             (-parse-error repl-env ret *repl-opts*)
             ret)
           nil *repl-opts*))))))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1145-1162](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl.clj#L1145-L1162)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/pst"]))
```

```clj
{:description "__P__rint __s__tack __t__race for a given exception `e` or the most recent\nexception, stored implicitly by `*e`.",
 :ns "cljs.repl",
 :name "pst",
 :signature ["[e]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :full-name-encode "cljs.repl_pst",
 :source {:code "(defmacro pst\n  ([] `(pst *e))\n  ([e]\n   (let [{:keys [repl-env] :as env} &env]\n     (when (and e repl-env)\n       (when-let [ret (if (satisfies? IGetError repl-env)\n                   (-get-error repl-env e env *repl-opts*)\n                   (edn/read-string\n                     (evaluate-form repl-env env \"<cljs repl>\"\n                       `(when ~e\n                          (pr-str\n                            {:value (str ~e)\n                             :stacktrace (.-stack ~e)})))))]\n         (display-error repl-env\n           (if (satisfies? IParseError repl-env)\n             (-parse-error repl-env ret *repl-opts*)\n             ret)\n           nil *repl-opts*))))))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl.clj",
          :lines [1145 1162]},
 :full-name "cljs.repl/pst",
 :clj-symbol "clojure.repl/pst"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_pst.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_pst.cljsdoc)
</pre>

