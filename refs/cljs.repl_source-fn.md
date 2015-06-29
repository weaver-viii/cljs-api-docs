## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/source-fn

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/source-fn</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/source-fn)
</td>
</tr>
</table>

 <samp>
(__source-fn__ env x)<br>
</samp>

---




Source docstring:

```
Returns a string of the source code for the given symbol, if it can
find it.  This requires that the symbol resolve to a Var defined in
a namespace for which the .clj is in the classpath.  Returns nil if
it can't find the source.  For most REPL usage, 'source' is more
convenient.

Example: (source-fn 'filter)
```

Source code:

```clj
(defn source-fn
  [env x]
  (when-let [v (ana-api/resolve env x)]
    (when-let [filepath (:file v)]
      (let [f (io/file filepath)
            f (if (.exists f)
                f
                (io/resource filepath))]
        (when f
          (with-open [pbr (PushbackReader. (io/reader f))]
            (let [rdr (readers/source-logging-push-back-reader pbr)]
              (dotimes [_ (dec (:line v))] (readers/read-line rdr))
              (-> (reader/read rdr) meta :source))))))))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1084-1103](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L1084-L1103)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/source-fn"]))
```

```clj
{:ns "cljs.repl",
 :name "source-fn",
 :signature ["[env x]"],
 :history [["+" "0.0-2985"]],
 :type "function",
 :full-name-encode "cljs.repl_source-fn",
 :source {:code "(defn source-fn\n  [env x]\n  (when-let [v (ana-api/resolve env x)]\n    (when-let [filepath (:file v)]\n      (let [f (io/file filepath)\n            f (if (.exists f)\n                f\n                (io/resource filepath))]\n        (when f\n          (with-open [pbr (PushbackReader. (io/reader f))]\n            (let [rdr (readers/source-logging-push-back-reader pbr)]\n              (dotimes [_ (dec (:line v))] (readers/read-line rdr))\n              (-> (reader/read rdr) meta :source))))))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl.clj",
          :lines [1084 1103]},
 :full-name "cljs.repl/source-fn",
 :clj-symbol "clojure.repl/source-fn",
 :docstring "Returns a string of the source code for the given symbol, if it can\nfind it.  This requires that the symbol resolve to a Var defined in\na namespace for which the .clj is in the classpath.  Returns nil if\nit can't find the source.  For most REPL usage, 'source' is more\nconvenient.\n\nExample: (source-fn 'filter)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_source-fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_source-fn.cljsdoc)
</pre>

