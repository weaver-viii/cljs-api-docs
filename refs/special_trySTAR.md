## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/try\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'try*
  [op env [_ & body :as form] name]
  (let [body (vec body)
        catchenv (update-in env [:context] #(if (= :expr %) :return %))
        tail (peek body)
        fblock (when (and (seq? tail) (= 'finally (first tail)))
                  (rest tail))
        finally (when fblock
                  (analyze-block
                   (assoc env :context :statement)
                   fblock))
        body (if finally (pop body) body)
        tail (peek body)
        cblock (when (and (seq? tail)
                          (= 'catch (first tail)))
                 (rest tail))
        name (first cblock)
        locals (:locals catchenv)
        locals (if name
                 (assoc locals name {:name name})
                 locals)
        catch (when cblock
                (analyze-block (assoc catchenv :locals locals) (rest cblock)))
        body (if name (pop body) body)
        try (when body
              (analyze-block (if (or name finally) catchenv env) body))]
    (when name (assert (not (namespace name)) "Can't qualify symbol in catch"))
    {:env env :op :try* :form form
     :try try
     :finally finally
     :name name
     :catch catch
     :children (vec (mapcat block-children
                            [try catch finally]))}))
```

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:258-291](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/analyzer.clj#L258-L291)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/try*"]))
```

```clj
{:ns "special",
 :name "try*",
 :type "special form",
 :source {:code "(defmethod parse 'try*\n  [op env [_ & body :as form] name]\n  (let [body (vec body)\n        catchenv (update-in env [:context] #(if (= :expr %) :return %))\n        tail (peek body)\n        fblock (when (and (seq? tail) (= 'finally (first tail)))\n                  (rest tail))\n        finally (when fblock\n                  (analyze-block\n                   (assoc env :context :statement)\n                   fblock))\n        body (if finally (pop body) body)\n        tail (peek body)\n        cblock (when (and (seq? tail)\n                          (= 'catch (first tail)))\n                 (rest tail))\n        name (first cblock)\n        locals (:locals catchenv)\n        locals (if name\n                 (assoc locals name {:name name})\n                 locals)\n        catch (when cblock\n                (analyze-block (assoc catchenv :locals locals) (rest cblock)))\n        body (if name (pop body) body)\n        try (when body\n              (analyze-block (if (or name finally) catchenv env) body))]\n    (when name (assert (not (namespace name)) \"Can't qualify symbol in catch\"))\n    {:env env :op :try* :form form\n     :try try\n     :finally finally\n     :name name\n     :catch catch\n     :children (vec (mapcat block-children\n                            [try catch finally]))}))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [258 291]},
 :full-name "special/try*",
 :full-name-encode "special_trySTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_trySTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_trySTAR.cljsdoc)
</pre>

