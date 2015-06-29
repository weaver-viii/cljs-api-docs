## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/vector

 <table border="1">
<tr>
<td><samp>\[\]</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#vectors)
</td>
</tr>
</table>


Signifies a literal vector.

---

Example:

```clj
[1 2 3]
;;=> [1 2 3]
```

---

See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/vec`](cljs.core_vec.md)<br>

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
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:543-562](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L543-L562)</ins>
</pre>


---

```clj
(defn- read-vector
  [rdr _]
  (let [[line column] (when (indexing-reader? rdr)
                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])
        the-vector (read-delimited \] rdr true)]
    (with-meta the-vector
      (when line
        {:line line :column column}))))
```

 <pre>
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:168-175](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L168-L175)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/vector"]))
```

```clj
{:description "Signifies a literal vector.",
 :ns "syntax",
 :name "vector",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/vector" "cljs.core/vec"],
 :full-name-encode "syntax_vector",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.8",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [543 562]},
 :extra-sources [{:code "(defn- read-vector\n  [rdr _]\n  (let [[line column] (when (indexing-reader? rdr)\n                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n        the-vector (read-delimited \\] rdr true)]\n    (with-meta the-vector\n      (when line\n        {:line line :column column}))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.8",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [168 175]}],
 :syntax-form "[]",
 :examples [{:id "18e143",
             :content "```clj\n[1 2 3]\n;;=> [1 2 3]\n```"}],
 :edn-doc "https://github.com/edn-format/edn#vectors",
 :full-name "syntax/vector",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_vector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_vector.cljsdoc)
</pre>

