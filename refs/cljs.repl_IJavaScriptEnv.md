## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IJavaScriptEnv

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IJavaScriptEnv
  (-setup [repl-env opts] "initialize the environment")
  (-evaluate [repl-env filename line js] "evaluate a javascript string")
  (-load [repl-env provides url] "load code at url into the environment")
  (-tear-down [repl-env] "dispose of the environment"))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:106-110](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl.clj#L106-L110)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IJavaScriptEnv"]))
```

```clj
{:ns "cljs.repl",
 :name "IJavaScriptEnv",
 :type "protocol",
 :full-name-encode "cljs.repl_IJavaScriptEnv",
 :source {:code "(defprotocol IJavaScriptEnv\n  (-setup [repl-env opts] \"initialize the environment\")\n  (-evaluate [repl-env filename line js] \"evaluate a javascript string\")\n  (-load [repl-env provides url] \"load code at url into the environment\")\n  (-tear-down [repl-env] \"dispose of the environment\"))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl.clj",
          :lines [106 110]},
 :methods [{:name "-setup",
            :signature ["[repl-env opts]"],
            :docstring "initialize the environment"}
           {:name "-evaluate",
            :signature ["[repl-env filename line js]"],
            :docstring "evaluate a javascript string"}
           {:name "-load",
            :signature ["[repl-env provides url]"],
            :docstring "load code at url into the environment"}
           {:name "-tear-down",
            :signature ["[repl-env]"],
            :docstring "dispose of the environment"}],
 :full-name "cljs.repl/IJavaScriptEnv",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IJavaScriptEnv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IJavaScriptEnv.cljsdoc)
</pre>

