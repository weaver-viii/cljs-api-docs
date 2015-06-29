## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/set

 <table border="1">
<tr>
<td><samp>#{}</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#sets)
</td>
</tr>
</table>


Signifies a literal set.  Values must be unique.

---

Example:

```clj
#{1 2 3}
;;=> #{1 2 3}
```

Duplicate values will cause an error:

```clj
#{1 1 2 3}
;; Error: Duplicate key: 1
```

---

See Also:

[`cljs.core/hash-set`](cljs.core_hash-set.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>

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
    (get-in [:symbols "syntax/set"]))
```

```clj
{:description "Signifies a literal set.  Values must be unique.",
 :ns "syntax",
 :name "set",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-set"
           "cljs.core/sorted-set"
           "cljs.core/sorted-set-by"],
 :full-name-encode "syntax_set",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "#{}",
 :examples [{:id "f11ab6",
             :content "```clj\n#{1 2 3}\n;;=> #{1 2 3}\n```\n\nDuplicate values will cause an error:\n\n```clj\n#{1 1 2 3}\n;; Error: Duplicate key: 1\n```"}],
 :edn-doc "https://github.com/edn-format/edn#sets",
 :full-name "syntax/set",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_set.cljsdoc)
</pre>

