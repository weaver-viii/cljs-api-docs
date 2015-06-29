## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/deref

 <table border="1">
<tr>
<td><samp>@</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Used to dereference a reference value (e.g. an atom).  Expands to `(deref ...)`.

`@foo` = `(deref foo)`

---

Example:

```clj
(def a (atom 1))
@a
;;=> 1

(deref a)
;;=> 1
```

---

See Also:

[`cljs.core/deref`](cljs.core_deref.md)<br>

---


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
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:578-597](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L578-L597)</ins>
</pre>


---

```clj
(defn- wrapping-reader
  [sym]
  (fn [rdr _]
    (list sym (read rdr true nil true))))
```

 <pre>
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:319-322](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L319-L322)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/deref"]))
```

```clj
{:description "Used to dereference a reference value (e.g. an atom).  Expands to `(deref ...)`.\n\n`@foo` = `(deref foo)`",
 :ns "syntax",
 :name "deref",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/deref"],
 :full-name-encode "syntax_deref",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.3",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [578 597]},
 :extra-sources [{:code "(defn- wrapping-reader\n  [sym]\n  (fn [rdr _]\n    (list sym (read rdr true nil true))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [319 322]}],
 :syntax-form "@",
 :examples [{:id "08f886",
             :content "```clj\n(def a (atom 1))\n@a\n;;=> 1\n\n(deref a)\n;;=> 1\n```"}],
 :full-name "syntax/deref",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_deref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_deref.cljsdoc)
</pre>

