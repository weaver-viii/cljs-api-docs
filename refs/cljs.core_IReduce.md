## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IReduce

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IReduce</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IReduce.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IReduce
  (-reduce [coll f] [coll f start]))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:262-263](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L262-L263)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IReduce"]))
```

```clj
{:ns "cljs.core",
 :name "IReduce",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IReduce",
 :source {:code "(defprotocol IReduce\n  (-reduce [coll f] [coll f start]))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [262 263]},
 :methods [{:name "-reduce",
            :signature ["[coll f]" "[coll f start]"],
            :docstring nil}],
 :full-name "cljs.core/IReduce",
 :clj-symbol "clojure.lang/IReduce"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IReduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IReduce.cljsdoc)
</pre>

