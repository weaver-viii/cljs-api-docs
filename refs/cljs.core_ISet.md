## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISet

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentSet.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ISet
  (^clj -disjoin [coll v]))
```

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:269-270](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L269-L270)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISet"]))
```

```clj
{:ns "cljs.core",
 :name "ISet",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISet",
 :source {:code "(defprotocol ISet\n  (^clj -disjoin [coll v]))",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [269 270]},
 :methods [{:name "-disjoin", :signature ["[coll v]"], :docstring nil}],
 :full-name "cljs.core/ISet",
 :clj-symbol "clojure.lang/IPersistentSet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISet.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISet.cljsdoc)
</pre>

