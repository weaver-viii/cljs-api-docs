## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/load-file\*

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-file\*__ f)<br>
</samp>

---





Source code:

```clj
(defmacro load-file* [f]
  (core/let [{:keys [target output-dir]} (:options @env/*compiler*)]
    (core/condp = target
      ;; under Node.js, always relative to JVM working directory
      :nodejs `(. js/goog (~'nodeGlobalRequire (str ~output-dir ~File/separator ~f)))
      `(. js/goog (~'importScript_ ~f)))))
```

 <pre>
clojurescript @ r2843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1694-1699](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/core.clj#L1694-L1699)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/load-file*"]))
```

```clj
{:ns "cljs.core",
 :name "load-file*",
 :type "macro",
 :signature ["[f]"],
 :source {:code "(defmacro load-file* [f]\n  (core/let [{:keys [target output-dir]} (:options @env/*compiler*)]\n    (core/condp = target\n      ;; under Node.js, always relative to JVM working directory\n      :nodejs `(. js/goog (~'nodeGlobalRequire (str ~output-dir ~File/separator ~f)))\n      `(. js/goog (~'importScript_ ~f)))))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/clj/cljs/core.clj",
          :lines [1694 1699]},
 :full-name "cljs.core/load-file*",
 :full-name-encode "cljs.core_load-fileSTAR",
 :history [["+" "0.0-2719"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_load-fileSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_load-fileSTAR.cljsdoc)
</pre>

