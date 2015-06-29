## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-string

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read-string</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read-string)
</td>
</tr>
</table>

 <samp>
(__read-string__ s)<br>
</samp>

---




Source docstring:

```
Reads one object from the string s
```

Source code:

```clj
(defn read-string
  [s]
  (let [r (push-back-reader s)]
    (read r true nil false)))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:434-438](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L434-L438)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-string"]))
```

```clj
{:ns "cljs.reader",
 :name "read-string",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_read-string",
 :source {:code "(defn read-string\n  [s]\n  (let [r (push-back-reader s)]\n    (read r true nil false)))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [434 438]},
 :full-name "cljs.reader/read-string",
 :clj-symbol "clojure.core/read-string",
 :docstring "Reads one object from the string s"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-string.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-string.cljsdoc)
</pre>

