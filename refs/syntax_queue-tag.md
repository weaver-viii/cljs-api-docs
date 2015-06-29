## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/queue-tag

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
   'inst  read-inst
   'js    read-js})
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>


---

```clj
(defn read-queue
  [form]
  (when-not (vector? form)
    (throw (RuntimeException. "Queue literal expects a vector for its elements.")))
  (list 'cljs.core/into 'cljs.core.PersistentQueue.EMPTY form))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[tagged_literals.clj:4-8](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/tagged_literals.clj#L4-L8)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/queue-tag"]))
```

```clj
{:ns "syntax",
 :name "queue-tag",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :full-name-encode "syntax_queue-tag",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/tagged_literals.clj",
          :lines [44 48]},
 :extra-sources [{:code "(defn read-queue\n  [form]\n  (when-not (vector? form)\n    (throw (RuntimeException. \"Queue literal expects a vector for its elements.\")))\n  (list 'cljs.core/into 'cljs.core.PersistentQueue.EMPTY form))",
                  :repo "clojurescript",
                  :tag "r3269",
                  :filename "src/main/clojure/cljs/tagged_literals.clj",
                  :lines [4 8]}],
 :syntax-form "#queue []",
 :full-name "syntax/queue-tag"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_queue-tag.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_queue-tag.cljsdoc)
</pre>

