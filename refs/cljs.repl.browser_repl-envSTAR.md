## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-env\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env\*__ {:keys \[output-dir\], :as opts})<br>
</samp>

---





Source code:

```clj
(defn repl-env*
  [{:keys [output-dir] :as opts}]
  (merge (BrowserEnv.)
    {:port 9000
     :working-dir (->> [".repl" (util/clojurescript-version)]
                       (remove empty?) (string/join "-"))
     :serve-static true
     :static-dir (cond-> ["." "out/"] output-dir (conj output-dir))
     :preloaded-libs []
     :optimizations :simple
     :src "src/"
     :browser-state (atom {:return-value-fn nil
                          :client-js nil})
     :ordering (agent {:expecting nil :fns {}})
     :es (Executors/newFixedThreadPool 16)
     :server-state
     (atom
       {:socket nil
        :connection nil
        :promised-conn nil})}
    opts))
```

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:534-554](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl/browser.clj#L534-L554)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env*"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "repl-env*",
 :type "function",
 :signature ["[{:keys [output-dir], :as opts}]"],
 :source {:code "(defn repl-env*\n  [{:keys [output-dir] :as opts}]\n  (merge (BrowserEnv.)\n    {:port 9000\n     :working-dir (->> [\".repl\" (util/clojurescript-version)]\n                       (remove empty?) (string/join \"-\"))\n     :serve-static true\n     :static-dir (cond-> [\".\" \"out/\"] output-dir (conj output-dir))\n     :preloaded-libs []\n     :optimizations :simple\n     :src \"src/\"\n     :browser-state (atom {:return-value-fn nil\n                          :client-js nil})\n     :ordering (agent {:expecting nil :fns {}})\n     :es (Executors/newFixedThreadPool 16)\n     :server-state\n     (atom\n       {:socket nil\n        :connection nil\n        :promised-conn nil})}\n    opts))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [534 554]},
 :full-name "cljs.repl.browser/repl-env*",
 :full-name-encode "cljs.repl.browser_repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-envSTAR.cljsdoc)
</pre>

