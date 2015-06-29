## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/build

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__build__ source opts)<br>
</samp>
 <samp>
(__build__ source opts compiler-env)<br>
</samp>

---




Source docstring:

```
Given a source which can be compiled, produce runnable JavaScript.
```

Source code:

```clj
(defn build
  ([source opts]
   (closure/build source opts))
  ([source opts compiler-env]
   (closure/build source opts compiler-env)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:116-121](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/build/api.clj#L116-L121)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/build"]))
```

```clj
{:ns "cljs.build.api",
 :name "build",
 :signature ["[source opts]" "[source opts compiler-env]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.build.api_build",
 :source {:code "(defn build\n  ([source opts]\n   (closure/build source opts))\n  ([source opts compiler-env]\n   (closure/build source opts compiler-env)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [116 121]},
 :full-name "cljs.build.api/build",
 :docstring "Given a source which can be compiled, produce runnable JavaScript."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_build.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_build.cljsdoc)
</pre>

