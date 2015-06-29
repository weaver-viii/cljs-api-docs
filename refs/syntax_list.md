## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/list

 <table border="1">
<tr>
<td><samp>()</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#lists)
</td>
</tr>
</table>


Signifies a literal list.  When evaluated, it is interpreted as a call to some
code.  The first argument is called with the subsequent arguments.

---

Example:

The following is a list that is evaluated to create var `a`:

```clj
(def a 1)
```

An empty list is unevaluated and left as an empty list:

```clj
()
;;=> ()
```

To signify an unevaluated list, precede it with a quote:

```clj
'(1 2 3)
;;=> (1 2 3)
```

---

See Also:

[`syntax/vector`](syntax_vector.md)<br>
[`syntax/quote`](syntax_quote.md)<br>

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
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:588-607](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L588-L607)</ins>
</pre>


---

```clj
(defn- read-list
  [rdr _]
  (let [[start-line start-column] (starting-line-col-info rdr)
        the-list (read-delimited \) rdr true)
        [end-line end-column] (ending-line-col-info rdr)]
    (with-meta (if (empty? the-list)
                 '()
                 (clojure.lang.PersistentList/create the-list))
      (when start-line
        (merge
         (when-let [file (get-file-name rdr)]
           {:file file})
         {:line start-line
          :column start-column
          :end-line end-line
          :end-column end-column})))))
```

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:174-189](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L174-L189)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/list"]))
```

```clj
{:description "Signifies a literal list.  When evaluated, it is interpreted as a call to some\ncode.  The first argument is called with the subsequent arguments.",
 :ns "syntax",
 :name "list",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/vector" "syntax/quote"],
 :full-name-encode "syntax_list",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.16",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [588 607]},
 :extra-sources [{:code "(defn- read-list\n  [rdr _]\n  (let [[start-line start-column] (starting-line-col-info rdr)\n        the-list (read-delimited \\) rdr true)\n        [end-line end-column] (ending-line-col-info rdr)]\n    (with-meta (if (empty? the-list)\n                 '()\n                 (clojure.lang.PersistentList/create the-list))\n      (when start-line\n        (merge\n         (when-let [file (get-file-name rdr)]\n           {:file file})\n         {:line start-line\n          :column start-column\n          :end-line end-line\n          :end-column end-column})))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [174 189]}],
 :syntax-form "()",
 :examples [{:id "cd26b0",
             :content "The following is a list that is evaluated to create var `a`:\n\n```clj\n(def a 1)\n```\n\nAn empty list is unevaluated and left as an empty list:\n\n```clj\n()\n;;=> ()\n```\n\nTo signify an unevaluated list, precede it with a quote:\n\n```clj\n'(1 2 3)\n;;=> (1 2 3)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#lists",
 :full-name "syntax/list",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_list.cljsdoc)
</pre>

