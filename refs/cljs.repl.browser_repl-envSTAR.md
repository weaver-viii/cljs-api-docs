## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-env\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env\*__ opts)<br>
</samp>

---





Source code:

```clj
(defn repl-env* [opts]
  (let [ups-deps (cljsc/get-upstream-deps)
        opts (assoc opts
               :ups-libs (:libs ups-deps)
               :ups-foreign-libs (:foreign-libs ups-deps))
        compiler-env (cljs.env/default-compiler-env opts)
        opts (merge (BrowserEnv.)
               {:port           9000
                :optimizations  :simple
                :working-dir    (or (:output-dir opts)
                                  (->> [".repl" (util/clojurescript-version)]
                                    (remove empty?) (string/join "-")))
                :serve-static   true
                :static-dir     (cond-> ["." "out/"]
                                  (:output-dir opts) (conj (:output-dir opts)))
                :preloaded-libs []
                :src            "src/"
                ::env/compiler  compiler-env
                :source-map     false}
               opts)]
    (cljs.env/with-compiler-env compiler-env
      (reset! preloaded-libs
        (set (concat
               (always-preload opts)
               (map str (:preloaded-libs opts)))))
      (reset! loaded-libs @preloaded-libs)
      (println "Compiling client js ...")
      (swap! browser-state
        (fn [old]
          (assoc old :client-js
                     (create-client-js-file
                       opts
                       (io/file (:working-dir opts) "client.js")))))
      (println "Waiting for browser to connect ...")
      opts)))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:547-581](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/browser.clj#L547-L581)</ins>
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
 :signature ["[opts]"],
 :source {:code "(defn repl-env* [opts]\n  (let [ups-deps (cljsc/get-upstream-deps)\n        opts (assoc opts\n               :ups-libs (:libs ups-deps)\n               :ups-foreign-libs (:foreign-libs ups-deps))\n        compiler-env (cljs.env/default-compiler-env opts)\n        opts (merge (BrowserEnv.)\n               {:port           9000\n                :optimizations  :simple\n                :working-dir    (or (:output-dir opts)\n                                  (->> [\".repl\" (util/clojurescript-version)]\n                                    (remove empty?) (string/join \"-\")))\n                :serve-static   true\n                :static-dir     (cond-> [\".\" \"out/\"]\n                                  (:output-dir opts) (conj (:output-dir opts)))\n                :preloaded-libs []\n                :src            \"src/\"\n                ::env/compiler  compiler-env\n                :source-map     false}\n               opts)]\n    (cljs.env/with-compiler-env compiler-env\n      (reset! preloaded-libs\n        (set (concat\n               (always-preload opts)\n               (map str (:preloaded-libs opts)))))\n      (reset! loaded-libs @preloaded-libs)\n      (println \"Compiling client js ...\")\n      (swap! browser-state\n        (fn [old]\n          (assoc old :client-js\n                     (create-client-js-file\n                       opts\n                       (io/file (:working-dir opts) \"client.js\")))))\n      (println \"Waiting for browser to connect ...\")\n      opts)))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [547 581]},
 :full-name "cljs.repl.browser/repl-env*",
 :full-name-encode "cljs.repl.browser_repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-envSTAR.cljsdoc)
</pre>

