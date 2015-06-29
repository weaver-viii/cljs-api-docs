## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/meta

 <table border="1">
<tr>
<td><samp>^</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Attaches metadata to the following form.

Metadata is a map.  It can be attached to a collection or symbol.

If the provided metadata is a keyword, the resulting metadata will be a map
containing that keyword with an associated value `true`.

If the provided metadata is a string or symbol, the resulting metadata will be
a map associating `:tag` with the value of the string or evaluated symbol.

---

Example:

Attach metadata to a collection:

```clj
^:foo [1 2 3]
;;=> [1 2 3]
```

View the resulting metadata:

```clj
(meta ^:foo [1 2 3])
;;=> {:foo true}

(meta ^{:foo "bar"} [1 2 3])
;;=> {:foo "bar"}

(meta ^"foo" [1 2 3])
;;=> {:tag "foo"}

(def foo 1)
(meta ^foo [1 2 3])
;;=> {:tag 1}
```

Chain metadata:

```clj
(meta ^:foo ^"foo" [1 2 3])
;;=> {:foo true, :tag "foo"}
```

---

See Also:

[`cljs.core/meta`](cljs.core_meta.md)<br>
[`cljs.core/with-meta`](cljs.core_with-meta.md)<br>
[`cljs.core/vary-meta`](cljs.core_vary-meta.md)<br>
[`cljs.core/alter-meta!`](cljs.core_alter-metaBANG.md)<br>

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
(defn- read-meta
  [rdr _]
  (log-source rdr
    (let [[line column] (when (indexing-reader? rdr)
                          [(get-line-number rdr) (int (dec (get-column-number rdr)))])
          m (desugar-meta (read rdr true nil true))]
      (when-not (map? m)
        (reader-error rdr "Metadata must be Symbol, Keyword, String or Map"))
      (let [o (read rdr true nil true)]
        (if (instance? IMeta o)
          (let [m (if (and line
                           (seq? o))
                    (assoc m :line line
                           :column column)
                    m)]
            (if (instance? IObj o)
              (with-meta o (merge (meta o) m))
              (reset-meta! o m)))
          (reader-error rdr "Metadata can only be applied to IMetas"))))))
```

 <pre>
tools.reader @ tools.reader-0.8.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:324-342](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.0/src/main/clojure/clojure/tools/reader.clj#L324-L342)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/meta"]))
```

```clj
{:description "Attaches metadata to the following form.\n\nMetadata is a map.  It can be attached to a collection or symbol.\n\nIf the provided metadata is a keyword, the resulting metadata will be a map\ncontaining that keyword with an associated value `true`.\n\nIf the provided metadata is a string or symbol, the resulting metadata will be\na map associating `:tag` with the value of the string or evaluated symbol.",
 :ns "syntax",
 :name "meta",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/meta"
           "cljs.core/with-meta"
           "cljs.core/vary-meta"
           "cljs.core/alter-meta!"],
 :full-name-encode "syntax_meta",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.0",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [578 597]},
 :extra-sources [{:code "(defn- read-meta\n  [rdr _]\n  (log-source rdr\n    (let [[line column] (when (indexing-reader? rdr)\n                          [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n          m (desugar-meta (read rdr true nil true))]\n      (when-not (map? m)\n        (reader-error rdr \"Metadata must be Symbol, Keyword, String or Map\"))\n      (let [o (read rdr true nil true)]\n        (if (instance? IMeta o)\n          (let [m (if (and line\n                           (seq? o))\n                    (assoc m :line line\n                           :column column)\n                    m)]\n            (if (instance? IObj o)\n              (with-meta o (merge (meta o) m))\n              (reset-meta! o m)))\n          (reader-error rdr \"Metadata can only be applied to IMetas\"))))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.0",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [324 342]}],
 :syntax-form "^",
 :examples [{:id "5b8fec",
             :content "Attach metadata to a collection:\n\n```clj\n^:foo [1 2 3]\n;;=> [1 2 3]\n```\n\nView the resulting metadata:\n\n```clj\n(meta ^:foo [1 2 3])\n;;=> {:foo true}\n\n(meta ^{:foo \"bar\"} [1 2 3])\n;;=> {:foo \"bar\"}\n\n(meta ^\"foo\" [1 2 3])\n;;=> {:tag \"foo\"}\n\n(def foo 1)\n(meta ^foo [1 2 3])\n;;=> {:tag 1}\n```\n\nChain metadata:\n\n```clj\n(meta ^:foo ^\"foo\" [1 2 3])\n;;=> {:foo true, :tag \"foo\"}\n```"}],
 :full-name "syntax/meta",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_meta.cljsdoc)
</pre>

