## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/character

 <table border="1">
<tr>
<td><samp>\\</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#characters)
</td>
</tr>
</table>


Signifies a single character string.  Carried over from Clojure for
compatibility.  They are represented as single character JavaScript strings.

`\c` = `"c"`

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |

| special characters  | result   |
|---------------------|----------|
| `\newline`          | `"\n"`   |
| `\space`            | `" "`    |
| `\tab`              | `"\t"`   |
| `\formfeed`         | `"\f"`   |
| `\backspace`        | `"\b"`   |
| `\return`           | `"\r"`   |

---

Example:

```clj
\c
;;=> "c"

\A
;;=> "A"

\newline
;;=> "\n"

\u00a1
;;=> "¡"

\o256
;;=> "®"
```

---

See Also:

[`syntax/string`](syntax_string.md)<br>
[`cljs.core/str`](cljs.core_str.md)<br>

---


Source code:

```clj

```

 <pre>
clojure @ clojure-1.5.1
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/character"]))
```

```clj
{:description "Signifies a single character string.  Carried over from Clojure for\ncompatibility.  They are represented as single character JavaScript strings.\n\n`\\c` = `\"c\"`\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |\n\n| special characters  | result   |\n|---------------------|----------|\n| `\\newline`          | `\"\\n\"`   |\n| `\\space`            | `\" \"`    |\n| `\\tab`              | `\"\\t\"`   |\n| `\\formfeed`         | `\"\\f\"`   |\n| `\\backspace`        | `\"\\b\"`   |\n| `\\return`           | `\"\\r\"`   |",
 :ns "syntax",
 :name "character",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/string" "cljs.core/str"],
 :full-name-encode "syntax_character",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "\\",
 :examples [{:id "495a47",
             :content "```clj\n\\c\n;;=> \"c\"\n\n\\A\n;;=> \"A\"\n\n\\newline\n;;=> \"\\n\"\n\n\\u00a1\n;;=> \"¡\"\n\n\\o256\n;;=> \"®\"\n```"}],
 :edn-doc "https://github.com/edn-format/edn#characters",
 :full-name "syntax/character",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_character.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_character.cljsdoc)
</pre>

