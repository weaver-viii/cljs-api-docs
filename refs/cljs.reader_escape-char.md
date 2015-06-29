## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/escape-char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__escape-char__ buffer reader)<br>
</samp>

---





Source code:

```clj
(defn escape-char
  [buffer reader]
  (let [ch (read-char reader)
        mapresult (escape-char-map ch)]
    (if mapresult
      mapresult
      (cond
        (identical? ch \x)
        (->> (read-2-chars reader)
          (validate-unicode-escape unicode-2-pattern reader ch)
          (make-unicode-char))

        (identical? ch \u)
        (->> (read-4-chars reader)
          (validate-unicode-escape unicode-4-pattern reader ch)
          (make-unicode-char))

        (numeric? ch)
        (.fromCharCode js/String ch)

        :else
        (reader-error reader "Unexpected unicode escape \\" ch )))))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:193-214](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/reader.cljs#L193-L214)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/escape-char"]))
```

```clj
{:ns "cljs.reader",
 :name "escape-char",
 :type "function",
 :signature ["[buffer reader]"],
 :source {:code "(defn escape-char\n  [buffer reader]\n  (let [ch (read-char reader)\n        mapresult (escape-char-map ch)]\n    (if mapresult\n      mapresult\n      (cond\n        (identical? ch \\x)\n        (->> (read-2-chars reader)\n          (validate-unicode-escape unicode-2-pattern reader ch)\n          (make-unicode-char))\n\n        (identical? ch \\u)\n        (->> (read-4-chars reader)\n          (validate-unicode-escape unicode-4-pattern reader ch)\n          (make-unicode-char))\n\n        (numeric? ch)\n        (.fromCharCode js/String ch)\n\n        :else\n        (reader-error reader \"Unexpected unicode escape \\\\\" ch )))))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [193 214]},
 :full-name "cljs.reader/escape-char",
 :full-name-encode "cljs.reader_escape-char",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_escape-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_escape-char.cljsdoc)
</pre>

