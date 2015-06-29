## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/compile

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__compile__ opts compilable)<br>
</samp>

---




Source docstring:

```
Given a Compilable, compile it and return an IJavaScript.
```

Source code:

```clj
(defn compile
  [opts compilable]
  (closure/compile compilable opts))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:157-160](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/build/api.clj#L157-L160)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/compile"]))
```

```clj
{:ns "cljs.build.api",
 :name "compile",
 :signature ["[opts compilable]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_compile",
 :source {:code "(defn compile\n  [opts compilable]\n  (closure/compile compilable opts))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [157 160]},
 :full-name "cljs.build.api/compile",
 :docstring "Given a Compilable, compile it and return an IJavaScript."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_compile.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_compile.cljsdoc)
</pre>

