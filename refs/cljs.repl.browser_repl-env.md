## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---




Source docstring:

```
Create a browser-connected REPL environment.

Options:

port:           The port on which the REPL server will run. Defaults to 9000.
working-dir:    The directory where the compiled REPL client JavaScript will
                be stored. Defaults to ".repl" with a ClojureScript version
                suffix, eg. ".repl-0.0-2138".
serve-static:   Should the REPL server attempt to serve static content?
                Defaults to true.
static-dir:     List of directories to search for static content. Defaults to
                ["." "out/"].
optimizations:  The level of optimization to use when compiling the client
                end of the REPL. Defaults to :simple.
src:            The source directory containing user-defined cljs files. Used to
                support reflection. Defaults to "src/".

```

Source code:

```clj
(defn repl-env
  [& {:as opts}]
  (repl-env* opts))
```

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:537-556](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl/browser.clj#L537-L556)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_repl-env",
 :source {:code "(defn repl-env\n  [& {:as opts}]\n  (repl-env* opts))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [537 556]},
 :full-name "cljs.repl.browser/repl-env",
 :docstring "Create a browser-connected REPL environment.\n\nOptions:\n\nport:           The port on which the REPL server will run. Defaults to 9000.\nworking-dir:    The directory where the compiled REPL client JavaScript will\n                be stored. Defaults to \".repl\" with a ClojureScript version\n                suffix, eg. \".repl-0.0-2138\".\nserve-static:   Should the REPL server attempt to serve static content?\n                Defaults to true.\nstatic-dir:     List of directories to search for static content. Defaults to\n                [\".\" \"out/\"].\noptimizations:  The level of optimization to use when compiling the client\n                end of the REPL. Defaults to :simple.\nsrc:            The source directory containing user-defined cljs files. Used to\n                support reflection. Defaults to \"src/\".\n"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-env.cljsdoc)
</pre>

