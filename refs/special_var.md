## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/var

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var)
</td>
</tr>
</table>

 <samp>
(__var__ symbol)<br>
</samp>

---




Source docstring:

```
The symbol must resolve to a var, and the Var object
itself (not its value) is returned. The reader macro #'x expands to (var x).
```

Source code:

```clj
(defmethod parse 'var
  [op env [_ sym :as form] _ _]
  (let [var (resolve-var env sym (confirm-var-exists-throw))
        expr-env (assoc env :context :expr)]
    {:env env :op :var-special :form form
     :var (analyze expr-env sym)
     :sym (analyze expr-env `(quote ~(symbol (name (:ns var)) (name (:name var)))))
     :meta (let [ks [:ns :doc :file :line :column]
                 m (merge
                     (let [user-meta (:meta var)
                           uks (keys user-meta)]
                       (zipmap uks
                         (map #(list 'quote (get user-meta %)) uks)))
                     (assoc (zipmap ks (map #(list 'quote (get var %)) ks))
                       :name `(quote ~(symbol (name (:name var))))
                       :test `(when ~sym (.-cljs$lang$test ~sym))
                       :arglists (let [arglists (:arglists var)
                                       arglists' (if (= 'quote (first arglists))
                                                   (second arglists)
                                                   arglists)]
                                   (list 'quote
                                     (doall (map with-meta arglists'
                                              (:arglists-meta var)))))))]
             (analyze expr-env m))}))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:690-713](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer.cljc#L690-L713)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/var"]))
```

```clj
{:ns "special",
 :name "var",
 :signature ["[symbol]"],
 :history [["+" "0.0-2496"]],
 :type "special form",
 :full-name-encode "special_var",
 :source {:code "(defmethod parse 'var\n  [op env [_ sym :as form] _ _]\n  (let [var (resolve-var env sym (confirm-var-exists-throw))\n        expr-env (assoc env :context :expr)]\n    {:env env :op :var-special :form form\n     :var (analyze expr-env sym)\n     :sym (analyze expr-env `(quote ~(symbol (name (:ns var)) (name (:name var)))))\n     :meta (let [ks [:ns :doc :file :line :column]\n                 m (merge\n                     (let [user-meta (:meta var)\n                           uks (keys user-meta)]\n                       (zipmap uks\n                         (map #(list 'quote (get user-meta %)) uks)))\n                     (assoc (zipmap ks (map #(list 'quote (get var %)) ks))\n                       :name `(quote ~(symbol (name (:name var))))\n                       :test `(when ~sym (.-cljs$lang$test ~sym))\n                       :arglists (let [arglists (:arglists var)\n                                       arglists' (if (= 'quote (first arglists))\n                                                   (second arglists)\n                                                   arglists)]\n                                   (list 'quote\n                                     (doall (map with-meta arglists'\n                                              (:arglists-meta var)))))))]\n             (analyze expr-env m))}))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [690 713]},
 :full-name "special/var",
 :clj-symbol "clojure.core/var",
 :docstring "The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x expands to (var x)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_var.cljsdoc)
</pre>

