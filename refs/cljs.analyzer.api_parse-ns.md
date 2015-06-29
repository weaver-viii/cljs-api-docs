## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/parse-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-ns__ src)<br>
</samp>
 <samp>
(__parse-ns__ src opts)<br>
</samp>
 <samp>
(__parse-ns__ src dest opts)<br>
</samp>

---




Source docstring:

```
Helper for parsing only the essential namespace information from a
ClojureScript source file and returning a cljs.closure/IJavaScript compatible
map _not_ a namespace AST node.

By default does not load macros or perform any analysis of dependencies. If
opts parameter provided :analyze-deps and :load-macros keys their values will
be used for *analyze-deps* and *load-macros* bindings respectively. This
function does _not_ side-effect the ambient compilation environment unless
requested via opts where :restore is false.
```

Source code:

```clj
(defn parse-ns
  ([src] (ana/parse-ns src nil nil))
  ([src opts] (ana/parse-ns src nil opts))
  ([src dest opts] (ana/parse-ns src dest opts)))
```

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:40-52](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/analyzer/api.clj#L40-L52)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/parse-ns"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "parse-ns",
 :signature ["[src]" "[src opts]" "[src dest opts]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_parse-ns",
 :source {:code "(defn parse-ns\n  ([src] (ana/parse-ns src nil nil))\n  ([src opts] (ana/parse-ns src nil opts))\n  ([src dest opts] (ana/parse-ns src dest opts)))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [40 52]},
 :full-name "cljs.analyzer.api/parse-ns",
 :docstring "Helper for parsing only the essential namespace information from a\nClojureScript source file and returning a cljs.closure/IJavaScript compatible\nmap _not_ a namespace AST node.\n\nBy default does not load macros or perform any analysis of dependencies. If\nopts parameter provided :analyze-deps and :load-macros keys their values will\nbe used for *analyze-deps* and *load-macros* bindings respectively. This\nfunction does _not_ side-effect the ambient compilation environment unless\nrequested via opts where :restore is false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_parse-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_parse-ns.cljsdoc)
</pre>

