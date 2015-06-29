## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/register-tag-parser!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__register-tag-parser!__ tag f)<br>
</samp>

---





Source code:

```clj
(defn register-tag-parser!
  [tag f]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* assoc tag f)
    old-parser))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:585-590](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/reader.cljs#L585-L590)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/register-tag-parser!"]))
```

```clj
{:ns "cljs.reader",
 :name "register-tag-parser!",
 :type "function",
 :signature ["[tag f]"],
 :source {:code "(defn register-tag-parser!\n  [tag f]\n  (let [tag (str tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* assoc tag f)\n    old-parser))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [585 590]},
 :full-name "cljs.reader/register-tag-parser!",
 :full-name-encode "cljs.reader_register-tag-parserBANG",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_register-tag-parserBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_register-tag-parserBANG.cljsdoc)
</pre>

