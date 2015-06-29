## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/object?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__object?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript object, false otherwise.

---


See Also:

[`cljs.core/array?`](cljs.core_arrayQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean object? [x]
  (cljs.core/object? x))
```

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:91-92](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L91-L92)</ins>
</pre>


---

```clj
(defmacro object? [x]
  (bool-expr (core/list 'js* "~{}.constructor === Object" x)))
```

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:282-283](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/core.clj#L282-L283)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/object?"]))
```

```clj
{:description "Returns true if `x` is a JavaScript object, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "object?",
 :signature ["[x]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :related ["cljs.core/array?"],
 :full-name-encode "cljs.core_objectQMARK",
 :source {:code "(defn ^boolean object? [x]\n  (cljs.core/object? x))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/core.cljs",
          :lines [91 92]},
 :extra-sources ({:code "(defmacro object? [x]\n  (bool-expr (core/list 'js* \"~{}.constructor === Object\" x)))",
                  :repo "clojurescript",
                  :tag "r2120",
                  :filename "src/clj/cljs/core.clj",
                  :lines [282 283]}),
 :full-name "cljs.core/object?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_objectQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_objectQMARK.cljsdoc)
</pre>

