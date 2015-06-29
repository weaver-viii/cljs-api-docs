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
        mname (when name (munge name))
        locals (if name
                 (assoc locals name {:name mname})
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
     :name mname
     :catch catch
     :children [try {:name mname} catch finally]}))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:655-688](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L655-L688)</ins>
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
 :source {:code "(defmethod parse 'try*\n  [op env [_ & body :as form] name]\n  (let [body (vec body)\n        catchenv (update-in env [:context] #(if (= :expr %) :return %))\n        tail (peek body)\n        fblock (when (and (seq? tail) (= 'finally (first tail)))\n                  (rest tail))\n        finally (when fblock\n                  (analyze-block\n                   (assoc env :context :statement)\n                   fblock))\n        body (if finally (pop body) body)\n        tail (peek body)\n        cblock (when (and (seq? tail)\n                          (= 'catch (first tail)))\n                 (rest tail))\n        name (first cblock)\n        locals (:locals catchenv)\n        mname (when name (munge name))\n        locals (if name\n                 (assoc locals name {:name mname})\n                 locals)\n        catch (when cblock\n                (analyze-block (assoc catchenv :locals locals) (rest cblock)))\n        body (if name (pop body) body)\n        try (when body\n              (analyze-block (if (or name finally) catchenv env) body))]\n    (when name (assert (not (namespace name)) \"Can't qualify symbol in catch\"))\n    {:env env :op :try* :form form\n     :try try\n     :finally finally\n     :name mname\n     :catch catch\n     :children [try {:name mname} catch finally]}))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/compiler.clj",
          :lines [655 688]},
 :full-name "special/try*",
 :full-name-encode "special_trySTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_trySTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_trySTAR.cljsdoc)
</pre>

