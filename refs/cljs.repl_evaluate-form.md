## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/evaluate-form

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__evaluate-form__ repl-env env filename form)<br>
</samp>
 <samp>
(__evaluate-form__ repl-env env filename form wrap)<br>
</samp>
 <samp>
(__evaluate-form__ repl-env env filename form wrap opts)<br>
</samp>

---




Source docstring:

```
Evaluate a ClojureScript form in the JavaScript environment. Returns a
string which is the ClojureScript return value. This string may or may
not be readable by the Clojure reader.
```

Source code:

```clj
(defn evaluate-form
  ([repl-env env filename form]
    (evaluate-form repl-env env filename form identity))
  ([repl-env env filename form wrap]
    (evaluate-form repl-env env filename form wrap *repl-opts*))
  ([repl-env env filename form wrap opts]
   (binding [ana/*cljs-file* filename]
     (let [ast (ana/analyze env form opts)
           js (comp/emit-str ast)
           wrap-js
           ;; TODO: check opts as well - David
           (if (:source-map repl-env)
             (binding [comp/*source-map-data*
                       (atom {:source-map (sorted-map)
                              :gen-col 0
                              :gen-line 0})]
               (let [js (comp/emit-str
                          (ana/no-warn
                            (ana/analyze (assoc env :repl-env repl-env)
                              (wrap form) opts)))
                     t (System/currentTimeMillis)]
                 (str js
                   "\n//# sourceURL=repl-" t ".js"
                   "\n//# sourceMappingURL=data:application/json;base64,"
                   (DatatypeConverter/printBase64Binary
                     (.getBytes
                       (sm/encode
                         {(str "repl-" t ".cljs")
                          (:source-map @comp/*source-map-data*)}
                         {:lines (+ (:gen-line @comp/*source-map-data*) 3)
                          :file (str "repl-" t ".js")
                          :sources-content
                          [(or (:source (meta form))
                             ;; handle strings / primitives without metadata
                             (with-out-str (pr form)))]})
                       "UTF-8")))))
             (comp/emit-str
               (ana/no-warn
                 (ana/analyze (assoc env :repl-env repl-env)
                   (wrap form) opts))))]
       (when (= (:op ast) :ns)
         (load-dependencies repl-env
           (into (vals (:requires ast))
             (distinct (vals (:uses ast))))
           opts))
       (when *cljs-verbose*
         ((:print opts) js))
       (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]
         (case (:status ret)
           :error (throw
                    (ex-info (:value ret)
                      {:type :js-eval-error
                       :error ret
                       :repl-env repl-env
                       :form form}))
           :exception (throw
                        (ex-info (:value ret)
                          {:type :js-eval-exception
                           :error ret
                           :repl-env repl-env
                           :form form
                           :js js}))
           :success (:value ret)))))))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:379-444](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L379-L444)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/evaluate-form"]))
```

```clj
{:ns "cljs.repl",
 :name "evaluate-form",
 :signature ["[repl-env env filename form]"
             "[repl-env env filename form wrap]"
             "[repl-env env filename form wrap opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl_evaluate-form",
 :source {:code "(defn evaluate-form\n  ([repl-env env filename form]\n    (evaluate-form repl-env env filename form identity))\n  ([repl-env env filename form wrap]\n    (evaluate-form repl-env env filename form wrap *repl-opts*))\n  ([repl-env env filename form wrap opts]\n   (binding [ana/*cljs-file* filename]\n     (let [ast (ana/analyze env form opts)\n           js (comp/emit-str ast)\n           wrap-js\n           ;; TODO: check opts as well - David\n           (if (:source-map repl-env)\n             (binding [comp/*source-map-data*\n                       (atom {:source-map (sorted-map)\n                              :gen-col 0\n                              :gen-line 0})]\n               (let [js (comp/emit-str\n                          (ana/no-warn\n                            (ana/analyze (assoc env :repl-env repl-env)\n                              (wrap form) opts)))\n                     t (System/currentTimeMillis)]\n                 (str js\n                   \"\\n//# sourceURL=repl-\" t \".js\"\n                   \"\\n//# sourceMappingURL=data:application/json;base64,\"\n                   (DatatypeConverter/printBase64Binary\n                     (.getBytes\n                       (sm/encode\n                         {(str \"repl-\" t \".cljs\")\n                          (:source-map @comp/*source-map-data*)}\n                         {:lines (+ (:gen-line @comp/*source-map-data*) 3)\n                          :file (str \"repl-\" t \".js\")\n                          :sources-content\n                          [(or (:source (meta form))\n                             ;; handle strings / primitives without metadata\n                             (with-out-str (pr form)))]})\n                       \"UTF-8\")))))\n             (comp/emit-str\n               (ana/no-warn\n                 (ana/analyze (assoc env :repl-env repl-env)\n                   (wrap form) opts))))]\n       (when (= (:op ast) :ns)\n         (load-dependencies repl-env\n           (into (vals (:requires ast))\n             (distinct (vals (:uses ast))))\n           opts))\n       (when *cljs-verbose*\n         ((:print opts) js))\n       (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]\n         (case (:status ret)\n           :error (throw\n                    (ex-info (:value ret)\n                      {:type :js-eval-error\n                       :error ret\n                       :repl-env repl-env\n                       :form form}))\n           :exception (throw\n                        (ex-info (:value ret)\n                          {:type :js-eval-exception\n                           :error ret\n                           :repl-env repl-env\n                           :form form\n                           :js js}))\n           :success (:value ret)))))))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl.clj",
          :lines [379 444]},
 :full-name "cljs.repl/evaluate-form",
 :docstring "Evaluate a ClojureScript form in the JavaScript environment. Returns a\nstring which is the ClojureScript return value. This string may or may\nnot be readable by the Clojure reader."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_evaluate-form.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_evaluate-form.cljsdoc)
</pre>

