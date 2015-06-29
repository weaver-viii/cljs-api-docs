## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/eval

 <table border="1">
<tr>
<td><samp>#=</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113)
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
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:609-620](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L609-L620)</ins>
</pre>


---

```clj
(defn- read-eval
  [rdr _]
  (when-not *read-eval*
    (reader-error rdr "#= not allowed when *read-eval* is false"))
  (eval (read rdr true nil true)))
```

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:433-437](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L433-L437)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/eval"]))
```

```clj
{:ns "syntax",
 :name "eval",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_eval",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.16",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [609 620]},
 :extra-sources [{:code "(defn- read-eval\n  [rdr _]\n  (when-not *read-eval*\n    (reader-error rdr \"#= not allowed when *read-eval* is false\"))\n  (eval (read rdr true nil true)))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [433 437]}],
 :syntax-form "#=",
 :full-name "syntax/eval",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_eval.cljsdoc)
</pre>

