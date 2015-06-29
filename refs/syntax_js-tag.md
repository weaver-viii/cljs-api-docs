## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/js-tag

 <table border="1">
<tr>
<td><samp>#js {}</samp></td><td><samp>#js \[\]</samp></td>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
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
clojurescript @ r2173
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r2173/src/clj/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>


---

```clj
(defn read-js
  [form]
  (when-not (or (vector? form) (map? form))
    (throw (RuntimeException. "JavaScript literal must use map or vector notation")))
  (when-not (or (not (map? form))
                (every? valid-js-literal-key? (keys form)))
    (throw (RuntimeException. "JavaScript literal keys must be strings or unqualified keywords")))
  (JSValue. form))
```

 <pre>
clojurescript @ r2173
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:35-42](https://github.com/clojure/clojurescript/blob/r2173/src/clj/cljs/tagged_literals.clj#L35-L42)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/js-tag"]))
```

```clj
{:ns "syntax",
 :name "js-tag",
 :history [["+" "0.0-2120"]],
 :type "tagged literal",
 :full-name-encode "syntax_js-tag",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [44 48]},
 :extra-sources [{:code "(defn read-js\n  [form]\n  (when-not (or (vector? form) (map? form))\n    (throw (RuntimeException. \"JavaScript literal must use map or vector notation\")))\n  (when-not (or (not (map? form))\n                (every? valid-js-literal-key? (keys form)))\n    (throw (RuntimeException. \"JavaScript literal keys must be strings or unqualified keywords\")))\n  (JSValue. form))",
                  :repo "clojurescript",
                  :tag "r2173",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [35 42]}],
 :syntax-form ["#js {}" "#js []"],
 :full-name "syntax/js-tag"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_js-tag.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_js-tag.cljsdoc)
</pre>

