## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/undefined?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__undefined?__ x)<br>
</samp>

---




Source docstring:

```
Returns true if x identical to the JavaScript undefined value.
```

Source code:

```clj
(defn ^boolean undefined?
  [x]
  (cljs.core/undefined? x))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1850-1853](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L1850-L1853)</ins>
</pre>


---

```clj
(defmacro undefined?
  [x]
  (bool-expr (core/list 'js* "(void 0 === ~{})" x)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:381-384](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L381-L384)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/undefined?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "undefined?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_undefinedQMARK",
 :source {:code "(defn ^boolean undefined?\n  [x]\n  (cljs.core/undefined? x))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1850 1853]},
 :extra-sources ({:code "(defmacro undefined?\n  [x]\n  (bool-expr (core/list 'js* \"(void 0 === ~{})\" x)))",
                  :repo "clojurescript",
                  :tag "r3264",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [381 384]}),
 :full-name "cljs.core/undefined?",
 :docstring "Returns true if x identical to the JavaScript undefined value."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_undefinedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_undefinedQMARK.cljsdoc)
</pre>

