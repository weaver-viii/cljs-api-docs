## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macro-terminating?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macro-terminating?__ ch)<br>
</samp>

---





Source code:

```clj
(defn ^boolean macro-terminating? [ch]
  (and (not (identical? ch "#"))
       (not (identical? ch \'))
       (not (identical? ch ":"))
       (macros ch)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:73-77](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/reader.cljs#L73-L77)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macro-terminating?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.reader",
 :name "macro-terminating?",
 :signature ["[ch]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_macro-terminatingQMARK",
 :source {:code "(defn ^boolean macro-terminating? [ch]\n  (and (not (identical? ch \"#\"))\n       (not (identical? ch \\'))\n       (not (identical? ch \":\"))\n       (macros ch)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [73 77]},
 :full-name "cljs.reader/macro-terminating?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_macro-terminatingQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_macro-terminatingQMARK.cljsdoc)
</pre>

