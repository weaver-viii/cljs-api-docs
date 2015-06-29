## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/cond-splicing

 <table border="1">
<tr>
<td><samp>#?@</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3190"><img valign="middle" alt="[+] 0.0-3190" src="https://img.shields.io/badge/+-0.0--3190-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc5)
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
    \? read-cond
    nil))
```

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:753-765](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L753-L765)</ins>
</pre>


---

```clj
(defn- read-cond
  [rdr _ opts pending-forms]
  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))
    (throw (RuntimeException. "Conditional read not allowed")))
  (if-let [ch (read-char rdr)]
    (let [splicing (= ch \@)
          ch (if splicing (read-char rdr) ch)]
      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]
        (if (not= ch \()
          (throw (RuntimeException. "read-cond body must be a list"))
          (binding [*suppress-read* (or *suppress-read* (= :preserve (:read-cond opts)))]
            (if *suppress-read*
              (reader-conditional (read-list rdr ch opts pending-forms) splicing)
              (read-cond-delimited rdr splicing opts pending-forms))))
        (reader-error rdr "EOF while reading character")))
    (reader-error rdr "EOF while reading character")))
```

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:488-503](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L488-L503)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/cond-splicing"]))
```

```clj
{:ns "syntax",
 :name "cond-splicing",
 :history [["+" "0.0-3190"]],
 :type "syntax",
 :full-name-encode "syntax_cond-splicing",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.9.2",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [753 765]},
 :extra-sources [{:code "(defn- read-cond\n  [rdr _ opts pending-forms]\n  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))\n    (throw (RuntimeException. \"Conditional read not allowed\")))\n  (if-let [ch (read-char rdr)]\n    (let [splicing (= ch \\@)\n          ch (if splicing (read-char rdr) ch)]\n      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]\n        (if (not= ch \\()\n          (throw (RuntimeException. \"read-cond body must be a list\"))\n          (binding [*suppress-read* (or *suppress-read* (= :preserve (:read-cond opts)))]\n            (if *suppress-read*\n              (reader-conditional (read-list rdr ch opts pending-forms) splicing)\n              (read-cond-delimited rdr splicing opts pending-forms))))\n        (reader-error rdr \"EOF while reading character\")))\n    (reader-error rdr \"EOF while reading character\")))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.2",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [488 503]}],
 :syntax-form "#?@",
 :full-name "syntax/cond-splicing",
 :clj-doc "http://clojure.org/reader#toc5"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_cond-splicing.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_cond-splicing.cljsdoc)
</pre>

