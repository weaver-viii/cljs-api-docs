## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/not-implemented

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__not-implemented__ rdr ch)<br>
</samp>

---





Source code:

```clj
(defn not-implemented
  [rdr ch]
  (reader-error rdr "Reader for " ch " not implemented yet"))
```

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:250-252](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/reader.cljs#L250-L252)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/not-implemented"]))
```

```clj
{:ns "cljs.reader",
 :name "not-implemented",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn not-implemented\n  [rdr ch]\n  (reader-error rdr \"Reader for \" ch \" not implemented yet\"))",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [250 252]},
 :full-name "cljs.reader/not-implemented",
 :full-name-encode "cljs.reader_not-implemented",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_not-implemented.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_not-implemented.cljsdoc)
</pre>

