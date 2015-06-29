## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Keyword

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Keyword</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Keyword.java)
</td>
</tr>
</table>

 <samp>
(__Keyword.__ k)<br>
</samp>

---





Source code:

```clj
(deftype Keyword [k]
  IFn
  (invoke [_ coll]
    (when-not (nil? coll)
      (let [strobj (.-strobj coll)]
        (if (nil? strobj)
          (-lookup coll k nil)
          (aget strobj k)))))
  (invoke [_ coll not-found]
    (if (nil? coll)
      not-found
      (-lookup coll k not-found))))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1755-1766](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1755-L1766)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Keyword"]))
```

```clj
{:ns "cljs.core",
 :name "Keyword",
 :signature ["[k]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_Keyword",
 :source {:code "(deftype Keyword [k]\n  IFn\n  (invoke [_ coll]\n    (when-not (nil? coll)\n      (let [strobj (.-strobj coll)]\n        (if (nil? strobj)\n          (-lookup coll k nil)\n          (aget strobj k)))))\n  (invoke [_ coll not-found]\n    (if (nil? coll)\n      not-found\n      (-lookup coll k not-found))))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1755 1766]},
 :full-name "cljs.core/Keyword",
 :clj-symbol "clojure.lang/Keyword"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Keyword.cljsdoc)
</pre>
