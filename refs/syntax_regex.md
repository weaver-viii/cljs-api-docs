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

```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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

