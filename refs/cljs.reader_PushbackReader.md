## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/PushbackReader

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol PushbackReader
  (read-char [reader] "Returns the next char from the Reader,
nil if the end of stream has been reached")
  (unread [reader ch] "Push back a single character on to the stream"))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:12-15](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/cljs/reader.cljs#L12-L15)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/PushbackReader"]))
```

```clj
{:ns "cljs.reader",
 :name "PushbackReader",
 :type "protocol",
 :full-name-encode "cljs.reader_PushbackReader",
 :source {:code "(defprotocol PushbackReader\n  (read-char [reader] \"Returns the next char from the Reader,\nnil if the end of stream has been reached\")\n  (unread [reader ch] \"Push back a single character on to the stream\"))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [12 15]},
 :methods [{:name "read-char",
            :signature ["[reader]"],
            :docstring "Returns the next char from the Reader,\nnil if the end of stream has been reached"}
           {:name "unread",
            :signature ["[reader ch]"],
            :docstring "Push back a single character on to the stream"}],
 :full-name "cljs.reader/PushbackReader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_PushbackReader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_PushbackReader.cljsdoc)
</pre>

