## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientCollection.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ITransientCollection
  (^clj -conj! [tcoll val])
  (^clj -persistent! [tcoll]))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:380-382](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L380-L382)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientCollection"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientCollection",
 :source {:code "(defprotocol ITransientCollection\n  (^clj -conj! [tcoll val])\n  (^clj -persistent! [tcoll]))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [380 382]},
 :methods [{:name "-conj!",
            :signature ["[tcoll val]"],
            :docstring nil}
           {:name "-persistent!",
            :signature ["[tcoll]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientCollection",
 :clj-symbol "clojure.lang/ITransientCollection"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientCollection.cljsdoc)
</pre>

