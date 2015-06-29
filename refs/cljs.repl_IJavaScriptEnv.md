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
  (-setup [this] "initialize the environment")
  (-evaluate [this filename line js] "evaluate a javascript string")
  (-load [this ns url] "load code at url into the environment")
  (-tear-down [this] "dispose of the environment"))
```

 <pre>
clojurescript @ r1889
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:21-25](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/repl.clj#L21-L25)</ins>
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
 :source {:code "(defprotocol IJavaScriptEnv\n  (-setup [this] \"initialize the environment\")\n  (-evaluate [this filename line js] \"evaluate a javascript string\")\n  (-load [this ns url] \"load code at url into the environment\")\n  (-tear-down [this] \"dispose of the environment\"))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/clj/cljs/repl.clj",
          :lines [21 25]},
 :methods [{:name "-setup",
            :signature ["[this]"],
            :docstring "initialize the environment"}
           {:name "-evaluate",
            :signature ["[this filename line js]"],
            :docstring "evaluate a javascript string"}
           {:name "-load",
            :signature ["[this ns url]"],
            :docstring "load code at url into the environment"}
           {:name "-tear-down",
            :signature ["[this]"],
            :docstring "dispose of the environment"}],
 :full-name "cljs.repl/IJavaScriptEnv",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IJavaScriptEnv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IJavaScriptEnv.cljsdoc)
</pre>

