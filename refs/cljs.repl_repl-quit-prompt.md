## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl-quit-prompt

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-quit-prompt__)<br>
</samp>

---





Source code:

```clj
(defn repl-quit-prompt []
  (println "To quit, type:" :cljs/quit))
```

 <pre>
clojurescript @ r3178
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:685-686](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/repl.clj#L685-L686)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-quit-prompt"]))
```

```clj
{:ns "cljs.repl",
 :name "repl-quit-prompt",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn repl-quit-prompt []\n  (println \"To quit, type:\" :cljs/quit))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/clj/cljs/repl.clj",
          :lines [685 686]},
 :full-name "cljs.repl/repl-quit-prompt",
 :full-name-encode "cljs.repl_repl-quit-prompt",
 :history [["+" "0.0-3148"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl-quit-prompt.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl-quit-prompt.cljsdoc)
</pre>

