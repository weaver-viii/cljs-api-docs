## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-string\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-string\*__ reader _)<br>
</samp>

---





Source code:

```clj
(defn read-string*
  [reader _]
  (loop [buffer (gstring/StringBuffer.)
         ch (read-char reader)]
    (cond
     (nil? ch) (reader-error reader "EOF while reading")
     (identical? "\\" ch) (recur (do (.append buffer (escape-char buffer reader)) buffer)
                        (read-char reader))
     (identical? \" ch) (. buffer (toString))
     :default (recur (do (.append buffer ch) buffer) (read-char reader)))))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:291-300](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/reader.cljs#L291-L300)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-string*"]))
```

```clj
{:ns "cljs.reader",
 :name "read-string*",
 :type "function",
 :signature ["[reader _]"],
 :source {:code "(defn read-string*\n  [reader _]\n  (loop [buffer (gstring/StringBuffer.)\n         ch (read-char reader)]\n    (cond\n     (nil? ch) (reader-error reader \"EOF while reading\")\n     (identical? \"\\\\\" ch) (recur (do (.append buffer (escape-char buffer reader)) buffer)\n                        (read-char reader))\n     (identical? \\\" ch) (. buffer (toString))\n     :default (recur (do (.append buffer ch) buffer) (read-char reader)))))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [291 300]},
 :full-name "cljs.reader/read-string*",
 :full-name-encode "cljs.reader_read-stringSTAR",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-stringSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-stringSTAR.cljsdoc)
</pre>

