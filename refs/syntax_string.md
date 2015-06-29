## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/string

 <table border="1">
<tr>
<td><samp>""</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#strings)
</td>
</tr>
</table>


Signifies a string.  ClojureScript strings are the same as JavaScript strings.

Strings may span multiple lines.

Standard escape characters such as `\"` are supported, as well as unicode
escape characters:

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |

---

Example:

```clj
"foo"
;;=> "foo"

"hello
     world"
;;=> "hello\n     world"
```

Characters can be escaped:

```clj
(println "foo\nbar")
;; prints:
;;   foo
;;   bar
```

---

See Also:

[`cljs.core/str`](cljs.core_str.md)<br>

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
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:578-597](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L578-L597)</ins>
</pre>


---

```clj
(defn- read-string*
  [reader _]
  (loop [sb (StringBuilder.)
         ch (read-char reader)]
    (case ch
      nil (reader-error reader "EOF while reading string")
      \\ (recur (doto sb (.append (escape-char sb reader)))
                (read-char reader))
      \" (str sb)
      (recur (doto sb (.append ch)) (read-char reader)))))
```

 <pre>
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:252-261](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L252-L261)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/string"]))
```

```clj
{:description "Signifies a string.  ClojureScript strings are the same as JavaScript strings.\n\nStrings may span multiple lines.\n\nStandard escape characters such as `\\\"` are supported, as well as unicode\nescape characters:\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |",
 :ns "syntax",
 :name "string",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/str"],
 :full-name-encode "syntax_string",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.3",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [578 597]},
 :extra-sources [{:code "(defn- read-string*\n  [reader _]\n  (loop [sb (StringBuilder.)\n         ch (read-char reader)]\n    (case ch\n      nil (reader-error reader \"EOF while reading string\")\n      \\\\ (recur (doto sb (.append (escape-char sb reader)))\n                (read-char reader))\n      \\\" (str sb)\n      (recur (doto sb (.append ch)) (read-char reader)))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [252 261]}],
 :syntax-form "\"\"",
 :examples [{:id "eb97ac",
             :content "```clj\n\"foo\"\n;;=> \"foo\"\n\n\"hello\n     world\"\n;;=> \"hello\\n     world\"\n```\n\nCharacters can be escaped:\n\n```clj\n(println \"foo\\nbar\")\n;; prints:\n;;   foo\n;;   bar\n```"}],
 :edn-doc "https://github.com/edn-format/edn#strings",
 :full-name "syntax/string",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_string.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_string.cljsdoc)
</pre>

