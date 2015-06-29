## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IAssociative

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Associative</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Associative.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IAssociative
  (^boolean -contains-key? [coll k])
  #_(-entry-at [coll k])
  (^clj -assoc [coll k v]))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:256-259](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L256-L259)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAssociative"]))
```

```clj
{:ns "cljs.core",
 :name "IAssociative",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IAssociative",
 :source {:code "(defprotocol IAssociative\n  (^boolean -contains-key? [coll k])\n  #_(-entry-at [coll k])\n  (^clj -assoc [coll k v]))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [256 259]},
 :methods [{:name "-contains-key?",
            :signature ["[coll k]"],
            :docstring nil}
           {:name "-assoc", :signature ["[coll k v]"], :docstring nil}],
 :full-name "cljs.core/IAssociative",
 :clj-symbol "clojure.lang/Associative"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IAssociative.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IAssociative.cljsdoc)
</pre>

