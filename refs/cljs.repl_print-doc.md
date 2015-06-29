## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/print-doc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__print-doc__ m)<br>
</samp>

---





Source code:

```clj
(defn print-doc [m]
  (println "-------------------------")
  (println (str (when-let [ns (:ns m)] (str ns "/")) (:name m)))
  (when (:protocol m)
    (println "Protocol"))
  (cond
    (:forms m) (doseq [f (:forms m)]
                 (println "  " f))
    (:arglists m) (if (or (:macro m)
                          (:repl-special-function m))
                    (prn (:arglists m))
                    (prn (second (:arglists m)))))
  (if (:special-form m)
    (do
      (println "Special Form")
      (println " " (:doc m)) 
      (if (contains? m :url)
        (when (:url m)
          (println (str "\n  Please see http://clojure.org/" (:url m))))
        (println (str "\n  Please see http://clojure.org/special_forms#"
                   (:name m)))))
    (do
      (when (:macro m)
        (println "Macro"))
      (when (:repl-special-function m)
        (println "REPL Special Function"))
      (println " " (:doc m))
      (when (:protocol m)
        (doseq [[name {:keys [doc arglists]}] (:methods m)]
          (println)
          (println " " name)
          (println " " arglists)
          (when doc
            (println " " doc)))))))
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[repl.cljs:12-45](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/repl.cljs#L12-L45)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/print-doc"]))
```

```clj
{:ns "cljs.repl",
 :name "print-doc",
 :type "function",
 :signature ["[m]"],
 :source {:code "(defn print-doc [m]\n  (println \"-------------------------\")\n  (println (str (when-let [ns (:ns m)] (str ns \"/\")) (:name m)))\n  (when (:protocol m)\n    (println \"Protocol\"))\n  (cond\n    (:forms m) (doseq [f (:forms m)]\n                 (println \"  \" f))\n    (:arglists m) (if (or (:macro m)\n                          (:repl-special-function m))\n                    (prn (:arglists m))\n                    (prn (second (:arglists m)))))\n  (if (:special-form m)\n    (do\n      (println \"Special Form\")\n      (println \" \" (:doc m)) \n      (if (contains? m :url)\n        (when (:url m)\n          (println (str \"\\n  Please see http://clojure.org/\" (:url m))))\n        (println (str \"\\n  Please see http://clojure.org/special_forms#\"\n                   (:name m)))))\n    (do\n      (when (:macro m)\n        (println \"Macro\"))\n      (when (:repl-special-function m)\n        (println \"REPL Special Function\"))\n      (println \" \" (:doc m))\n      (when (:protocol m)\n        (doseq [[name {:keys [doc arglists]}] (:methods m)]\n          (println)\n          (println \" \" name)\n          (println \" \" arglists)\n          (when doc\n            (println \" \" doc)))))))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/repl.cljs",
          :lines [12 45]},
 :full-name "cljs.repl/print-doc",
 :full-name-encode "cljs.repl_print-doc",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_print-doc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_print-doc.cljsdoc)
</pre>

