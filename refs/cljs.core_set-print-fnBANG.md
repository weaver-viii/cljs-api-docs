## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set-print-fn!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-print-fn!__ f)<br>
</samp>

---




Source docstring:

```
Set *print-fn* to f.
```

Source code:

```clj
(defn set-print-fn!
  [f] (set! *print-fn* f))
```

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:25-27](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L25-L27)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set-print-fn!"]))
```

```clj
{:ns "cljs.core",
 :name "set-print-fn!",
 :signature ["[f]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_set-print-fnBANG",
 :source {:code "(defn set-print-fn!\n  [f] (set! *print-fn* f))",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/cljs/core.cljs",
          :lines [25 27]},
 :full-name "cljs.core/set-print-fn!",
 :docstring "Set *print-fn* to f."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_set-print-fnBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_set-print-fnBANG.cljsdoc)
</pre>

