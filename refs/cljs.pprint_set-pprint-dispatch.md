## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/set-pprint-dispatch

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/set-pprint-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/set-pprint-dispatch)
</td>
</tr>
</table>

 <samp>
(__set-pprint-dispatch__ function)<br>
</samp>

---





Source code:

```clj
(defn set-pprint-dispatch
  [function]
  (set! *print-pprint-dispatch* function)
  nil)
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:825-828](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L825-L828)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/set-pprint-dispatch"]))
```

```clj
{:ns "cljs.pprint",
 :name "set-pprint-dispatch",
 :signature ["[function]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_set-pprint-dispatch",
 :source {:code "(defn set-pprint-dispatch\n  [function]\n  (set! *print-pprint-dispatch* function)\n  nil)",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [825 828]},
 :full-name "cljs.pprint/set-pprint-dispatch",
 :clj-symbol "clojure.pprint/set-pprint-dispatch"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_set-pprint-dispatch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_set-pprint-dispatch.cljsdoc)
</pre>

