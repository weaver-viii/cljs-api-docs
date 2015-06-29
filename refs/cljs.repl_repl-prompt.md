## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl-prompt

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-prompt__)<br>
</samp>

---





Source code:

```clj
(defn repl-prompt []
  (print (str "ClojureScript:" ana/*cljs-ns* "> ")))
```

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:626-627](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl.clj#L626-L627)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-prompt"]))
```

```clj
{:ns "cljs.repl",
 :name "repl-prompt",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn repl-prompt []\n  (print (str \"ClojureScript:\" ana/*cljs-ns* \"> \")))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl.clj",
          :lines [626 627]},
 :full-name "cljs.repl/repl-prompt",
 :full-name-encode "cljs.repl_repl-prompt",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl-prompt.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl-prompt.cljsdoc)
</pre>

