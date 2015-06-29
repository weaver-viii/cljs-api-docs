## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/skip-line

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__skip-line__ reader _)<br>
</samp>

---




Source docstring:

```
Advances the reader to the end of a line. Returns the reader
```

Source code:

```clj
(defn skip-line
  [reader _]
  (loop []
    (let [ch (read-char reader)]
      (if (or (identical? ch \n) (identical? ch \r) (nil? ch))
        reader
        (recur)))))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:90-97](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/reader.cljs#L90-L97)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/skip-line"]))
```

```clj
{:ns "cljs.reader",
 :name "skip-line",
 :signature ["[reader _]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_skip-line",
 :source {:code "(defn skip-line\n  [reader _]\n  (loop []\n    (let [ch (read-char reader)]\n      (if (or (identical? ch \\n) (identical? ch \\r) (nil? ch))\n        reader\n        (recur)))))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [90 97]},
 :full-name "cljs.reader/skip-line",
 :docstring "Advances the reader to the end of a line. Returns the reader"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_skip-line.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_skip-line.cljsdoc)
</pre>

