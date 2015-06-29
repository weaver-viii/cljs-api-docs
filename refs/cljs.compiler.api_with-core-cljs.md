## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.compiler.api/with-core-cljs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__with-core-cljs__)<br>
</samp>
 <samp>
(__with-core-cljs__ opts)<br>
</samp>
 <samp>
(__with-core-cljs__ opts body)<br>
</samp>

---




Source docstring:

```
Ensure that core.cljs has been loaded.
```

Source code:

```clj
(defn with-core-cljs
  ([] (comp/with-core-cljs nil))
  ([opts] (comp/with-core-cljs opts (fn [])))
  ([opts body] (comp/with-core-cljs opts body)))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:29-33](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/compiler/api.clj#L29-L33)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/with-core-cljs"]))
```

```clj
{:ns "cljs.compiler.api",
 :name "with-core-cljs",
 :signature ["[]" "[opts]" "[opts body]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api_with-core-cljs",
 :source {:code "(defn with-core-cljs\n  ([] (comp/with-core-cljs nil))\n  ([opts] (comp/with-core-cljs opts (fn [])))\n  ([opts body] (comp/with-core-cljs opts body)))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [29 33]},
 :full-name "cljs.compiler.api/with-core-cljs",
 :docstring "Ensure that core.cljs has been loaded."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.compiler.api_with-core-cljs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api_with-core-cljs.cljsdoc)
</pre>

