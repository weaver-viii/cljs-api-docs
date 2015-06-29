## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/set

 <table border="1">
<tr>
<td><samp>#{}</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#sets)
</td>
</tr>
</table>


Signifies a literal set.  Values must be unique.

---

Example:

```clj
#{1 2 3}
;;=> #{1 2 3}
```

Duplicate values will cause an error:

```clj
#{1 1 2 3}
;; Error: Duplicate key: 1
```

---

See Also:

[`cljs.core/hash-set`](cljs.core_hash-set.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>

---


Source code:

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    nil))
```

 <pre>
tools.reader @ tools.reader-0.8.9
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:624-635](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.9/src/main/clojure/clojure/tools/reader.clj#L624-L635)</ins>
</pre>


---

```clj
(defn- read-set
  [rdr _]
  (let [[start-line start-column] (when (indexing-reader? rdr)
                                    [(get-line-number rdr) (int (dec (get-column-number rdr)))])
        the-set (if gensym-env
                  (SyntaxQuotedSet. (read-delimited \} rdr true))
                  (PersistentHashSet/createWithCheck (read-delimited \} rdr true)))
        [end-line end-column] (when (indexing-reader? rdr)
                                [(get-line-number rdr) (int (get-column-number rdr))])]
    (with-meta the-set
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
tools.reader @ tools.reader-0.8.9
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:364-381](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.9/src/main/clojure/clojure/tools/reader.clj#L364-L381)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/set"]))
```

```clj
{:description "Signifies a literal set.  Values must be unique.",
 :ns "syntax",
 :name "set",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-set"
           "cljs.core/sorted-set"
           "cljs.core/sorted-set-by"],
 :full-name-encode "syntax_set",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.9",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [624 635]},
 :extra-sources [{:code "(defn- read-set\n  [rdr _]\n  (let [[start-line start-column] (when (indexing-reader? rdr)\n                                    [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n        the-set (if gensym-env\n                  (SyntaxQuotedSet. (read-delimited \\} rdr true))\n                  (PersistentHashSet/createWithCheck (read-delimited \\} rdr true)))\n        [end-line end-column] (when (indexing-reader? rdr)\n                                [(get-line-number rdr) (int (get-column-number rdr))])]\n    (with-meta the-set\n      (when start-line\n        (merge\n         (when-let [file (get-file-name rdr)]\n           {:file file})\n         {:line start-line\n          :column start-column\n          :end-line end-line\n          :end-column end-column})))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.9",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [364 381]}],
 :syntax-form "#{}",
 :examples [{:id "f11ab6",
             :content "```clj\n#{1 2 3}\n;;=> #{1 2 3}\n```\n\nDuplicate values will cause an error:\n\n```clj\n#{1 1 2 3}\n;; Error: Duplicate key: 1\n```"}],
 :edn-doc "https://github.com/edn-format/edn#sets",
 :full-name "syntax/set",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_set.cljsdoc)
</pre>

