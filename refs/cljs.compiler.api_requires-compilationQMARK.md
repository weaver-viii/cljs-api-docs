## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.compiler.api/requires-compilation?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__requires-compilation?__ src dest)<br>
</samp>
 <samp>
(__requires-compilation?__ src dest opts)<br>
</samp>

---




Source docstring:

```
Return true if the src file requires compilation.
```

Source code:

```clj
(defn requires-compilation?
  ([src dest]
   (comp/requires-compilation? src dest nil))
  ([src dest opts]
   (comp/requires-compilation? src dest opts)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:35-40](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/compiler/api.clj#L35-L40)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/requires-compilation?"]))
```

```clj
{:ns "cljs.compiler.api",
 :name "requires-compilation?",
 :signature ["[src dest]" "[src dest opts]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api_requires-compilationQMARK",
 :source {:code "(defn requires-compilation?\n  ([src dest]\n   (comp/requires-compilation? src dest nil))\n  ([src dest opts]\n   (comp/requires-compilation? src dest opts)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [35 40]},
 :full-name "cljs.compiler.api/requires-compilation?",
 :docstring "Return true if the src file requires compilation."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.compiler.api_requires-compilationQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api_requires-compilationQMARK.cljsdoc)
</pre>

