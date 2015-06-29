## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/number

 <table border="1">
<tr>
<td><samp> </samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#integers)
</td>
</tr>
</table>


Signifies a number.  ClojureScript numbers are the same as JavaScript numbers;
they are represented as double-precision 64-bit format IEEE 754 values.

---

Example:

```clj
123
;;=> 123

123.45
;;=> 123.45
```

Scientific notation;

```clj
12e3
;;=> 12000

1.2e-3
;;=> 0.0012
```

Standard hex and octal notations:

```clj
0x1f
;;=> 31

010
;;=> 8
```

Radix notation for using up to base 36.

```clj
2r10111
;;=> 23

8r32
;;=> 26

16rFF
;;=> 255

36rZ
;;=> 35
```

---



Source code:

```clj

```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/number"]))
```

```clj
{:description "Signifies a number.  ClojureScript numbers are the same as JavaScript numbers;\nthey are represented as double-precision 64-bit format IEEE 754 values.",
 :ns "syntax",
 :name "number",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_number",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form " ",
 :examples [{:id "f96060",
             :content "```clj\n123\n;;=> 123\n\n123.45\n;;=> 123.45\n```\n\nScientific notation;\n\n```clj\n12e3\n;;=> 12000\n\n1.2e-3\n;;=> 0.0012\n```\n\nStandard hex and octal notations:\n\n```clj\n0x1f\n;;=> 31\n\n010\n;;=> 8\n```\n\nRadix notation for using up to base 36.\n\n```clj\n2r10111\n;;=> 23\n\n8r32\n;;=> 26\n\n16rFF\n;;=> 255\n\n36rZ\n;;=> 35\n```"}],
 :edn-doc "https://github.com/edn-format/edn#integers",
 :full-name "syntax/number",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_number.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_number.cljsdoc)
</pre>

