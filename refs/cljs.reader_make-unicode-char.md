## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/make-unicode-char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__make-unicode-char__ code-str)<br>
</samp>

---





Source code:

```clj
(defn make-unicode-char [code-str]
    (let [code (js/parseInt code-str 16)]
      (.fromCharCode js/String code)))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:189-191](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/reader.cljs#L189-L191)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/make-unicode-char"]))
```

```clj
{:ns "cljs.reader",
 :name "make-unicode-char",
 :type "function",
 :signature ["[code-str]"],
 :source {:code "(defn make-unicode-char [code-str]\n    (let [code (js/parseInt code-str 16)]\n      (.fromCharCode js/String code)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [189 191]},
 :full-name "cljs.reader/make-unicode-char",
 :full-name-encode "cljs.reader_make-unicode-char",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_make-unicode-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_make-unicode-char.cljsdoc)
</pre>

