## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/in-cljs-user

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__in-cljs-user__ env & body)<br>
</samp>

---




Source docstring:

```
Binds cljs.analyzer/*cljs-ns* to 'cljs.user and uses the given compilation
environment atom and runs body.
```

Source code:

```clj
(defmacro in-cljs-user
  [env & body]
  `(binding [cljs.analyzer/*cljs-ns* 'cljs.user]
     (cljs.env/with-compiler-env ~env
       ~@body)))
```

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:66-72](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/analyzer/api.clj#L66-L72)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/in-cljs-user"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "in-cljs-user",
 :signature ["[env & body]"],
 :history [["+" "0.0-2629"]],
 :type "macro",
 :full-name-encode "cljs.analyzer.api_in-cljs-user",
 :source {:code "(defmacro in-cljs-user\n  [env & body]\n  `(binding [cljs.analyzer/*cljs-ns* 'cljs.user]\n     (cljs.env/with-compiler-env ~env\n       ~@body)))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [66 72]},
 :full-name "cljs.analyzer.api/in-cljs-user",
 :docstring "Binds cljs.analyzer/*cljs-ns* to 'cljs.user and uses the given compilation\nenvironment atom and runs body."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_in-cljs-user.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_in-cljs-user.cljsdoc)
</pre>

