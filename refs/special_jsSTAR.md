## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/js\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'js*
  [op env [_ jsform & args :as form] _]
  (assert (string? jsform))
  (if args
    (disallowing-recur
     (let [seg (fn seg [^String s]
                 (let [idx (.indexOf s "~{")]
                   (if (= -1 idx)
                     (list s)
                     (let [end (.indexOf s "}" idx)]
                       (cons (subs s 0 idx) (seg (subs s (inc end))))))))
           enve (assoc env :context :expr)
           argexprs (vec (map #(analyze enve %) args))]
       {:env env :op :js :segs (seg jsform) :args argexprs
        :tag (-> form meta :tag) :form form :children argexprs}))
    (let [interp (fn interp [^String s]
                   (let [idx (.indexOf s "~{")]
                     (if (= -1 idx)
                       (list s)
                       (let [end (.indexOf s "}" idx)
                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]
                         (cons (subs s 0 idx) (cons inner (interp (subs s (inc end)))))))))]
      {:env env :op :js :form form :code (apply str (interp jsform))
       :tag (-> form meta :tag)})))
```

 <pre>
clojurescript @ r1443
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:762-785](https://github.com/clojure/clojurescript/blob/r1443/src/clj/cljs/analyzer.clj#L762-L785)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/js*"]))
```

```clj
{:ns "special",
 :name "js*",
 :type "special form",
 :source {:code "(defmethod parse 'js*\n  [op env [_ jsform & args :as form] _]\n  (assert (string? jsform))\n  (if args\n    (disallowing-recur\n     (let [seg (fn seg [^String s]\n                 (let [idx (.indexOf s \"~{\")]\n                   (if (= -1 idx)\n                     (list s)\n                     (let [end (.indexOf s \"}\" idx)]\n                       (cons (subs s 0 idx) (seg (subs s (inc end))))))))\n           enve (assoc env :context :expr)\n           argexprs (vec (map #(analyze enve %) args))]\n       {:env env :op :js :segs (seg jsform) :args argexprs\n        :tag (-> form meta :tag) :form form :children argexprs}))\n    (let [interp (fn interp [^String s]\n                   (let [idx (.indexOf s \"~{\")]\n                     (if (= -1 idx)\n                       (list s)\n                       (let [end (.indexOf s \"}\" idx)\n                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]\n                         (cons (subs s 0 idx) (cons inner (interp (subs s (inc end)))))))))]\n      {:env env :op :js :form form :code (apply str (interp jsform))\n       :tag (-> form meta :tag)})))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [762 785]},
 :full-name "special/js*",
 :full-name-encode "special_jsSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_jsSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_jsSTAR.cljsdoc)
</pre>

