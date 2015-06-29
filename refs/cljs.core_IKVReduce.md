## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IKVReduce

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IKVReduce
  (-kv-reduce [coll f init]))
```

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:312-313](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L312-L313)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IKVReduce"]))
```

```clj
{:ns "cljs.core",
 :name "IKVReduce",
 :type "protocol",
 :full-name-encode "cljs.core_IKVReduce",
 :source {:code "(defprotocol IKVReduce\n  (-kv-reduce [coll f init]))",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [312 313]},
 :methods [{:name "-kv-reduce",
            :signature ["[coll f init]"],
            :docstring nil}],
 :full-name "cljs.core/IKVReduce",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IKVReduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IKVReduce.cljsdoc)
</pre>

