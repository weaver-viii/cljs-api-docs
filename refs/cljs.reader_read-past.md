## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-past

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-past__ pred rdr)<br>
</samp>

---




Source docstring:

```
Read until first character that doesn't match pred, returning
char.
```

Source code:

```clj
(defn read-past
  [pred rdr]
  (loop [ch (read-char rdr)]
    (if (pred ch)
      (recur (read-char rdr))
      ch)))
```

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:222-229](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/reader.cljs#L222-L229)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-past"]))
```

```clj
{:ns "cljs.reader",
 :name "read-past",
 :signature ["[pred rdr]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_read-past",
 :source {:code "(defn read-past\n  [pred rdr]\n  (loop [ch (read-char rdr)]\n    (if (pred ch)\n      (recur (read-char rdr))\n      ch)))",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [222 229]},
 :full-name "cljs.reader/read-past",
 :docstring "Read until first character that doesn't match pred, returning\nchar."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-past.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-past.cljsdoc)
</pre>

