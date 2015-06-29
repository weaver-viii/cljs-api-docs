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
    (let [env {:ns (@comp/namespaces comp/*cljs-ns*) :context :statement :locals {}}
          pbr (clojure.lang.LineNumberingPushbackReader. r)
          eof (Object.)]
      (loop [r (read pbr false eof false)]
        (let [env (assoc env :ns (@comp/namespaces comp/*cljs-ns*))]
          (when-not (identical? eof r)
            (evaluate-form repl-env env filename r)
            (recur (read pbr false eof false))))))))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:91-100](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl.clj#L91-L100)</ins>
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
 :source {:code "(defn load-stream [repl-env filename stream]\n  (with-open [r (io/reader stream)]\n    (let [env {:ns (@comp/namespaces comp/*cljs-ns*) :context :statement :locals {}}\n          pbr (clojure.lang.LineNumberingPushbackReader. r)\n          eof (Object.)]\n      (loop [r (read pbr false eof false)]\n        (let [env (assoc env :ns (@comp/namespaces comp/*cljs-ns*))]\n          (when-not (identical? eof r)\n            (evaluate-form repl-env env filename r)\n            (recur (read pbr false eof false))))))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl.clj",
          :lines [91 100]},
 :full-name "cljs.repl/load-stream",
 :full-name-encode "cljs.repl_load-stream",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-stream.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-stream.cljsdoc)
</pre>
