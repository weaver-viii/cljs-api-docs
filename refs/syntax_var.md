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
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:580-591](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L580-L591)</ins>
</pre>


---

```clj
(defn- wrapping-reader
  [sym]
  (fn [rdr _]
    (list sym (read rdr true nil true))))
```

 <pre>
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:301-304](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L301-L304)</ins>
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
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.10",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [580 591]},
 :extra-sources [{:code "(defn- wrapping-reader\n  [sym]\n  (fn [rdr _]\n    (list sym (read rdr true nil true))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [301 304]}],
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

