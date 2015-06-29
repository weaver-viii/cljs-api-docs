## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/wrap-fn

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__wrap-fn__ form)<br>
</samp>

---





Source code:

```clj
(defn wrap-fn [form]
  (cond
    (and (seq? form) (= 'ns (first form))) identity
    ('#{*1 *2 *3 *e} form) (fn [x] `(cljs.core.pr-str ~x))
    :else
    (fn [x]
      `(cljs.core.pr-str
         (let [ret# ~x]
           (set! *3 *2)
           (set! *2 *1)
           (set! *1 ret#)
           ret#)))))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:156-167](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/rhino.clj#L156-L167)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/wrap-fn"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "wrap-fn",
 :type "function",
 :signature ["[form]"],
 :source {:code "(defn wrap-fn [form]\n  (cond\n    (and (seq? form) (= 'ns (first form))) identity\n    ('#{*1 *2 *3 *e} form) (fn [x] `(cljs.core.pr-str ~x))\n    :else\n    (fn [x]\n      `(cljs.core.pr-str\n         (let [ret# ~x]\n           (set! *3 *2)\n           (set! *2 *1)\n           (set! *1 ret#)\n           ret#)))))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [156 167]},
 :full-name "cljs.repl.rhino/wrap-fn",
 :full-name-encode "cljs.repl.rhino_wrap-fn",
 :history [["+" "0.0-2985"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_wrap-fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_wrap-fn.cljsdoc)
</pre>

