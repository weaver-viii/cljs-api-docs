## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/load-javascript

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-javascript__ repl-env ns-list url)<br>
</samp>

---




Source docstring:

```
Accepts a REPL environment, a list of namespaces, and a URL for a
JavaScript file which contains the implementation for the list of
namespaces. Will load the JavaScript file into the REPL environment
if any of the namespaces have not already been loaded from the
ClojureScript REPL.
```

Source code:

```clj
(defn load-javascript
  [repl-env ns-list url]
  (let [missing (remove #(contains? @loaded-libs %) ns-list)]
    (when (seq missing)
      (browser-eval (slurp url))
      (swap! loaded-libs (partial apply conj) missing))))
```

 <pre>
clojurescript @ r2199
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:168-178](https://github.com/clojure/clojurescript/blob/r2199/src/clj/cljs/repl/browser.clj#L168-L178)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/load-javascript"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "load-javascript",
 :signature ["[repl-env ns-list url]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_load-javascript",
 :source {:code "(defn load-javascript\n  [repl-env ns-list url]\n  (let [missing (remove #(contains? @loaded-libs %) ns-list)]\n    (when (seq missing)\n      (browser-eval (slurp url))\n      (swap! loaded-libs (partial apply conj) missing))))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [168 178]},
 :full-name "cljs.repl.browser/load-javascript",
 :docstring "Accepts a REPL environment, a list of namespaces, and a URL for a\nJavaScript file which contains the implementation for the list of\nnamespaces. Will load the JavaScript file into the REPL environment\nif any of the namespaces have not already been loaded from the\nClojureScript REPL."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_load-javascript.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_load-javascript.cljsdoc)
</pre>

