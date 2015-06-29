## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/source

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/source</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/source)
</td>
</tr>
</table>

 <samp>
(__source__ name)<br>
</samp>

---

Prints the source code for the given symbol `name`, if it can find it.  This
requires that the symbol resolve to a Var defined in a namespace for which the
.cljs is in the classpath.

---

Example:

```clj
(source comment)
;; Prints:
;; (defmacro comment
;;   "Ignores body, yields nil"
;;   {:added "1.0"}
;;   [& body])
;;
;;=> nil
```

---

See Also:

[`cljs.repl/doc`](cljs.repl_doc.md)<br>

---

Source docstring:

```
Prints the source code for the given symbol, if it can find it.
This requires that the symbol resolve to a Var defined in a
namespace for which the .cljs is in the classpath.

Example: (source filter)
```

Source code:

```clj
(defmacro source
  [n]
  `(println ~(or (source-fn &env n) (str "Source not found"))))
```

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1061-1068](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl.clj#L1061-L1068)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/source"]))
```

```clj
{:description "Prints the source code for the given symbol `name`, if it can find it.  This\nrequires that the symbol resolve to a Var defined in a namespace for which the\n.cljs is in the classpath.",
 :ns "cljs.repl",
 :name "source",
 :signature ["[name]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/doc"],
 :full-name-encode "cljs.repl_source",
 :source {:code "(defmacro source\n  [n]\n  `(println ~(or (source-fn &env n) (str \"Source not found\"))))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl.clj",
          :lines [1061 1068]},
 :examples [{:id "94c94c",
             :content "```clj\n(source comment)\n;; Prints:\n;; (defmacro comment\n;;   \"Ignores body, yields nil\"\n;;   {:added \"1.0\"}\n;;   [& body])\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/source",
 :clj-symbol "clojure.repl/source",
 :docstring "Prints the source code for the given symbol, if it can find it.\nThis requires that the symbol resolve to a Var defined in a\nnamespace for which the .cljs is in the classpath.\n\nExample: (source filter)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_source.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_source.cljsdoc)
</pre>

