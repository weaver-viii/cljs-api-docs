## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IStack

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentStack</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentStack.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IStack
  (-peek [coll])
  (-pop [coll]))
```

 <pre>
clojurescript @ r2014
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:246-248](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L246-L248)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IStack"]))
```

```clj
{:ns "cljs.core",
 :name "IStack",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IStack",
 :source {:code "(defprotocol IStack\n  (-peek [coll])\n  (-pop [coll]))",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/cljs/cljs/core.cljs",
          :lines [246 248]},
 :methods [{:name "-peek", :signature ["[coll]"], :docstring nil}
           {:name "-pop", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IStack",
 :clj-symbol "clojure.lang/IPersistentStack"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IStack.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IStack.cljsdoc)
</pre>

