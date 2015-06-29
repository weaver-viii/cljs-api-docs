## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/load-javascript

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-javascript__ repl-env ns url)<br>
</samp>

---





Source code:

```clj
(defn load-javascript [repl-env ns url]
  (let [missing (remove #(contains? @loaded-libs %) ns)]
    (when (seq missing)
      (do (try 
            (-eval (io/reader url) repl-env (.toString url) 1)
            ;; TODO: don't show errors for goog/base.js line number 105
            (catch Throwable ex (println (.getMessage ex))))
          (swap! loaded-libs (partial apply conj) missing)))))
```

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:87-94](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/repl/rhino.clj#L87-L94)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/load-javascript"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "load-javascript",
 :type "function",
 :signature ["[repl-env ns url]"],
 :source {:code "(defn load-javascript [repl-env ns url]\n  (let [missing (remove #(contains? @loaded-libs %) ns)]\n    (when (seq missing)\n      (do (try \n            (-eval (io/reader url) repl-env (.toString url) 1)\n            ;; TODO: don't show errors for goog/base.js line number 105\n            (catch Throwable ex (println (.getMessage ex))))\n          (swap! loaded-libs (partial apply conj) missing)))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [87 94]},
 :full-name "cljs.repl.rhino/load-javascript",
 :full-name-encode "cljs.repl.rhino_load-javascript",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_load-javascript.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_load-javascript.cljsdoc)
</pre>

