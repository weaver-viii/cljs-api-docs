## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientSet

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientSet.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ITransientSet
  (-disjoin! [tcoll v]))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:260-261](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L260-L261)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientSet"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientSet",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientSet",
 :source {:code "(defprotocol ITransientSet\n  (-disjoin! [tcoll v]))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [260 261]},
 :methods [{:name "-disjoin!",
            :signature ["[tcoll v]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientSet",
 :clj-symbol "clojure.lang/ITransientSet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientSet.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientSet.cljsdoc)
</pre>

