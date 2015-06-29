## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/parse-js-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-js-ns__ f)<br>
</samp>

---




Source docstring:

```
Given a Google Closure style JavaScript file or resource return the namespace
information for the given file. Only returns the value extracted from the
first provide statement.
```

Source code:

```clj
(defn parse-js-ns
  [f]
  (closure/parse-js-ns f))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:76-81](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/build/api.clj#L76-L81)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/parse-js-ns"]))
```

```clj
{:ns "cljs.build.api",
 :name "parse-js-ns",
 :signature ["[f]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api_parse-js-ns",
 :source {:code "(defn parse-js-ns\n  [f]\n  (closure/parse-js-ns f))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [76 81]},
 :full-name "cljs.build.api/parse-js-ns",
 :docstring "Given a Google Closure style JavaScript file or resource return the namespace\ninformation for the given file. Only returns the value extracted from the\nfirst provide statement."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_parse-js-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_parse-js-ns.cljsdoc)
</pre>

