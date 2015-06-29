## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/deregister-default-tag-parser!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__deregister-default-tag-parser!__)<br>
</samp>

---





Source code:

```clj
(defn deregister-default-tag-parser!
  []
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] nil))
    old-parser))
```

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:595-599](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/reader.cljs#L595-L599)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/deregister-default-tag-parser!"]))
```

```clj
{:ns "cljs.reader",
 :name "deregister-default-tag-parser!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn deregister-default-tag-parser!\n  []\n  (let [old-parser @*default-data-reader-fn*]\n    (swap! *default-data-reader-fn* (fn [_] nil))\n    old-parser))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [595 599]},
 :full-name "cljs.reader/deregister-default-tag-parser!",
 :full-name-encode "cljs.reader_deregister-default-tag-parserBANG",
 :history [["+" "0.0-1576"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_deregister-default-tag-parserBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_deregister-default-tag-parserBANG.cljsdoc)
</pre>

