## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/output-unoptimized

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__output-unoptimized__ opts & sources)<br>
</samp>

---




Source docstring:

```
Ensure that all JavaScript source files are on disk (not in jars),
write the goog deps file including only the libraries that are being
used and write the deps file for the current project.

The deps file for the current project will include third-party
libraries.
```

Source code:

```clj
(defn output-unoptimized
  [opts & sources]
  (apply closure/output-unoptimized opts sources))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:162-170](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L162-L170)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/output-unoptimized"]))
```

```clj
{:ns "cljs.build.api",
 :name "output-unoptimized",
 :signature ["[opts & sources]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_output-unoptimized",
 :source {:code "(defn output-unoptimized\n  [opts & sources]\n  (apply closure/output-unoptimized opts sources))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [162 170]},
 :full-name "cljs.build.api/output-unoptimized",
 :docstring "Ensure that all JavaScript source files are on disk (not in jars),\nwrite the goog deps file including only the libraries that are being\nused and write the deps file for the current project.\n\nThe deps file for the current project will include third-party\nlibraries."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_output-unoptimized.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_output-unoptimized.cljsdoc)
</pre>

