## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICounted

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Counted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Counted.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ICounted
  (^number -count [coll] "constant time count"))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:247-248](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L247-L248)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICounted"]))
```

```clj
{:ns "cljs.core",
 :name "ICounted",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ICounted",
 :source {:code "(defprotocol ICounted\n  (^number -count [coll] \"constant time count\"))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [247 248]},
 :methods [{:name "-count",
            :signature ["[coll]"],
            :docstring "constant time count"}],
 :full-name "cljs.core/ICounted",
 :clj-symbol "clojure.lang/Counted"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICounted.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICounted.cljsdoc)
</pre>

