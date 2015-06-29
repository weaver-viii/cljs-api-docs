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
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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

