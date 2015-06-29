## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/var

 <table border="1">
<tr>
<td><samp>#'</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Accesses the var attached to the given symbol.

`#'x` = `(var x)`

---

Example:

Access the metadata of a var:

```clj
(def x 123)
(meta #'x)
;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}
```

---

See Also:

[`special/var`](special_var.md)<br>

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
    (get-in [:symbols "syntax/var"]))
```

```clj
{:description "Accesses the var attached to the given symbol.\n\n`#'x` = `(var x)`",
 :ns "syntax",
 :name "var",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["special/var"],
 :full-name-encode "syntax_var",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "#'",
 :examples [{:id "673ef6",
             :content "Access the metadata of a var:\n\n```clj\n(def x 123)\n(meta #'x)\n;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n```"}],
 :full-name "syntax/var",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_var.cljsdoc)
</pre>
