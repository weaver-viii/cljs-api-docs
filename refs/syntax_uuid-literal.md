## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/uuid-literal

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
   'inst  read-inst
   'js    read-js})
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>


---

```clj
(defn read-uuid
  [form]
  (when-not (string? form)
    (throw (RuntimeException. "UUID literal expects a string as its representation.")))
  (try
    (java.util.UUID/fromString form)
    (catch Throwable e
      (throw (RuntimeException. (.getMessage e))))))
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:10-17](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/tagged_literals.clj#L10-L17)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/uuid-literal"]))
```

```clj
{:ns "syntax",
 :name "uuid-literal",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :full-name-encode "syntax_uuid-literal",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [44 48]},
 :extra-sources [{:code "(defn read-uuid\n  [form]\n  (when-not (string? form)\n    (throw (RuntimeException. \"UUID literal expects a string as its representation.\")))\n  (try\n    (java.util.UUID/fromString form)\n    (catch Throwable e\n      (throw (RuntimeException. (.getMessage e))))))",
                  :repo "clojurescript",
                  :tag "r3165",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [10 17]}],
 :syntax-form "#uuid \"\"",
 :edn-doc "https://github.com/edn-format/edn#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6",
 :full-name "syntax/uuid-literal",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_uuid-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_uuid-literal.cljsdoc)
</pre>

