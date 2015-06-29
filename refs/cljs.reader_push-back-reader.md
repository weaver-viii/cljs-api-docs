## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/push-back-reader

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__push-back-reader__ s)<br>
</samp>

---





Source code:

```clj
(defn push-back-reader [s]
  "Creates a StringPushbackReader from a given string"
  (StringPushbackReader. s (atom 0) (atom nil)))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:30-32](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L30-L32)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/push-back-reader"]))
```

```clj
{:ns "cljs.reader",
 :name "push-back-reader",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn push-back-reader [s]\n  \"Creates a StringPushbackReader from a given string\"\n  (StringPushbackReader. s (atom 0) (atom nil)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [30 32]},
 :full-name "cljs.reader/push-back-reader",
 :full-name-encode "cljs.reader_push-back-reader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_push-back-reader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_push-back-reader.cljsdoc)
</pre>

