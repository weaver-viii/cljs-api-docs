## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/special-symbols

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__special-symbols__ t not-found)<br>
</samp>

---





Source code:

```clj
(defn special-symbols [t not-found]
  (cond
   (identical? t "nil") nil
   (identical? t "true") true
   (identical? t "false") false
   :else not-found))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:310-315](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/reader.cljs#L310-L315)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/special-symbols"]))
```

```clj
{:ns "cljs.reader",
 :name "special-symbols",
 :type "function",
 :signature ["[t not-found]"],
 :source {:code "(defn special-symbols [t not-found]\n  (cond\n   (identical? t \"nil\") nil\n   (identical? t \"true\") true\n   (identical? t \"false\") false\n   :else not-found))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [310 315]},
 :full-name "cljs.reader/special-symbols",
 :full-name-encode "cljs.reader_special-symbols",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_special-symbols.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_special-symbols.cljsdoc)
</pre>

