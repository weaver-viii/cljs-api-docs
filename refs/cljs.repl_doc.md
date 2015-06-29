## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/doc

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/doc</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/doc)
</td>
</tr>
</table>

 <samp>
(__doc__ name)<br>
</samp>

---

Prints documentation for the var or special form with the name `name`.

---

Example:

```clj
(doc map)
;; Prints:
;;  -------------------------
;;  cljs.core/map
;;  [f coll]
;;    Returns a lazy sequence consisting of the result of applying f to
;;    the set of first items of each coll, followed by applying f to the
;;    set of second items in each coll, until any one of the colls is
;;    exhausted.  Any remaining items in other colls are ignored. Function
;;    f should accept number-of-colls arguments. Returns a transducer when
;;    no collection is provided.
;;
;;=> nil
```

---

See Also:

[`cljs.repl/find-doc`](cljs.repl_find-doc.md)<br>
[`cljs.core/meta`](cljs.core_meta.md)<br>
[`special/var`](special_var.md)<br>

---

Source docstring:

```
Prints documentation for a var or special form given its name
```

Source code:

```clj
(defmacro doc
  [sym]
  `(cljs.repl/print-doc (meta (var ~sym))))
```

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:233-236](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/repl.clj#L233-L236)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/doc"]))
```

```clj
{:description "Prints documentation for the var or special form with the name `name`.",
 :ns "cljs.repl",
 :name "doc",
 :signature ["[name]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :related ["cljs.repl/find-doc" "cljs.core/meta" "special/var"],
 :full-name-encode "cljs.repl_doc",
 :source {:code "(defmacro doc\n  [sym]\n  `(cljs.repl/print-doc (meta (var ~sym))))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/clj/cljs/repl.clj",
          :lines [233 236]},
 :examples [{:id "4d2768",
             :content "```clj\n(doc map)\n;; Prints:\n;;  -------------------------\n;;  cljs.core/map\n;;  [f coll]\n;;    Returns a lazy sequence consisting of the result of applying f to\n;;    the set of first items of each coll, followed by applying f to the\n;;    set of second items in each coll, until any one of the colls is\n;;    exhausted.  Any remaining items in other colls are ignored. Function\n;;    f should accept number-of-colls arguments. Returns a transducer when\n;;    no collection is provided.\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/doc",
 :clj-symbol "clojure.repl/doc",
 :docstring "Prints documentation for a var or special form given its name"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_doc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_doc.cljsdoc)
</pre>

