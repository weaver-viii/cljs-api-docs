## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/regex

 <table border="1">
<tr>
<td><samp>#""</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Signifies a regular expression. Represented as JavaScript regular expressions.

An inline modifier can be included at the beginning of the regex:

|  modifier          | ClojureScript | JavaScript |
|--------------------|---------------|------------|
|  global match      | N/A           | `/foo/g`   |
|  case-insensitive  | `#"(?i)foo"`  | `/foo/i`   |
|  multi-line        | `#"(?m)f.*o"` | `/f.*o/m`  |

Global matches (i.e. multiple matches per line) can be achieved using `re-seq`.

---

Example:

```clj
#"foo"
;;=> #"foo"

(re-seq #"foo" "FOO BAR foo bar")
;;=> ("foo")
```

Case-insensitive matching:

```clj
#"(?i)foo"
;;=> #"foo"

(re-seq #"(?i)foo" "FOO BAR foo bar")
;;=> ("FOO" "foo")
```

---

See Also:

[`cljs.core/re-pattern`](cljs.core_re-pattern.md)<br>
[`cljs.core/re-find`](cljs.core_re-find.md)<br>
[`cljs.core/re-seq`](cljs.core_re-seq.md)<br>
[`cljs.core/re-matches`](cljs.core_re-matches.md)<br>

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
(defn read-regex
  [rdr ch]
  (let [sb (StringBuilder.)]
    (loop [ch (read-char rdr)]
      (if (identical? \" ch)
        (Pattern/compile (str sb))
        (if (nil? ch)
          (reader-error rdr "EOF while reading regex")
          (do
            (.append sb ch )
            (when (identical? \\ ch)
              (let [ch (read-char rdr)]
                (if (nil? ch)
                  (reader-error rdr "EOF while reading regex"))
                (.append sb ch)))
            (recur (read-char rdr))))))))
```

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── reader
                        └── impl
                            └── <ins>[commons.clj:129-144](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader/impl/commons.clj#L129-L144)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/regex"]))
```

```clj
{:description "Signifies a regular expression. Represented as JavaScript regular expressions.\n\nAn inline modifier can be included at the beginning of the regex:\n\n|  modifier          | ClojureScript | JavaScript |\n|--------------------|---------------|------------|\n|  global match      | N/A           | `/foo/g`   |\n|  case-insensitive  | `#\"(?i)foo\"`  | `/foo/i`   |\n|  multi-line        | `#\"(?m)f.*o\"` | `/f.*o/m`  |\n\nGlobal matches (i.e. multiple matches per line) can be achieved using `re-seq`.",
 :ns "syntax",
 :name "regex",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/re-pattern"
           "cljs.core/re-find"
           "cljs.core/re-seq"
           "cljs.core/re-matches"],
 :full-name-encode "syntax_regex",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.16",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [609 620]},
 :extra-sources [{:code "(defn read-regex\n  [rdr ch]\n  (let [sb (StringBuilder.)]\n    (loop [ch (read-char rdr)]\n      (if (identical? \\\" ch)\n        (Pattern/compile (str sb))\n        (if (nil? ch)\n          (reader-error rdr \"EOF while reading regex\")\n          (do\n            (.append sb ch )\n            (when (identical? \\\\ ch)\n              (let [ch (read-char rdr)]\n                (if (nil? ch)\n                  (reader-error rdr \"EOF while reading regex\"))\n                (.append sb ch)))\n            (recur (read-char rdr))))))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [129 144]}],
 :syntax-form "#\"\"",
 :examples [{:id "dacf80",
             :content "```clj\n#\"foo\"\n;;=> #\"foo\"\n\n(re-seq #\"foo\" \"FOO BAR foo bar\")\n;;=> (\"foo\")\n```\n\nCase-insensitive matching:\n\n```clj\n#\"(?i)foo\"\n;;=> #\"foo\"\n\n(re-seq #\"(?i)foo\" \"FOO BAR foo bar\")\n;;=> (\"FOO\" \"foo\")\n```"}],
 :full-name "syntax/regex",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_regex.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_regex.cljsdoc)
</pre>

