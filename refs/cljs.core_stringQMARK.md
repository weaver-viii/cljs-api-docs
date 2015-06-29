## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/string?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/string?)
</td>
</tr>
</table>

 <samp>
(__string?__ x)<br>
</samp>

---

Returns true if `x` is a string, false otherwise.

---




Source code:

```clj
(defn ^boolean string? [x]
  (goog/isString x))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:97-98](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L97-L98)</ins>
</pre>


---

```clj
(defmacro string? [x]
  (bool-expr (core/list 'js* "typeof ~{} === 'string'" x)))
```

 <pre>
clojurescript @ r2060
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:281-282](https://github.com/clojure/clojurescript/blob/r2060/src/clj/cljs/core.clj#L281-L282)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string?"]))
```

```clj
{:description "Returns true if `x` is a string, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "string?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_stringQMARK",
 :source {:code "(defn ^boolean string? [x]\n  (goog/isString x))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [97 98]},
 :extra-sources ({:code "(defmacro string? [x]\n  (bool-expr (core/list 'js* \"typeof ~{} === 'string'\" x)))",
                  :repo "clojurescript",
                  :tag "r2060",
                  :filename "src/clj/cljs/core.clj",
                  :lines [281 282]}),
 :full-name "cljs.core/string?",
 :clj-symbol "clojure.core/string?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_stringQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_stringQMARK.cljsdoc)
</pre>

