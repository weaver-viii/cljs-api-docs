## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Volatile

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Volatile</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Volatile.java)
</td>
</tr>
</table>

 <samp>
(__Volatile.__ state)<br>
</samp>

---





Source code:

```clj
(deftype Volatile [^:mutable state]
  IVolatile
  (-vreset! [_ new-state]
    (set! state new-state))

  IDeref
  (-deref [_] state))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3898-3904](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L3898-L3904)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Volatile"]))
```

```clj
{:ns "cljs.core",
 :name "Volatile",
 :signature ["[state]"],
 :history [["+" "0.0-2496"]],
 :type "type",
 :full-name-encode "cljs.core_Volatile",
 :source {:code "(deftype Volatile [^:mutable state]\n  IVolatile\n  (-vreset! [_ new-state]\n    (set! state new-state))\n\n  IDeref\n  (-deref [_] state))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3898 3904]},
 :full-name "cljs.core/Volatile",
 :clj-symbol "clojure.lang/Volatile"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Volatile.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Volatile.cljsdoc)
</pre>

