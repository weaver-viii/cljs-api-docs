## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-redefs

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1806"><img valign="middle" alt="[+] 0.0-1806" src="https://img.shields.io/badge/+-0.0--1806-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-redefs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-redefs)
</td>
</tr>
</table>

 <samp>
(__with-redefs__ bindings & body)<br>
</samp>

---




Source docstring:

```
binding => var-symbol temp-value-expr

Temporarily redefines vars while executing the body.  The
temp-value-exprs will be evaluated and each resulting value will
replace in parallel the root value of its var.  After the body is
executed, the root values of all the vars will be set back to their
old values. Useful for mocking out functions during testing.
```

Source code:

```clj
(defmacro with-redefs
  [bindings & body]
  (let [names (take-nth 2 bindings)
        vals (take-nth 2 (drop 1 bindings))
        tempnames (map (comp gensym name) names)
        binds (map core/vector names vals)
        resets (reverse (map core/vector names tempnames))
        bind-value (fn [[k v]] (core/list 'set! k v))]
    `(let [~@(interleave tempnames names)]
       (try
        ~@(map bind-value binds)
        ~@body
        (finally
         ~@(map bind-value resets))))))
```

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1103-1123](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/core.clj#L1103-L1123)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-redefs"]))
```

```clj
{:ns "cljs.core",
 :name "with-redefs",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-1806"]],
 :type "macro",
 :full-name-encode "cljs.core_with-redefs",
 :source {:code "(defmacro with-redefs\n  [bindings & body]\n  (let [names (take-nth 2 bindings)\n        vals (take-nth 2 (drop 1 bindings))\n        tempnames (map (comp gensym name) names)\n        binds (map core/vector names vals)\n        resets (reverse (map core/vector names tempnames))\n        bind-value (fn [[k v]] (core/list 'set! k v))]\n    `(let [~@(interleave tempnames names)]\n       (try\n        ~@(map bind-value binds)\n        ~@body\n        (finally\n         ~@(map bind-value resets))))))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/clj/cljs/core.clj",
          :lines [1103 1123]},
 :full-name "cljs.core/with-redefs",
 :clj-symbol "clojure.core/with-redefs",
 :docstring "binding => var-symbol temp-value-expr\n\nTemporarily redefines vars while executing the body.  The\ntemp-value-exprs will be evaluated and each resulting value will\nreplace in parallel the root value of its var.  After the body is\nexecuted, the root values of all the vars will be set back to their\nold values. Useful for mocking out functions during testing."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_with-redefs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_with-redefs.cljsdoc)
</pre>

