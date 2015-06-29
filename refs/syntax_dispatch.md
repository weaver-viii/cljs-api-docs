## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/dispatch

 <table border="1">
<tr>
<td><samp>#</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#-dispatch-character)
</td>
</tr>
</table>






Source code:

```clj
(defn- macros [ch]
  (case ch
    \" read-string*
    \: read-keyword
    \; read-comment
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'clojure.core/deref)
    \^ read-meta
    \` read-syntax-quote ;;(wrapping-reader 'syntax-quote)
    \~ read-unquote
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char*
    \% read-arg
    \# read-dispatch
    nil))
```

 <pre>
tools.reader @ tools.reader-0.8.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:578-597](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.0/src/main/clojure/clojure/tools/reader.clj#L578-L597)</ins>
</pre>


---

```clj
(defn- read-dispatch
  [rdr _]
  (if-let [ch (read-char rdr)]
    (if-let [dm (dispatch-macros ch)]
      (dm rdr ch)
      (if-let [obj (read-tagged (doto rdr (unread ch)) ch)] ;; ctor reader is implemented as a taggged literal
        obj
        (reader-error rdr "No dispatch macro for " ch)))
    (reader-error rdr "EOF while reading character")))
```

 <pre>
tools.reader @ tools.reader-0.8.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:53-61](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.0/src/main/clojure/clojure/tools/reader.clj#L53-L61)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/dispatch"]))
```

```clj
{:ns "syntax",
 :name "dispatch",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_dispatch",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.0",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [578 597]},
 :extra-sources [{:code "(defn- read-dispatch\n  [rdr _]\n  (if-let [ch (read-char rdr)]\n    (if-let [dm (dispatch-macros ch)]\n      (dm rdr ch)\n      (if-let [obj (read-tagged (doto rdr (unread ch)) ch)] ;; ctor reader is implemented as a taggged literal\n        obj\n        (reader-error rdr \"No dispatch macro for \" ch)))\n    (reader-error rdr \"EOF while reading character\")))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.0",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [53 61]}],
 :syntax-form "#",
 :edn-doc "https://github.com/edn-format/edn#-dispatch-character",
 :full-name "syntax/dispatch",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_dispatch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_dispatch.cljsdoc)
</pre>

