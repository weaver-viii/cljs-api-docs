## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-keyword

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-keyword__ reader initch)<br>
</samp>

---





Source code:

```clj
(defn read-keyword
  [reader initch]
  (let [token (read-token reader (read-char reader))
        a (re-matches* symbol-pattern token)
        token (aget a 0)
        ns (aget a 1)
        name (aget a 2)]
    (if (or (and (coercive-not (undefined? ns))
                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) ":/"))
            (identical? (aget name (dec (.-length name))) ":")
            (coercive-not (== (.indexOf token "::" 1) -1)))
      (reader-error reader "Invalid token: " token)
      (if ns
        (keyword (.substring ns 0 (.indexOf ns "/")) name)
        (keyword token)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:286-300](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L286-L300)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-keyword"]))
```

```clj
{:ns "cljs.reader",
 :name "read-keyword",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-keyword\n  [reader initch]\n  (let [token (read-token reader (read-char reader))\n        a (re-matches* symbol-pattern token)\n        token (aget a 0)\n        ns (aget a 1)\n        name (aget a 2)]\n    (if (or (and (coercive-not (undefined? ns))\n                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) \":/\"))\n            (identical? (aget name (dec (.-length name))) \":\")\n            (coercive-not (== (.indexOf token \"::\" 1) -1)))\n      (reader-error reader \"Invalid token: \" token)\n      (if ns\n        (keyword (.substring ns 0 (.indexOf ns \"/\")) name)\n        (keyword token)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [286 300]},
 :full-name "cljs.reader/read-keyword",
 :full-name-encode "cljs.reader_read-keyword",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-keyword.cljsdoc)
</pre>

