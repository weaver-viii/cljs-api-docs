## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMapEntry

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IMapEntry</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IMapEntry.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IMapEntry
  (-key [coll])
  (-val [coll]))
```

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:265-267](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L265-L267)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMapEntry"]))
```

```clj
{:ns "cljs.core",
 :name "IMapEntry",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IMapEntry",
 :source {:code "(defprotocol IMapEntry\n  (-key [coll])\n  (-val [coll]))",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [265 267]},
 :methods [{:name "-key", :signature ["[coll]"], :docstring nil}
           {:name "-val", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IMapEntry",
 :clj-symbol "clojure.lang/IMapEntry"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMapEntry.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMapEntry.cljsdoc)
</pre>

