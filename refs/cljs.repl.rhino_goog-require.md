## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/goog-require

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__goog-require__ rule)<br>
</samp>

---





Source code:

```clj
(defn goog-require [rule]
  (when-not (contains? @loaded-libs rule)
    (let [repl-env @current-repl-env
          path (string/replace (comp/munge rule) \. java.io.File/separatorChar)
          cljs-path (str path ".cljs")
          js-path (str "goog/"
                       (-eval (str "goog.dependencies_.nameToPath['" rule "']")
                              repl-env
                              "<cljs repl>"
                              1))]
      (if-let [res (io/resource cljs-path)]
        (binding [comp/*cljs-ns* 'cljs.user]
          (repl/load-stream repl-env res))
        (if-let [res (io/resource js-path)]
          (-eval (io/reader res) repl-env js-path 1)
          (throw (Exception. (str "Cannot find " cljs-path " or " js-path " in classpath")))))
      (swap! loaded-libs conj rule))))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:68-84](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl/rhino.clj#L68-L84)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/goog-require"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "goog-require",
 :type "function",
 :signature ["[rule]"],
 :source {:code "(defn goog-require [rule]\n  (when-not (contains? @loaded-libs rule)\n    (let [repl-env @current-repl-env\n          path (string/replace (comp/munge rule) \\. java.io.File/separatorChar)\n          cljs-path (str path \".cljs\")\n          js-path (str \"goog/\"\n                       (-eval (str \"goog.dependencies_.nameToPath['\" rule \"']\")\n                              repl-env\n                              \"<cljs repl>\"\n                              1))]\n      (if-let [res (io/resource cljs-path)]\n        (binding [comp/*cljs-ns* 'cljs.user]\n          (repl/load-stream repl-env res))\n        (if-let [res (io/resource js-path)]\n          (-eval (io/reader res) repl-env js-path 1)\n          (throw (Exception. (str \"Cannot find \" cljs-path \" or \" js-path \" in classpath\")))))\n      (swap! loaded-libs conj rule))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [68 84]},
 :full-name "cljs.repl.rhino/goog-require",
 :full-name-encode "cljs.repl.rhino_goog-require",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_goog-require.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_goog-require.cljsdoc)
</pre>
