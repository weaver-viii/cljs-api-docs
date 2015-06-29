## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/dispatch-macros

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-macros__ s)<br>
</samp>

---





Source code:

```clj
(defn dispatch-macros [s]
  (cond
   (identical? s "{") read-set
   (identical? s "<") (throwing-reader "Unreadable form")
   (identical? s "\"") read-regex
   (identical? s"!") read-comment
   (identical? s "_") read-discard
   :else nil))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:415-422](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/reader.cljs#L415-L422)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/dispatch-macros"]))
```

```clj
{:ns "cljs.reader",
 :name "dispatch-macros",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn dispatch-macros [s]\n  (cond\n   (identical? s \"{\") read-set\n   (identical? s \"<\") (throwing-reader \"Unreadable form\")\n   (identical? s \"\\\"\") read-regex\n   (identical? s\"!\") read-comment\n   (identical? s \"_\") read-discard\n   :else nil))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [415 422]},
 :full-name "cljs.reader/dispatch-macros",
 :full-name-encode "cljs.reader_dispatch-macros",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_dispatch-macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_dispatch-macros.cljsdoc)
</pre>

