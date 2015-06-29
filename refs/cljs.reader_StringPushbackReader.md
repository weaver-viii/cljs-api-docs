## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/StringPushbackReader

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__StringPushbackReader.__ s index-atom buffer-atom)<br>
</samp>

---





Source code:

```clj
(deftype StringPushbackReader [s index-atom buffer-atom]
  PushbackReader
  (read-char [reader]
             (if (empty? @buffer-atom)
               (let [idx @index-atom]
                 (swap! index-atom inc)
                 (aget s idx))
               (let [buf @buffer-atom]
                 (swap! buffer-atom rest)
                 (first buf))))
  (unread [reader ch] (swap! buffer-atom #(cons ch %))))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:18-28](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L18-L28)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/StringPushbackReader"]))
```

```clj
{:ns "cljs.reader",
 :name "StringPushbackReader",
 :type "type",
 :signature ["[s index-atom buffer-atom]"],
 :source {:code "(deftype StringPushbackReader [s index-atom buffer-atom]\n  PushbackReader\n  (read-char [reader]\n             (if (empty? @buffer-atom)\n               (let [idx @index-atom]\n                 (swap! index-atom inc)\n                 (aget s idx))\n               (let [buf @buffer-atom]\n                 (swap! buffer-atom rest)\n                 (first buf))))\n  (unread [reader ch] (swap! buffer-atom #(cons ch %))))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [18 28]},
 :full-name "cljs.reader/StringPushbackReader",
 :full-name-encode "cljs.reader_StringPushbackReader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_StringPushbackReader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_StringPushbackReader.cljsdoc)
</pre>

