## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISwap

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol ISwap
  (-swap! [o f] [o f a] [o f a b] [o f a b xs]))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:419-420](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L419-L420)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISwap"]))
```

```clj
{:ns "cljs.core",
 :name "ISwap",
 :type "protocol",
 :full-name-encode "cljs.core_ISwap",
 :source {:code "(defprotocol ISwap\n  (-swap! [o f] [o f a] [o f a b] [o f a b xs]))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [419 420]},
 :methods [{:name "-swap!",
            :signature ["[o f]" "[o f a]" "[o f a b]" "[o f a b xs]"],
            :docstring nil}],
 :full-name "cljs.core/ISwap",
 :history [["+" "0.0-2173"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISwap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISwap.cljsdoc)
</pre>

