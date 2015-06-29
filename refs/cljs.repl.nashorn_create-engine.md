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

---





Source code:

```clj
(defn create-engine []
  (if-let [engine (.getEngineByName (ScriptEngineManager.) "nashorn")]
    (let [context (.getContext engine)]
      (.setWriter context *out*)
      (.setErrorWriter context *err*)
      engine)
    (throw (IllegalArgumentException.
            "Cannot find the Nashorn script engine, use a JDK version 8 or higher."))))
```

 <pre>
clojurescript @ r2816
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:64-71](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/nashorn.clj#L64-L71)</ins>
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
 :signature ["[]"],
 :source {:code "(defn create-engine []\n  (if-let [engine (.getEngineByName (ScriptEngineManager.) \"nashorn\")]\n    (let [context (.getContext engine)]\n      (.setWriter context *out*)\n      (.setErrorWriter context *err*)\n      engine)\n    (throw (IllegalArgumentException.\n            \"Cannot find the Nashorn script engine, use a JDK version 8 or higher.\"))))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [64 71]},
 :full-name "cljs.repl.nashorn/create-engine",
 :full-name-encode "cljs.repl.nashorn_create-engine",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_create-engine.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_create-engine.cljsdoc)
</pre>

