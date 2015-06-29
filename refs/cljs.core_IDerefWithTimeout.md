## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IDerefWithTimeout

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IDerefWithTimeout
  (-deref-with-timeout [o msec timeout-val]))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:333-334](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L333-L334)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IDerefWithTimeout"]))
```

```clj
{:ns "cljs.core",
 :name "IDerefWithTimeout",
 :type "protocol",
 :full-name-encode "cljs.core_IDerefWithTimeout",
 :source {:code "(defprotocol IDerefWithTimeout\n  (-deref-with-timeout [o msec timeout-val]))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [333 334]},
 :methods [{:name "-deref-with-timeout",
            :signature ["[o msec timeout-val]"],
            :docstring nil}],
 :full-name "cljs.core/IDerefWithTimeout",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IDerefWithTimeout.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IDerefWithTimeout.cljsdoc)
</pre>

