## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol ICollection
  (^clj -conj [coll o]))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:264-265](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L264-L265)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICollection"]))
```

```clj
{:ns "cljs.core",
 :name "ICollection",
 :type "protocol",
 :full-name-encode "cljs.core_ICollection",
 :source {:code "(defprotocol ICollection\n  (^clj -conj [coll o]))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [264 265]},
 :methods [{:name "-conj", :signature ["[coll o]"], :docstring nil}],
 :full-name "cljs.core/ICollection",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICollection.cljsdoc)
</pre>

