## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/create-client-js-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__create-client-js-file__ opts file-path)<br>
</samp>

---





Source code:

```clj
(defn create-client-js-file [opts file-path]
  (let [file (io/file file-path)]
    (when (not (.exists file))
      (spit file (compile-client-js opts)))
    file))
```

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:205-209](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/repl/browser.clj#L205-L209)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/create-client-js-file"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "create-client-js-file",
 :type "function",
 :signature ["[opts file-path]"],
 :source {:code "(defn create-client-js-file [opts file-path]\n  (let [file (io/file file-path)]\n    (when (not (.exists file))\n      (spit file (compile-client-js opts)))\n    file))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [205 209]},
 :full-name "cljs.repl.browser/create-client-js-file",
 :full-name-encode "cljs.repl.browser_create-client-js-file",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_create-client-js-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_create-client-js-file.cljsdoc)
</pre>

