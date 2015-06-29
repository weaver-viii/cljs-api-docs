## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/load-js-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-js-file__ engine file)<br>
</samp>

---





Source code:

```clj
(defn load-js-file [engine file]
      (eval-str engine (format "nashorn_load(\"%s\");" file)))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[nashorn.clj:74-75](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/nashorn.clj#L74-L75)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/load-js-file"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "load-js-file",
 :type "function",
 :signature ["[engine file]"],
 :source {:code "(defn load-js-file [engine file]\n      (eval-str engine (format \"nashorn_load(\\\"%s\\\");\" file)))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/repl/nashorn.clj",
          :lines [74 75]},
 :full-name "cljs.repl.nashorn/load-js-file",
 :full-name-encode "cljs.repl.nashorn_load-js-file",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_load-js-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_load-js-file.cljsdoc)
</pre>

