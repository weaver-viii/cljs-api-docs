## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEditableCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IEditableCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IEditableCollection.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IEditableCollection
  (-as-transient [coll]))
```

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:249-250](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L249-L250)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEditableCollection"]))
```

```clj
{:ns "cljs.core",
 :name "IEditableCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IEditableCollection",
 :source {:code "(defprotocol IEditableCollection\n  (-as-transient [coll]))",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/cljs/core.cljs",
          :lines [249 250]},
 :methods [{:name "-as-transient",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IEditableCollection",
 :clj-symbol "clojure.lang/IEditableCollection"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEditableCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEditableCollection.cljsdoc)
</pre>

