## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/arg

 <table border="1">
<tr>
<td><samp>%</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
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
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:543-562](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L543-L562)</ins>
</pre>


---

```clj
(defn- read-arg
  [rdr pct]
  (if-not (thread-bound? #'arg-env)
    (read-symbol rdr pct)
    (let [ch (peek-char rdr)]
      (cond
        (or (whitespace? ch)
            (macro-terminating? ch)
            (nil? ch))
        (register-arg 1)

        (identical? ch \&)
        (do (read-char rdr)
            (register-arg -1))

        :else
        (let [n (read rdr true nil true)]
          (if-not (integer? n)
            (throw (IllegalStateException. "Arg literal must be %, %& or %integer"))
            (register-arg n)))))))
```

 <pre>
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:356-375](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L356-L375)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/arg"]))
```

```clj
{:ns "syntax",
 :name "arg",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_arg",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.6",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [543 562]},
 :extra-sources [{:code "(defn- read-arg\n  [rdr pct]\n  (if-not (thread-bound? #'arg-env)\n    (read-symbol rdr pct)\n    (let [ch (peek-char rdr)]\n      (cond\n        (or (whitespace? ch)\n            (macro-terminating? ch)\n            (nil? ch))\n        (register-arg 1)\n\n        (identical? ch \\&)\n        (do (read-char rdr)\n            (register-arg -1))\n\n        :else\n        (let [n (read rdr true nil true)]\n          (if-not (integer? n)\n            (throw (IllegalStateException. \"Arg literal must be %, %& or %integer\"))\n            (register-arg n)))))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [356 375]}],
 :syntax-form "%",
 :full-name "syntax/arg",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_arg.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_arg.cljsdoc)
</pre>

