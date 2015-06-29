## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/PrettyFlush

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol PrettyFlush (ppflush [this]))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[pprint.cljs:120](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/pprint.cljs#L120)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/PrettyFlush"]))
```

```clj
{:ns "cljs.pprint",
 :name "PrettyFlush",
 :type "protocol",
 :full-name-encode "cljs.pprint_PrettyFlush",
 :source {:code "(defprotocol PrettyFlush (ppflush [this]))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/pprint.cljs",
          :lines [120]},
 :methods [{:name "ppflush", :signature ["[this]"], :docstring nil}],
 :full-name "cljs.pprint/PrettyFlush",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_PrettyFlush.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_PrettyFlush.cljsdoc)
</pre>

