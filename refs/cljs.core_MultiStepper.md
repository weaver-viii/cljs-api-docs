## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/MultiStepper

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__MultiStepper.__ xform iters nexts)<br>
</samp>

---





Source code:

```clj
(deftype MultiStepper [xform iters nexts]
  Object
  (hasNext [_]
    (loop [iters (seq iters)]
      (if-not (nil? iters)
        (let [iter (first iters)]
          (if-not (.hasNext iter)
            false
            (recur (next iters))))
        true)))
  (next [_]
    (dotimes [i (alength iters)]
      (aset next i (.next (aget iters i))))
    (prim-seq nexts 0))
  (step [_ lt]
    (loop []
      (if (and (not (nil? (.-stepper lt)))
               (.hasNext iter))
        (when-not (reduced? (xform lt (.next iter)))
          (recur))))
    (when-not (nil? (.-stepper lt))
      (xform lt))))
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2958-2979](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2958-L2979)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/MultiStepper"]))
```

```clj
{:ns "cljs.core",
 :name "MultiStepper",
 :type "type",
 :signature ["[xform iters nexts]"],
 :source {:code "(deftype MultiStepper [xform iters nexts]\n  Object\n  (hasNext [_]\n    (loop [iters (seq iters)]\n      (if-not (nil? iters)\n        (let [iter (first iters)]\n          (if-not (.hasNext iter)\n            false\n            (recur (next iters))))\n        true)))\n  (next [_]\n    (dotimes [i (alength iters)]\n      (aset next i (.next (aget iters i))))\n    (prim-seq nexts 0))\n  (step [_ lt]\n    (loop []\n      (if (and (not (nil? (.-stepper lt)))\n               (.hasNext iter))\n        (when-not (reduced? (xform lt (.next iter)))\n          (recur))))\n    (when-not (nil? (.-stepper lt))\n      (xform lt))))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2958 2979]},
 :full-name "cljs.core/MultiStepper",
 :full-name-encode "cljs.core_MultiStepper",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_MultiStepper.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_MultiStepper.cljsdoc)
</pre>

