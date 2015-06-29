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
  (cond
    (:forms m) (doseq [f (:forms m)]
                 (print "  ")
                 (prn f))
    (:arglists m) (prn (:arglists m)))
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
      (println " " (:doc m)))))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[repl.cljs:11-31](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/repl.cljs#L11-L31)</ins>
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
 :source {:code "(defn print-doc [m]\n  (println \"-------------------------\")\n  (println (str (when-let [ns (:ns m)] (str ns \"/\")) (:name m)))\n  (cond\n    (:forms m) (doseq [f (:forms m)]\n                 (print \"  \")\n                 (prn f))\n    (:arglists m) (prn (:arglists m)))\n  (if (:special-form m)\n    (do\n      (println \"Special Form\")\n      (println \" \" (:doc m)) \n      (if (contains? m :url)\n        (when (:url m)\n          (println (str \"\\n  Please see http://clojure.org/\" (:url m))))\n        (println (str \"\\n  Please see http://clojure.org/special_forms#\"\n                   (:name m)))))\n    (do\n      (when (:macro m)\n        (println \"Macro\")) \n      (println \" \" (:doc m)))))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/repl.cljs",
          :lines [11 31]},
 :full-name "cljs.repl/print-doc",
 :full-name-encode "cljs.repl_print-doc",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_print-doc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_print-doc.cljsdoc)
</pre>

