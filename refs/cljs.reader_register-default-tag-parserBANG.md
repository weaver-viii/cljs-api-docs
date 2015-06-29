## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/register-default-tag-parser!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__register-default-tag-parser!__ f)<br>
</samp>

---





Source code:

```clj
(defn register-default-tag-parser!
  [f]
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] f))
    old-parser))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:581-585](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/reader.cljs#L581-L585)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/register-default-tag-parser!"]))
```

```clj
{:ns "cljs.reader",
 :name "register-default-tag-parser!",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn register-default-tag-parser!\n  [f]\n  (let [old-parser @*default-data-reader-fn*]\n    (swap! *default-data-reader-fn* (fn [_] f))\n    old-parser))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [581 585]},
 :full-name "cljs.reader/register-default-tag-parser!",
 :full-name-encode "cljs.reader_register-default-tag-parserBANG",
 :history [["+" "0.0-1576"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_register-default-tag-parserBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_register-default-tag-parserBANG.cljsdoc)
</pre>

