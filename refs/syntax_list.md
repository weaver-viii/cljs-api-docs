## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/list

 <table border="1">
<tr>
<td><samp>()</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#lists)
</td>
</tr>
</table>


Signifies a literal list.  When evaluated, it is interpreted as a call to some
code.  The first argument is called with the subsequent arguments.

---

Example:

The following is a list that is evaluated to create var `a`:

```clj
(def a 1)
```

An empty list is unevaluated and left as an empty list:

```clj
()
;;=> ()
```

To signify an unevaluated list, precede it with a quote:

```clj
'(1 2 3)
;;=> (1 2 3)
```

---

See Also:

[`syntax/vector`](syntax_vector.md)<br>
[`syntax/quote`](syntax_quote.md)<br>

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
    (get-in [:symbols "syntax/list"]))
```

```clj
{:description "Signifies a literal list.  When evaluated, it is interpreted as a call to some\ncode.  The first argument is called with the subsequent arguments.",
 :ns "syntax",
 :name "list",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/vector" "syntax/quote"],
 :full-name-encode "syntax_list",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "()",
 :examples [{:id "cd26b0",
             :content "The following is a list that is evaluated to create var `a`:\n\n```clj\n(def a 1)\n```\n\nAn empty list is unevaluated and left as an empty list:\n\n```clj\n()\n;;=> ()\n```\n\nTo signify an unevaluated list, precede it with a quote:\n\n```clj\n'(1 2 3)\n;;=> (1 2 3)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#lists",
 :full-name "syntax/list",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_list.cljsdoc)
</pre>

