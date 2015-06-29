## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---




Source docstring:

```
Create a browser-connected REPL environment.

Options:

port:           The port on which the REPL server will run. Defaults to 9000.
working-dir:    The directory where the compiled REPL client JavaScript will
                be stored. Defaults to ".repl".
serve-static:   Should the REPL server attempt to serve static content?
                Defaults to true.
static-dir:     List of directories to search for static content. Defaults to
                ["." "out/"].
preloaded-libs: List of namespaces that should not be sent from the REPL server
                to the browser. This may be required if the browser is already
                loading code and reloading it would cause a problem.
optimizations:  The level of optimization to use when compiling the client
                end of the REPL. Defaults to :simple.
src:            The source directory containing user-defined cljs files. Used to
                support reflection. Defaults to "src/".

```

Source code:

```clj
(defn repl-env
  [& {:as opts}]
  (let [opts (merge (BrowserEnv.)
                    {:port          9000
                     :optimizations :simple
                     :working-dir   ".repl"
                     :serve-static  true
                     :static-dir    ["." "out/"]
                     :preloaded-libs   []
                     :src           "src/"}
                    opts)]
    (do (reset! preloaded-libs (set (concat (always-preload) (map str (:preloaded-libs opts)))))
        (reset! loaded-libs @preloaded-libs)
        (swap! browser-state
               (fn [old] (assoc old :client-js
                               (future (create-client-js-file
                                        opts
                                        (io/file (:working-dir opts) "client.js"))))))
        opts)))
```

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:208-245](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/repl/browser.clj#L208-L245)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_repl-env",
 :source {:code "(defn repl-env\n  [& {:as opts}]\n  (let [opts (merge (BrowserEnv.)\n                    {:port          9000\n                     :optimizations :simple\n                     :working-dir   \".repl\"\n                     :serve-static  true\n                     :static-dir    [\".\" \"out/\"]\n                     :preloaded-libs   []\n                     :src           \"src/\"}\n                    opts)]\n    (do (reset! preloaded-libs (set (concat (always-preload) (map str (:preloaded-libs opts)))))\n        (reset! loaded-libs @preloaded-libs)\n        (swap! browser-state\n               (fn [old] (assoc old :client-js\n                               (future (create-client-js-file\n                                        opts\n                                        (io/file (:working-dir opts) \"client.js\"))))))\n        opts)))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [208 245]},
 :full-name "cljs.repl.browser/repl-env",
 :docstring "Create a browser-connected REPL environment.\n\nOptions:\n\nport:           The port on which the REPL server will run. Defaults to 9000.\nworking-dir:    The directory where the compiled REPL client JavaScript will\n                be stored. Defaults to \".repl\".\nserve-static:   Should the REPL server attempt to serve static content?\n                Defaults to true.\nstatic-dir:     List of directories to search for static content. Defaults to\n                [\".\" \"out/\"].\npreloaded-libs: List of namespaces that should not be sent from the REPL server\n                to the browser. This may be required if the browser is already\n                loading code and reloading it would cause a problem.\noptimizations:  The level of optimization to use when compiling the client\n                end of the REPL. Defaults to :simple.\nsrc:            The source directory containing user-defined cljs files. Used to\n                support reflection. Defaults to \"src/\".\n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-env.cljsdoc)
</pre>

