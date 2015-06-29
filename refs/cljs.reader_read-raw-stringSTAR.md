## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-raw-string\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-raw-string\*__ reader _)<br>
</samp>

---





Source code:

```clj
(defn read-raw-string*
  [reader _]
  (loop [buffer (gstring/StringBuffer.)
         ch (read-char reader)]
    (cond
      (nil? ch) (reader-error reader "EOF while reading")
      (identical? "\\" ch) (do (.append buffer ch)
                             (let [nch (read-char reader)]
                               (if (nil? nch)
                                 (reader-error reader "EOF while reading")
                                 (recur (doto buffer (.append nch))
                                        (read-char reader)))))
      (identical? "\"" ch) (.toString buffer)
      :else (recur (doto buffer (.append ch)) (read-char reader)))))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:303-316](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/reader.cljs#L303-L316)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-raw-string*"]))
```

```clj
{:ns "cljs.reader",
 :name "read-raw-string*",
 :type "function",
 :signature ["[reader _]"],
 :source {:code "(defn read-raw-string*\n  [reader _]\n  (loop [buffer (gstring/StringBuffer.)\n         ch (read-char reader)]\n    (cond\n      (nil? ch) (reader-error reader \"EOF while reading\")\n      (identical? \"\\\\\" ch) (do (.append buffer ch)\n                             (let [nch (read-char reader)]\n                               (if (nil? nch)\n                                 (reader-error reader \"EOF while reading\")\n                                 (recur (doto buffer (.append nch))\n                                        (read-char reader)))))\n      (identical? \"\\\"\" ch) (.toString buffer)\n      :else (recur (doto buffer (.append ch)) (read-char reader)))))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [303 316]},
 :full-name "cljs.reader/read-raw-string*",
 :full-name-encode "cljs.reader_read-raw-stringSTAR",
 :history [["+" "0.0-2261"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-raw-stringSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-raw-stringSTAR.cljsdoc)
</pre>

