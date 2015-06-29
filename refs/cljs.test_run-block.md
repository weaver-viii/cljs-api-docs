## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/run-block

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__run-block__ fns)<br>
</samp>

---




Source docstring:

```
Invoke all functions in fns with no arguments. A fn can optionally
return

an async test - is invoked with a continuation running left fns

a seq of fns tagged per block - are invoked immediately after fn
```

Source code:

```clj
(defn run-block
  [fns]
  (when-first [f fns]
    (let [obj (f)]
      (if (async? obj)
        (obj (let [d (delay (run-block (rest fns)))]
               (fn []
                 (if (realized? d)
                   (println "WARNING: Async test called done more than one time.")
                   @d))))
        (recur (cond->> (rest fns)
                 (::block? (meta obj)) (concat obj)))))))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:407-424](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/test.cljs#L407-L424)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-block"]))
```

```clj
{:ns "cljs.test",
 :name "run-block",
 :signature ["[fns]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test_run-block",
 :source {:code "(defn run-block\n  [fns]\n  (when-first [f fns]\n    (let [obj (f)]\n      (if (async? obj)\n        (obj (let [d (delay (run-block (rest fns)))]\n               (fn []\n                 (if (realized? d)\n                   (println \"WARNING: Async test called done more than one time.\")\n                   @d))))\n        (recur (cond->> (rest fns)\n                 (::block? (meta obj)) (concat obj)))))))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/test.cljs",
          :lines [407 424]},
 :full-name "cljs.test/run-block",
 :docstring "Invoke all functions in fns with no arguments. A fn can optionally\nreturn\n\nan async test - is invoked with a continuation running left fns\n\na seq of fns tagged per block - are invoked immediately after fn"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_run-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_run-block.cljsdoc)
</pre>

