## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/map

 <table border="1">
<tr>
<td><samp>{}</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#maps)
</td>
</tr>
</table>


Signifies a map.  Must contain pairs of key-values.  Keys and values can be any type.

---

Example:

```clj
{:foo 1 :bar 2}
;;=> {:foo 1, :bar 2}
```

Use any value as a key:

```clj
(def m {[1 2] 3})
(get m [1 2])
;;=> 3
```

---

See Also:

[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>
[`cljs.core/array-map`](cljs.core_array-map.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>
[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>

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
(defn- read-map
  [rdr _]
  (let [[line column] (when (indexing-reader? rdr)
                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])
        the-map (read-delimited \} rdr true)
        map-count (count the-map)]
    (when (odd? map-count)
      (reader-error rdr "Map literal must contain an even number of forms"))
    (with-meta
      (if (zero? map-count)
        {}
        (RT/map (to-array the-map)))
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
                    └── <ins>[reader.clj:177-190](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L177-L190)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/map"]))
```

```clj
{:description "Signifies a map.  Must contain pairs of key-values.  Keys and values can be any type.",
 :ns "syntax",
 :name "map",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-map"
           "cljs.core/array-map"
           "cljs.core/sorted-map"
           "cljs.core/sorted-map-by"],
 :full-name-encode "syntax_map",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.8",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [543 562]},
 :extra-sources [{:code "(defn- read-map\n  [rdr _]\n  (let [[line column] (when (indexing-reader? rdr)\n                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n        the-map (read-delimited \\} rdr true)\n        map-count (count the-map)]\n    (when (odd? map-count)\n      (reader-error rdr \"Map literal must contain an even number of forms\"))\n    (with-meta\n      (if (zero? map-count)\n        {}\n        (RT/map (to-array the-map)))\n      (when line\n        {:line line :column column}))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.8",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [177 190]}],
 :syntax-form "{}",
 :examples [{:id "4696ad",
             :content "```clj\n{:foo 1 :bar 2}\n;;=> {:foo 1, :bar 2}\n```\n\nUse any value as a key:\n\n```clj\n(def m {[1 2] 3})\n(get m [1 2])\n;;=> 3\n```"}],
 :edn-doc "https://github.com/edn-format/edn#maps",
 :full-name "syntax/map",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_map.cljsdoc)
</pre>

