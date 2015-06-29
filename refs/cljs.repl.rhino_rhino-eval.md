## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/rhino-eval

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__rhino-eval__ {:keys \[scope\], :as repl-env} filename line js)<br>
</samp>

---





Source code:

```clj
(defn rhino-eval
  [{:keys [scope] :as repl-env} filename line js]
  (try
    (let [linenum (or line Integer/MIN_VALUE)]
      {:status :success
       :value (eval-result (-eval js repl-env filename linenum))})
    (catch Throwable ex
      ;; manually set *e
      (let [top-level (-> scope
                        (ScriptableObject/getProperty "cljs")
                        (ScriptableObject/getProperty "core"))]
        (ScriptableObject/putProperty top-level "_STAR_e"
          (Context/javaToJS ex scope))
        {:status :exception
         :value (.toString ex)
         :stacktrace (stacktrace ex)}))))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[rhino.clj:71-86](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/repl/rhino.clj#L71-L86)</ins>
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
 :signature ["[{:keys [scope], :as repl-env} filename line js]"],
 :source {:code "(defn rhino-eval\n  [{:keys [scope] :as repl-env} filename line js]\n  (try\n    (let [linenum (or line Integer/MIN_VALUE)]\n      {:status :success\n       :value (eval-result (-eval js repl-env filename linenum))})\n    (catch Throwable ex\n      ;; manually set *e\n      (let [top-level (-> scope\n                        (ScriptableObject/getProperty \"cljs\")\n                        (ScriptableObject/getProperty \"core\"))]\n        (ScriptableObject/putProperty top-level \"_STAR_e\"\n          (Context/javaToJS ex scope))\n        {:status :exception\n         :value (.toString ex)\n         :stacktrace (stacktrace ex)}))))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [71 86]},
 :full-name "cljs.repl.rhino/rhino-eval",
 :full-name-encode "cljs.repl.rhino_rhino-eval",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_rhino-eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_rhino-eval.cljsdoc)
</pre>

