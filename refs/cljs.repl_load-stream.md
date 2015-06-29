## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/load-stream

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-stream__ repl-env filename stream)<br>
</samp>

---





Source code:

```clj
(defn load-stream [repl-env filename stream]
  (with-open [r (io/reader stream)]
    (let [env (ana/empty-env)
          pbr (clojure.lang.LineNumberingPushbackReader. r)
          eof (Object.)]
      (loop [r (read pbr false eof false)]
        (let [env (assoc env :ns (ana/get-namespace ana/*cljs-ns*))]
          (when-not (identical? eof r)
            (evaluate-form repl-env env filename r)
            (recur (read pbr false eof false))))))))
```

 <pre>
clojurescript @ r1847
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:96-105](https://github.com/clojure/clojurescript/blob/r1847/src/clj/cljs/repl.clj#L96-L105)</ins>
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
 :signature ["[repl-env filename stream]"],
 :source {:code "(defn load-stream [repl-env filename stream]\n  (with-open [r (io/reader stream)]\n    (let [env (ana/empty-env)\n          pbr (clojure.lang.LineNumberingPushbackReader. r)\n          eof (Object.)]\n      (loop [r (read pbr false eof false)]\n        (let [env (assoc env :ns (ana/get-namespace ana/*cljs-ns*))]\n          (when-not (identical? eof r)\n            (evaluate-form repl-env env filename r)\n            (recur (read pbr false eof false))))))))",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/clj/cljs/repl.clj",
          :lines [96 105]},
 :full-name "cljs.repl/load-stream",
 :full-name-encode "cljs.repl_load-stream",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-stream.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-stream.cljsdoc)
</pre>

