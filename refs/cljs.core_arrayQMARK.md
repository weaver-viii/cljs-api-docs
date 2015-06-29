## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript array, false otherwise.

---

Example:

```clj
(array? #js [1 2 3])
;;=> true

(array? [1 2 3])
;;=> false

(array? "hi")
;;=> false
```

---

See Also:

[`cljs.core/object?`](cljs.core_objectQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean array? [x]
  (cljs.core/array? x))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:87-88](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L87-L88)</ins>
</pre>


---

```clj
(defmacro array? [x]
  (bool-expr (core/list 'js* "~{} instanceof Array" x)))
```

 <pre>
clojurescript @ r2060
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:278-279](https://github.com/clojure/clojurescript/blob/r2060/src/clj/cljs/core.clj#L278-L279)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array?"]))
```

```clj
{:description "Returns true if `x` is a JavaScript array, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "array?",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :related ["cljs.core/object?"],
 :full-name-encode "cljs.core_arrayQMARK",
 :source {:code "(defn ^boolean array? [x]\n  (cljs.core/array? x))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [87 88]},
 :extra-sources ({:code "(defmacro array? [x]\n  (bool-expr (core/list 'js* \"~{} instanceof Array\" x)))",
                  :repo "clojurescript",
                  :tag "r2060",
                  :filename "src/clj/cljs/core.clj",
                  :lines [278 279]}),
 :examples [{:id "39913c",
             :content "```clj\n(array? #js [1 2 3])\n;;=> true\n\n(array? [1 2 3])\n;;=> false\n\n(array? \"hi\")\n;;=> false\n```"}],
 :full-name "cljs.core/array?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_arrayQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_arrayQMARK.cljsdoc)
</pre>

