## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*main-cli-fn\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
When compiled for a command-line target, whatever
function *main-fn* is set to will be called with the command-line
argv as arguments
```

Source code:

```clj
(def
  ^{:doc "When compiled for a command-line target, whatever
  function *main-fn* is set to will be called with the command-line
  argv as arguments"}
  *main-cli-fn* nil)
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:127-131](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L127-L131)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*main-cli-fn*"]))
```

```clj
{:ns "cljs.core",
 :name "*main-cli-fn*",
 :docstring "When compiled for a command-line target, whatever\nfunction *main-fn* is set to will be called with the command-line\nargv as arguments",
 :type "var",
 :source {:code "(def\n  ^{:doc \"When compiled for a command-line target, whatever\n  function *main-fn* is set to will be called with the command-line\n  argv as arguments\"}\n  *main-cli-fn* nil)",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [127 131]},
 :full-name "cljs.core/*main-cli-fn*",
 :full-name-encode "cljs.core_STARmain-cli-fnSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARmain-cli-fnSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARmain-cli-fnSTAR.cljsdoc)
</pre>

