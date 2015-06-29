## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/hashbang

 <table border="1">
<tr>
<td><samp>#!</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L114)
</td>
</tr>
</table>






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
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:580-591](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L580-L591)</ins>
</pre>


---

```clj
(defn read-comment
  [rdr & _]
  (skip-line rdr _))
```

 <pre>
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── reader
                        └── impl
                            └── <ins>[commons.clj:120-122](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader/impl/commons.clj#L120-L122)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/hashbang"]))
```

```clj
{:ns "syntax",
 :name "hashbang",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_hashbang",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.10",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [580 591]},
 :extra-sources [{:code "(defn read-comment\n  [rdr & _]\n  (skip-line rdr _))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.10",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [120 122]}],
 :syntax-form "#!",
 :full-name "syntax/hashbang",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L114"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_hashbang.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_hashbang.cljsdoc)
</pre>

