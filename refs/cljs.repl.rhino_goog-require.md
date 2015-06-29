## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/goog-require

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__goog-require__ repl-env opts rule)<br>
</samp>

---





Source code:

```clj
(defn goog-require [repl-env opts rule]
  (let [path (string/replace (comp/munge rule) \. File/separatorChar)
        cljsc-path (str (util/output-directory opts)
                     File/separator (str path ".js"))
        cljs-path (str path ".cljs")
        js-path (str "goog/"
                  (-eval (str "goog.dependencies_.nameToPath['" rule "']")
                    repl-env "<cljs repl>" 1))]
    (let [compiled (io/file cljsc-path)]
      (if (.exists compiled)
        ;; TODO: only take this path if analysis cache is available
        ;; - David
        (do
          (with-open [reader (io/reader compiled)]
            (-eval reader repl-env cljsc-path 1)))
        (if-let [res (io/resource cljs-path)]
          (binding [ana/*cljs-ns* 'cljs.user]
            (repl/load-stream repl-env cljs-path res))
          (if-let [res (io/resource js-path)]
            (with-open [reader (io/reader res)]
              (-eval reader repl-env js-path 1))
            (throw
              (Exception.
                (str "Cannot find " cljs-path
                  " or " js-path " in classpath")))))))))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:77-101](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl/rhino.clj#L77-L101)</ins>
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
 :signature ["[repl-env opts rule]"],
 :source {:code "(defn goog-require [repl-env opts rule]\n  (let [path (string/replace (comp/munge rule) \\. File/separatorChar)\n        cljsc-path (str (util/output-directory opts)\n                     File/separator (str path \".js\"))\n        cljs-path (str path \".cljs\")\n        js-path (str \"goog/\"\n                  (-eval (str \"goog.dependencies_.nameToPath['\" rule \"']\")\n                    repl-env \"<cljs repl>\" 1))]\n    (let [compiled (io/file cljsc-path)]\n      (if (.exists compiled)\n        ;; TODO: only take this path if analysis cache is available\n        ;; - David\n        (do\n          (with-open [reader (io/reader compiled)]\n            (-eval reader repl-env cljsc-path 1)))\n        (if-let [res (io/resource cljs-path)]\n          (binding [ana/*cljs-ns* 'cljs.user]\n            (repl/load-stream repl-env cljs-path res))\n          (if-let [res (io/resource js-path)]\n            (with-open [reader (io/reader res)]\n              (-eval reader repl-env js-path 1))\n            (throw\n              (Exception.\n                (str \"Cannot find \" cljs-path\n                  \" or \" js-path \" in classpath\")))))))))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [77 101]},
 :full-name "cljs.repl.rhino/goog-require",
 :full-name-encode "cljs.repl.rhino_goog-require",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_goog-require.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_goog-require.cljsdoc)
</pre>

