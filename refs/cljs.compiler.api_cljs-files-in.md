## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.compiler.api/cljs-files-in

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__cljs-files-in__ dir)<br>
</samp>

---




Source docstring:

```
Return a sequence of all .cljs and .cljc files in the given directory.
```

Source code:

```clj
(defn cljs-files-in
  [dir]
  (comp/cljs-files-in dir))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:62-65](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/compiler/api.clj#L62-L65)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/cljs-files-in"]))
```

```clj
{:ns "cljs.compiler.api",
 :name "cljs-files-in",
 :signature ["[dir]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api_cljs-files-in",
 :source {:code "(defn cljs-files-in\n  [dir]\n  (comp/cljs-files-in dir))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [62 65]},
 :full-name "cljs.compiler.api/cljs-files-in",
 :docstring "Return a sequence of all .cljs and .cljc files in the given directory."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.compiler.api_cljs-files-in.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api_cljs-files-in.cljsdoc)
</pre>

