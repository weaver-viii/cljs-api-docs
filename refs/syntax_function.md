## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/function

 <table border="1">
<tr>
<td><samp>#()</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Create an anonymous function.

`#(...)` = `(fn [args] (...))`

Use `%` or `%1` to access the first argument.  Use `%2`, `%3` and so on to
access subsequent arguments.  Use `%&` to access the rest of the arguments past
the highest individually referenced argument.

Note that `#(1)` does not create a function that returns `1`, for the same
reason that `(1)` does evaluate to `1`.

`#()` forms cannot be nested, since this would create an ambiguity between the
automatically assigned argument names.

---

Example:

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4)
```

---

See Also:

[`cljs.core/fn`](cljs.core_fn.md)<br>
[`cljs.core/defn`](cljs.core_defn.md)<br>

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
    (get-in [:symbols "syntax/function"]))
```

```clj
{:description "Create an anonymous function.\n\n`#(...)` = `(fn [args] (...))`\n\nUse `%` or `%1` to access the first argument.  Use `%2`, `%3` and so on to\naccess subsequent arguments.  Use `%&` to access the rest of the arguments past\nthe highest individually referenced argument.\n\nNote that `#(1)` does not create a function that returns `1`, for the same\nreason that `(1)` does evaluate to `1`.\n\n`#()` forms cannot be nested, since this would create an ambiguity between the\nautomatically assigned argument names.",
 :ns "syntax",
 :name "function",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/fn" "cljs.core/defn"],
 :full-name-encode "syntax_function",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "#()",
 :examples [{:id "6a87de",
             :content "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4)\n```"}],
 :full-name "syntax/function",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_function.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_function.cljsdoc)
</pre>

