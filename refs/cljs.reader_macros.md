## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macros

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macros__ c)<br>
</samp>

---





Source code:

```clj
(defn macros [c]
  (cond
   (identical? c \") read-string*
   (identical? c \:) read-keyword
   (identical? c \;) not-implemented ;; never hit this
   (identical? c \') (wrapping-reader 'quote)
   (identical? c \@) (wrapping-reader 'deref)
   (identical? c \^) read-meta
   (identical? c \`) not-implemented
   (identical? c \~) not-implemented
   (identical? c \() read-list
   (identical? c \)) read-unmatched-delimiter
   (identical? c \[) read-vector
   (identical? c \]) read-unmatched-delimiter
   (identical? c \{) read-map
   (identical? c \}) read-unmatched-delimiter
   (identical? c \\) read-char
   (identical? c \%) not-implemented
   (identical? c \#) read-dispatch
   :else nil))
```

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:384-403](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/reader.cljs#L384-L403)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macros"]))
```

```clj
{:ns "cljs.reader",
 :name "macros",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn macros [c]\n  (cond\n   (identical? c \\\") read-string*\n   (identical? c \\:) read-keyword\n   (identical? c \\;) not-implemented ;; never hit this\n   (identical? c \\') (wrapping-reader 'quote)\n   (identical? c \\@) (wrapping-reader 'deref)\n   (identical? c \\^) read-meta\n   (identical? c \\`) not-implemented\n   (identical? c \\~) not-implemented\n   (identical? c \\() read-list\n   (identical? c \\)) read-unmatched-delimiter\n   (identical? c \\[) read-vector\n   (identical? c \\]) read-unmatched-delimiter\n   (identical? c \\{) read-map\n   (identical? c \\}) read-unmatched-delimiter\n   (identical? c \\\\) read-char\n   (identical? c \\%) not-implemented\n   (identical? c \\#) read-dispatch\n   :else nil))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [384 403]},
 :full-name "cljs.reader/macros",
 :full-name-encode "cljs.reader_macros",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_macros.cljsdoc)
</pre>

