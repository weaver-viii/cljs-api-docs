## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/uuid-tag

 <table border="1">
<tr>
<td><samp>#uuid ""</samp></td>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6)
</td>
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
clojurescript @ r1853
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:27-30](https://github.com/clojure/clojurescript/blob/r1853/src/clj/cljs/tagged_literals.clj#L27-L30)</ins>
</pre>


---

```clj
(defn read-uuid
  [form]
  (assert (string? form) "UUID literal expects a string as its representation.")
  (try
    (let [uuid (java.util.UUID/fromString form)]
      (list (symbol "UUID.") form))
    (catch Throwable e
      (throw (RuntimeException. (.getMessage e))))))
```

 <pre>
clojurescript @ r1853
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:9-16](https://github.com/clojure/clojurescript/blob/r1853/src/clj/cljs/tagged_literals.clj#L9-L16)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/uuid-tag"]))
```

```clj
{:ns "syntax",
 :name "uuid-tag",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :full-name-encode "syntax_uuid-tag",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst})",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [27 30]},
 :extra-sources [{:code "(defn read-uuid\n  [form]\n  (assert (string? form) \"UUID literal expects a string as its representation.\")\n  (try\n    (let [uuid (java.util.UUID/fromString form)]\n      (list (symbol \"UUID.\") form))\n    (catch Throwable e\n      (throw (RuntimeException. (.getMessage e))))))",
                  :repo "clojurescript",
                  :tag "r1853",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [9 16]}],
 :syntax-form "#uuid \"\"",
 :edn-doc "https://github.com/edn-format/edn#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6",
 :full-name "syntax/uuid-tag",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_uuid-tag.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_uuid-tag.cljsdoc)
</pre>

