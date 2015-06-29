## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/queue-literal

 <table border="1">
<tr>
<td><samp>#queue \[\]</samp></td>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *cljs-data-readers*
  {'queue read-queue
   'uuid  read-uuid
   'inst  read-inst})
```

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:27-30](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/tagged_literals.clj#L27-L30)</ins>
</pre>


---

```clj
(defn read-queue
  [form]
  (assert (vector? form) "Queue literal expects a vector for its elements.")
  (list 'cljs.core/into 'cljs.core.PersistentQueue/EMPTY form))
```

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:4-7](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/tagged_literals.clj#L4-L7)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/queue-literal"]))
```

```clj
{:ns "syntax",
 :name "queue-literal",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :full-name-encode "syntax_queue-literal",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst})",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [27 30]},
 :extra-sources [{:code "(defn read-queue\n  [form]\n  (assert (vector? form) \"Queue literal expects a vector for its elements.\")\n  (list 'cljs.core/into 'cljs.core.PersistentQueue/EMPTY form))",
                  :repo "clojurescript",
                  :tag "r1503",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [4 7]}],
 :syntax-form "#queue []",
 :full-name "syntax/queue-literal"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_queue-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_queue-literal.cljsdoc)
</pre>

