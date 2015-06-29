## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-sequential-writer

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-sequential-writer__ writer print-one begin sep end opts coll)<br>
</samp>

---





Source code:

```clj
(defn pr-sequential-writer [writer print-one begin sep end opts coll]
  (binding [*print-level* (when-not (nil? *print-level*) (dec *print-level*))]
    (if (and (not (nil? *print-level*)) (neg? *print-level*))
      (-write writer "#")
      (do
        (-write writer begin)
        (when (seq coll)
          (print-one (first coll) writer opts))
        (loop [coll (next coll) n (dec (:print-length opts))]
          (if (and coll (or (nil? n) (not (zero? n))))
            (do
              (-write writer sep)
              (print-one (first coll) writer opts)
              (recur (next coll) (dec n)))
            (when (and (seq coll) (zero? n))
              (-write writer sep)
              (-write writer "..."))))
        (-write writer end)))))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7985-8002](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L7985-L8002)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-sequential-writer"]))
```

```clj
{:ns "cljs.core",
 :name "pr-sequential-writer",
 :type "function",
 :signature ["[writer print-one begin sep end opts coll]"],
 :source {:code "(defn pr-sequential-writer [writer print-one begin sep end opts coll]\n  (binding [*print-level* (when-not (nil? *print-level*) (dec *print-level*))]\n    (if (and (not (nil? *print-level*)) (neg? *print-level*))\n      (-write writer \"#\")\n      (do\n        (-write writer begin)\n        (when (seq coll)\n          (print-one (first coll) writer opts))\n        (loop [coll (next coll) n (dec (:print-length opts))]\n          (if (and coll (or (nil? n) (not (zero? n))))\n            (do\n              (-write writer sep)\n              (print-one (first coll) writer opts)\n              (recur (next coll) (dec n)))\n            (when (and (seq coll) (zero? n))\n              (-write writer sep)\n              (-write writer \"...\"))))\n        (-write writer end)))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7985 8002]},
 :full-name "cljs.core/pr-sequential-writer",
 :full-name-encode "cljs.core_pr-sequential-writer",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-sequential-writer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-sequential-writer.cljsdoc)
</pre>

