## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/rhino-eval

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__rhino-eval__ repl-env filename line js)<br>
</samp>

---





Source code:

```clj
(defn rhino-eval
  [repl-env filename line js]
  (try
    (let [linenum (or line Integer/MIN_VALUE)]
      {:status :success
       :value (eval-result (-eval js repl-env filename linenum))})
    (catch Throwable ex
      {:status :exception
       :value (.toString ex)
       :stacktrace (stacktrace ex)})))
```

 <pre>
clojurescript @ r2280
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:56-65](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/repl/rhino.clj#L56-L65)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/rhino-eval"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "rhino-eval",
 :type "function",
 :signature ["[repl-env filename line js]"],
 :source {:code "(defn rhino-eval\n  [repl-env filename line js]\n  (try\n    (let [linenum (or line Integer/MIN_VALUE)]\n      {:status :success\n       :value (eval-result (-eval js repl-env filename linenum))})\n    (catch Throwable ex\n      {:status :exception\n       :value (.toString ex)\n       :stacktrace (stacktrace ex)})))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [56 65]},
 :full-name "cljs.repl.rhino/rhino-eval",
 :full-name-encode "cljs.repl.rhino_rhino-eval",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_rhino-eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_rhino-eval.cljsdoc)
</pre>

