## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientMap

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientMap.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ITransientMap
  (-dissoc! [tcoll key]))
```

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:320-321](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L320-L321)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientMap"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientMap",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientMap",
 :source {:code "(defprotocol ITransientMap\n  (-dissoc! [tcoll key]))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [320 321]},
 :methods [{:name "-dissoc!",
            :signature ["[tcoll key]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientMap",
 :clj-symbol "clojure.lang/ITransientMap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientMap.cljsdoc)
</pre>

