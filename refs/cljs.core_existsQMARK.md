## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/exists?

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__exists?__ x)<br>
</samp>

---





Source code:

```clj
(defmacro exists? [x]
  (bool-expr
    (core/list 'js* "typeof ~{} !== 'undefined'"
      (vary-meta x assoc :cljs.analyzer/no-resolve true))))
```

 <pre>
clojurescript @ r2727
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:311-314](https://github.com/clojure/clojurescript/blob/r2727/src/clj/cljs/core.clj#L311-L314)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/exists?"]))
```

```clj
{:ns "cljs.core",
 :name "exists?",
 :type "macro",
 :signature ["[x]"],
 :source {:code "(defmacro exists? [x]\n  (bool-expr\n    (core/list 'js* \"typeof ~{} !== 'undefined'\"\n      (vary-meta x assoc :cljs.analyzer/no-resolve true))))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/clj/cljs/core.clj",
          :lines [311 314]},
 :full-name "cljs.core/exists?",
 :full-name-encode "cljs.core_existsQMARK",
 :history [["+" "0.0-1798"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_existsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_existsQMARK.cljsdoc)
</pre>

