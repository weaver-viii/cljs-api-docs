## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/dir

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/dir</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/dir)
</td>
</tr>
</table>

 <samp>
(__dir__ ns)<br>
</samp>

---

Prints a sorted directory of public vars in a namespace `ns`.

---

Example:

```clj
(require 'clojure.set)

(dir clojure.set)
;; Prints:
;;  difference
;;  index
;;  intersection
;;  join
;;  map-invert
;;  project
;;  rename
;;  rename-keys
;;  select
;;  subset?
;;  superset?
;;  union
;;
;;=> nil
```

---

See Also:

[`cljs.repl/find-doc`](cljs.repl_find-doc.md)<br>
[`cljs.repl/apropos`](cljs.repl_apropos.md)<br>

---

Source docstring:

```
Prints a sorted directory of public vars in a namespace
```

Source code:

```clj
(defmacro dir
  [ns]
  `(doseq [sym# (quote ~(sort (keys (ana-api/ns-publics ns))))]
     (println sym#)))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1072-1076](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl.clj#L1072-L1076)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/dir"]))
```

```clj
{:description "Prints a sorted directory of public vars in a namespace `ns`.",
 :ns "cljs.repl",
 :name "dir",
 :signature ["[ns]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/find-doc" "cljs.repl/apropos"],
 :full-name-encode "cljs.repl_dir",
 :source {:code "(defmacro dir\n  [ns]\n  `(doseq [sym# (quote ~(sort (keys (ana-api/ns-publics ns))))]\n     (println sym#)))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl.clj",
          :lines [1072 1076]},
 :examples [{:id "9bf2b0",
             :content "```clj\n(require 'clojure.set)\n\n(dir clojure.set)\n;; Prints:\n;;  difference\n;;  index\n;;  intersection\n;;  join\n;;  map-invert\n;;  project\n;;  rename\n;;  rename-keys\n;;  select\n;;  subset?\n;;  superset?\n;;  union\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/dir",
 :clj-symbol "clojure.repl/dir",
 :docstring "Prints a sorted directory of public vars in a namespace"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_dir.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_dir.cljsdoc)
</pre>

