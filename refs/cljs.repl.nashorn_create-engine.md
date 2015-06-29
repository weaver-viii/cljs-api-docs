## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/create-engine

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__create-engine__)<br>
</samp>
 <samp>
(__create-engine__ {:keys \[code-cache\], :or {code-cache true}})<br>
</samp>

---





Source code:

```clj
(defn create-engine
      ([] (create-engine nil))
      ([{:keys [code-cache] :or {code-cache true}}]
       (let [args (when code-cache ["-pcc"])
             factories (.getEngineFactories (ScriptEngineManager.))
             factory (get (zipmap (map #(.getEngineName %) factories) factories) "Oracle Nashorn")]
         (if-let [engine (if-not (empty? args)
                           (.getScriptEngine ^ScriptEngineFactory factory (into-array args))
                           (.getScriptEngine ^ScriptEngineFactory factory))]
           (let [context (.getContext engine)]
             (.setWriter context *out*)
             (.setErrorWriter context *err*)
             engine)
           (throw (IllegalArgumentException.
                    "Cannot find the Nashorn script engine, use a JDK version 8 or higher."))))))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[nashorn.clj:28-42](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/nashorn.clj#L28-L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/create-engine"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "create-engine",
 :type "function",
 :signature ["[]" "[{:keys [code-cache], :or {code-cache true}}]"],
 :source {:code "(defn create-engine\n      ([] (create-engine nil))\n      ([{:keys [code-cache] :or {code-cache true}}]\n       (let [args (when code-cache [\"-pcc\"])\n             factories (.getEngineFactories (ScriptEngineManager.))\n             factory (get (zipmap (map #(.getEngineName %) factories) factories) \"Oracle Nashorn\")]\n         (if-let [engine (if-not (empty? args)\n                           (.getScriptEngine ^ScriptEngineFactory factory (into-array args))\n                           (.getScriptEngine ^ScriptEngineFactory factory))]\n           (let [context (.getContext engine)]\n             (.setWriter context *out*)\n             (.setErrorWriter context *err*)\n             engine)\n           (throw (IllegalArgumentException.\n                    \"Cannot find the Nashorn script engine, use a JDK version 8 or higher.\"))))))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/repl/nashorn.clj",
          :lines [28 42]},
 :full-name "cljs.repl.nashorn/create-engine",
 :full-name-encode "cljs.repl.nashorn_create-engine",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_create-engine.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_create-engine.cljsdoc)
</pre>

