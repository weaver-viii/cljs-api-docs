## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/StringPushbackReader

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__StringPushbackReader.__ s buffer idx)<br>
</samp>

---





Source code:

```clj
(deftype StringPushbackReader [s buffer ^:mutable idx]
  PushbackReader
  (read-char [reader]
    (if (zero? (alength buffer))
      (do
        (set! idx (inc idx))
        (aget s idx))
      (.pop buffer)))
  (unread [reader ch]
    (.push buffer ch)))
```

 <pre>
clojurescript @ r2173
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:17-26](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/cljs/reader.cljs#L17-L26)</ins>
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
 :signature ["[s buffer idx]"],
 :source {:code "(deftype StringPushbackReader [s buffer ^:mutable idx]\n  PushbackReader\n  (read-char [reader]\n    (if (zero? (alength buffer))\n      (do\n        (set! idx (inc idx))\n        (aget s idx))\n      (.pop buffer)))\n  (unread [reader ch]\n    (.push buffer ch)))",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [17 26]},
 :full-name "cljs.reader/StringPushbackReader",
 :full-name-encode "cljs.reader_StringPushbackReader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_StringPushbackReader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_StringPushbackReader.cljsdoc)
</pre>

