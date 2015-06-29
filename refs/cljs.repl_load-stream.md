## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/load-stream

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-stream__ repl-env filename res)<br>
</samp>

---





Source code:

```clj
(defn load-stream [repl-env filename res]
  (let [env (ana/empty-env)]
    (with-open [rdr (io/reader res)]
      (doseq [form (ana/forms-seq* rdr filename)]
        (let [env (assoc env :ns (ana/get-namespace ana/*cljs-ns*))]
          (evaluate-form repl-env env filename form))))))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:483-488](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/repl.cljc#L483-L488)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-stream"]))
```

```clj
{:ns "cljs.repl",
 :name "load-stream",
 :type "function",
 :signature ["[repl-env filename res]"],
 :source {:code "(defn load-stream [repl-env filename res]\n  (let [env (ana/empty-env)]\n    (with-open [rdr (io/reader res)]\n      (doseq [form (ana/forms-seq* rdr filename)]\n        (let [env (assoc env :ns (ana/get-namespace ana/*cljs-ns*))]\n          (evaluate-form repl-env env filename form))))))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [483 488]},
 :full-name "cljs.repl/load-stream",
 :full-name-encode "cljs.repl_load-stream",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-stream.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-stream.cljsdoc)
</pre>

