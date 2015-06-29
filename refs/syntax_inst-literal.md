## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/inst-literal

 <table border="1">
<tr>
<td><samp>#inst ""</samp></td>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#inst-rfc-3339-format)
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
clojurescript @ r2758
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>


---

```clj
(defn read-inst
  [form]
  (when-not (string? form)
    (throw (RuntimeException. "Instance literal expects a string for its timestamp.")))
  (try
    (inst/read-instant-date form)
    (catch Throwable e
      (throw (RuntimeException. (.getMessage e))))))
```

 <pre>
clojurescript @ r2758
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:19-26](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/tagged_literals.clj#L19-L26)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/inst-literal"]))
```

```clj
{:ns "syntax",
 :name "inst-literal",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :full-name-encode "syntax_inst-literal",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [44 48]},
 :extra-sources [{:code "(defn read-inst\n  [form]\n  (when-not (string? form)\n    (throw (RuntimeException. \"Instance literal expects a string for its timestamp.\")))\n  (try\n    (inst/read-instant-date form)\n    (catch Throwable e\n      (throw (RuntimeException. (.getMessage e))))))",
                  :repo "clojurescript",
                  :tag "r2758",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [19 26]}],
 :syntax-form "#inst \"\"",
 :edn-doc "https://github.com/edn-format/edn#inst-rfc-3339-format",
 :full-name "syntax/inst-literal",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_inst-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_inst-literal.cljsdoc)
</pre>

