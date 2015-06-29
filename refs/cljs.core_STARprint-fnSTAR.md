## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-fn\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Each runtime environment provides a diffenent way to print output.
Whatever function *print-fn* is bound to will be passed any
Strings which should be printed.
```

Source code:

```clj
(def
  ^{:doc "Each runtime environment provides a diffenent way to print output.
  Whatever function *print-fn* is bound to will be passed any
  Strings which should be printed." :dynamic true}
  *print-fn*
  (fn [_]
    (throw (js/Error. "No *print-fn* fn set for evaluation environment"))))
```

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:17-23](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L17-L23)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-fn*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-fn*",
 :docstring "Each runtime environment provides a diffenent way to print output.\nWhatever function *print-fn* is bound to will be passed any\nStrings which should be printed.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:doc \"Each runtime environment provides a diffenent way to print output.\n  Whatever function *print-fn* is bound to will be passed any\n  Strings which should be printed.\" :dynamic true}\n  *print-fn*\n  (fn [_]\n    (throw (js/Error. \"No *print-fn* fn set for evaluation environment\"))))",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/cljs/core.cljs",
          :lines [17 23]},
 :full-name "cljs.core/*print-fn*",
 :full-name-encode "cljs.core_STARprint-fnSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-fnSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-fnSTAR.cljsdoc)
</pre>

