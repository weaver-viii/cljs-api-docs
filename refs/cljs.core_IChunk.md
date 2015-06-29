## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunk

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IChunk</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IChunk.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IChunk
  (-drop-first [coll]))
```

 <pre>
clojurescript @ r2014
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:341-342](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L341-L342)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunk"]))
```

```clj
{:ns "cljs.core",
 :name "IChunk",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core_IChunk",
 :source {:code "(defprotocol IChunk\n  (-drop-first [coll]))",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/cljs/cljs/core.cljs",
          :lines [341 342]},
 :methods [{:name "-drop-first",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunk",
 :clj-symbol "clojure.lang/IChunk"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IChunk.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IChunk.cljsdoc)
</pre>

