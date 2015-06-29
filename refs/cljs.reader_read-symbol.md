## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-symbol

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-symbol__ reader initch)<br>
</samp>

---





Source code:

```clj
(defn read-symbol
  [reader initch]
  (let [token (read-token reader initch)]
    (if (gstring/contains token "/")
      (symbol (subs token 0 (.indexOf token "/"))
              (subs token (inc (.indexOf token "/")) (.-length token)))
      (special-symbols token (symbol token)))))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:319-325](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L319-L325)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-symbol"]))
```

```clj
{:ns "cljs.reader",
 :name "read-symbol",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-symbol\n  [reader initch]\n  (let [token (read-token reader initch)]\n    (if (gstring/contains token \"/\")\n      (symbol (subs token 0 (.indexOf token \"/\"))\n              (subs token (inc (.indexOf token \"/\")) (.-length token)))\n      (special-symbols token (symbol token)))))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [319 325]},
 :full-name "cljs.reader/read-symbol",
 :full-name-encode "cljs.reader_read-symbol",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-symbol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-symbol.cljsdoc)
</pre>

