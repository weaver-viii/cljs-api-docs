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
(defn- read-fn
  [rdr _]
  (if (thread-bound? #'arg-env)
    (throw (IllegalStateException. "Nested #()s are not allowed")))
  (binding [arg-env (sorted-map)]
    (let [form (read (doto rdr (unread \()) true nil true) ;; this sets bindings
          rargs (rseq arg-env)
          args (if rargs
                 (let [higharg (key (first rargs))]
                   (let [args (loop [i 1 args (transient [])]
                                (if (> i higharg)
                                  (persistent! args)
                                  (recur (inc i) (conj! args (or (get arg-env i)
                                                                 (garg i))))))
                         args (if (arg-env -1)
                                (conj args '& (arg-env -1))
                                args)]
                     args))
                 [])]
      (list 'fn* args form))))
```

 <pre>
tools.reader @ tools.reader-0.7.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:340-359](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.10/src/main/clojure/clojure/tools/reader.clj#L340-L359)</ins>
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
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.10",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [580 591]},
 :extra-sources [{:code "(defn- read-fn\n  [rdr _]\n  (if (thread-bound? #'arg-env)\n    (throw (IllegalStateException. \"Nested #()s are not allowed\")))\n  (binding [arg-env (sorted-map)]\n    (let [form (read (doto rdr (unread \\()) true nil true) ;; this sets bindings\n          rargs (rseq arg-env)\n          args (if rargs\n                 (let [higharg (key (first rargs))]\n                   (let [args (loop [i 1 args (transient [])]\n                                (if (> i higharg)\n                                  (persistent! args)\n                                  (recur (inc i) (conj! args (or (get arg-env i)\n                                                                 (garg i))))))\n                         args (if (arg-env -1)\n                                (conj args '& (arg-env -1))\n                                args)]\n                     args))\n                 [])]\n      (list 'fn* args form))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [340 359]}],
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

