## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/load-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-file__ repl-env opts src)<br>
</samp>

---




Source docstring:

```
Load a JavaScript. This is needed to load JavaScript files before the Rhino
environment is bootstrapped. After bootstrapping load-javascript will be
used.
```

Source code:

```clj
(defn load-file
  [repl-env opts src]
  (let [goog-path (io/file (util/output-directory opts) "goog" src)]
    (rhino-eval repl-env (.getPath goog-path) 1 (io/reader goog-path))))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:88-94](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/repl/rhino.clj#L88-L94)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/load-file"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "load-file",
 :signature ["[repl-env opts src]"],
 :history [["+" "0.0-2985"]],
 :type "function",
 :full-name-encode "cljs.repl.rhino_load-file",
 :source {:code "(defn load-file\n  [repl-env opts src]\n  (let [goog-path (io/file (util/output-directory opts) \"goog\" src)]\n    (rhino-eval repl-env (.getPath goog-path) 1 (io/reader goog-path))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [88 94]},
 :full-name "cljs.repl.rhino/load-file",
 :docstring "Load a JavaScript. This is needed to load JavaScript files before the Rhino\nenvironment is bootstrapped. After bootstrapping load-javascript will be\nused."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_load-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_load-file.cljsdoc)
</pre>

