## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-out-str

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1535"><img valign="middle" alt="[+] 0.0-1535" src="https://img.shields.io/badge/+-0.0--1535-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-out-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-out-str)
</td>
</tr>
</table>

 <samp>
(__with-out-str__ & body)<br>
</samp>

---




Source docstring:

```
Evaluates exprs in a context in which *print-fn* is bound to .append
on a fresh StringBuffer.  Returns the string created by any nested
printing calls.
```

Source code:

```clj
(defmacro with-out-str
  [& body]
  `(let [sb# (goog.string.StringBuffer.)]
     (binding [cljs.core/*print-fn* (fn [x#] (.append sb# x#))]
       ~@body)
     (cljs.core/str sb#)))
```

 <pre>
clojurescript @ r2307
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1626-1634](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/core.clj#L1626-L1634)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-out-str"]))
```

```clj
{:ns "cljs.core",
 :name "with-out-str",
 :signature ["[& body]"],
 :history [["+" "0.0-1535"]],
 :type "macro",
 :full-name-encode "cljs.core_with-out-str",
 :source {:code "(defmacro with-out-str\n  [& body]\n  `(let [sb# (goog.string.StringBuffer.)]\n     (binding [cljs.core/*print-fn* (fn [x#] (.append sb# x#))]\n       ~@body)\n     (cljs.core/str sb#)))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/clj/cljs/core.clj",
          :lines [1626 1634]},
 :full-name "cljs.core/with-out-str",
 :clj-symbol "clojure.core/with-out-str",
 :docstring "Evaluates exprs in a context in which *print-fn* is bound to .append\non a fresh StringBuffer.  Returns the string created by any nested\nprinting calls."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_with-out-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_with-out-str.cljsdoc)
</pre>

