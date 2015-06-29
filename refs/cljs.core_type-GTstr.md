## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/type->str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1859"><img valign="middle" alt="[+] 0.0-1859" src="https://img.shields.io/badge/+-0.0--1859-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__type->str__ ty)<br>
</samp>

---





Source code:

```clj
(defn type->str [ty]
  (if-let [s (.-cljs$lang$ctorStr ty)]
    s
    (str ty)))
```

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:118-121](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L118-L121)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/type->str"]))
```

```clj
{:ns "cljs.core",
 :name "type->str",
 :type "function",
 :signature ["[ty]"],
 :source {:code "(defn type->str [ty]\n  (if-let [s (.-cljs$lang$ctorStr ty)]\n    s\n    (str ty)))",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/cljs/core.cljs",
          :lines [118 121]},
 :full-name "cljs.core/type->str",
 :full-name-encode "cljs.core_type-GTstr",
 :history [["+" "0.0-1859"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_type-GTstr.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_type-GTstr.cljsdoc)
</pre>

