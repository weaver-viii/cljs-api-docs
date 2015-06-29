## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/repl-env\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env\*__ {:keys \[debug\], :as opts})<br>
</samp>

---





Source code:

```clj
(defn repl-env* [{:keys [debug] :as opts}]
  (let [engine (create-engine opts)]
    (merge
      (NashornEnv. engine debug)
      opts)))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:219-223](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl/nashorn.clj#L219-L223)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-env*"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-env*",
 :type "function",
 :signature ["[{:keys [debug], :as opts}]"],
 :source {:code "(defn repl-env* [{:keys [debug] :as opts}]\n  (let [engine (create-engine opts)]\n    (merge\n      (NashornEnv. engine debug)\n      opts)))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [219 223]},
 :full-name "cljs.repl.nashorn/repl-env*",
 :full-name-encode "cljs.repl.nashorn_repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_repl-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_repl-envSTAR.cljsdoc)
</pre>

