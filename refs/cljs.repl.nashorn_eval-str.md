## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/eval-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__eval-str__ engine s)<br>
</samp>

---





Source code:

```clj
(defn eval-str [^ScriptEngine engine ^String s]
  (.eval engine s))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:57-58](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/repl/nashorn.clj#L57-L58)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/eval-str"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "eval-str",
 :type "function",
 :signature ["[engine s]"],
 :source {:code "(defn eval-str [^ScriptEngine engine ^String s]\n  (.eval engine s))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [57 58]},
 :full-name "cljs.repl.nashorn/eval-str",
 :full-name-encode "cljs.repl.nashorn_eval-str",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_eval-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_eval-str.cljsdoc)
</pre>

