## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISorted

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Sorted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Sorted.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ISorted
  (-sorted-seq [coll ascending?])
  (-sorted-seq-from [coll k ascending?])
  (-entry-key [coll entry])
  (-comparator [coll]))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:289-293](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L289-L293)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISorted"]))
```

```clj
{:ns "cljs.core",
 :name "ISorted",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISorted",
 :source {:code "(defprotocol ISorted\n  (-sorted-seq [coll ascending?])\n  (-sorted-seq-from [coll k ascending?])\n  (-entry-key [coll entry])\n  (-comparator [coll]))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [289 293]},
 :methods [{:name "-sorted-seq",
            :signature ["[coll ascending?]"],
            :docstring nil}
           {:name "-sorted-seq-from",
            :signature ["[coll k ascending?]"],
            :docstring nil}
           {:name "-entry-key",
            :signature ["[coll entry]"],
            :docstring nil}
           {:name "-comparator",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/ISorted",
 :clj-symbol "clojure.lang/Sorted"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISorted.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISorted.cljsdoc)
</pre>

