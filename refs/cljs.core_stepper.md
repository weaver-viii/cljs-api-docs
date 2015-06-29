## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/stepper

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__stepper__ xform iter)<br>
</samp>

---





Source code:

```clj
(defn stepper [xform iter]
  (letfn [(stepfn
            ([result]
               (let [lt (if (reduced? result)
                          @result
                          result)]
                 (set! (.-stepper lt) nil)
                 result))
            ([result input]
               (let [lt result]
                 (set! (.-first lt) input)
                 (set! (.-rest lt) (lazy-transformer (.-stepper lt)))
                 (set! (.-stepper lt) nil)
                 (.-rest lt))))]
   (Stepper. (xform stepfn) iter)))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3428-3442](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L3428-L3442)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/stepper"]))
```

```clj
{:ns "cljs.core",
 :name "stepper",
 :type "function",
 :signature ["[xform iter]"],
 :source {:code "(defn stepper [xform iter]\n  (letfn [(stepfn\n            ([result]\n               (let [lt (if (reduced? result)\n                          @result\n                          result)]\n                 (set! (.-stepper lt) nil)\n                 result))\n            ([result input]\n               (let [lt result]\n                 (set! (.-first lt) input)\n                 (set! (.-rest lt) (lazy-transformer (.-stepper lt)))\n                 (set! (.-stepper lt) nil)\n                 (.-rest lt))))]\n   (Stepper. (xform stepfn) iter)))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3428 3442]},
 :full-name "cljs.core/stepper",
 :full-name-encode "cljs.core_stepper",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_stepper.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_stepper.cljsdoc)
</pre>

