## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IIndexed

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Indexed</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Indexed.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IIndexed
  (-nth [coll n] [coll n not-found]))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:241-242](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L241-L242)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIndexed"]))
```

```clj
{:ns "cljs.core",
 :name "IIndexed",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IIndexed",
 :source {:code "(defprotocol IIndexed\n  (-nth [coll n] [coll n not-found]))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [241 242]},
 :methods [{:name "-nth",
            :signature ["[coll n]" "[coll n not-found]"],
            :docstring nil}],
 :full-name "cljs.core/IIndexed",
 :clj-symbol "clojure.lang/Indexed"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IIndexed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IIndexed.cljsdoc)
</pre>

