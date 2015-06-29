## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/watch

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__watch__ source opts)<br>
</samp>
 <samp>
(__watch__ source opts compiler-env)<br>
</samp>
 <samp>
(__watch__ source opts compiler-env stop)<br>
</samp>

---




Source docstring:

```
Given a source which can be compiled, watch it for changes to produce.
```

Source code:

```clj
(defn watch
  ([source opts]
   (closure/watch source opts))
  ([source opts compiler-env]
   (closure/watch source opts compiler-env))
  ([source opts compiler-env stop]
   (closure/watch source opts compiler-env stop)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:179-186](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/build/api.clj#L179-L186)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/watch"]))
```

```clj
{:ns "cljs.build.api",
 :name "watch",
 :signature ["[source opts]"
             "[source opts compiler-env]"
             "[source opts compiler-env stop]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.build.api_watch",
 :source {:code "(defn watch\n  ([source opts]\n   (closure/watch source opts))\n  ([source opts compiler-env]\n   (closure/watch source opts compiler-env))\n  ([source opts compiler-env stop]\n   (closure/watch source opts compiler-env stop)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [179 186]},
 :full-name "cljs.build.api/watch",
 :docstring "Given a source which can be compiled, watch it for changes to produce."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_watch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_watch.cljsdoc)
</pre>

