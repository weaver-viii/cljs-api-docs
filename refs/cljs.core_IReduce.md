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





Source docstring:

```
Protocol for seq types that can reduce themselves.
  Called by cljs.core/reduce.
```

Source code:

```clj
(defprotocol IReduce
  "Protocol for seq types that can reduce themselves.
  Called by cljs.core/reduce."
  (-reduce [coll f] [coll f start]
    "f should be a function of 2 arguments. If start is not supplied,
     returns the result of applying f to the first 2 items in coll, then
     applying f to that result and the 3rd item, etc."))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:457-463](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L457-L463)</ins>
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
 :source {:code "(defprotocol IReduce\n  \"Protocol for seq types that can reduce themselves.\n  Called by cljs.core/reduce.\"\n  (-reduce [coll f] [coll f start]\n    \"f should be a function of 2 arguments. If start is not supplied,\n     returns the result of applying f to the first 2 items in coll, then\n     applying f to that result and the 3rd item, etc.\"))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [457 463]},
 :methods [{:name "-reduce",
            :signature ["[coll f]" "[coll f start]"],
            :docstring "f should be a function of 2 arguments. If start is not supplied,\n     returns the result of applying f to the first 2 items in coll, then\n     applying f to that result and the 3rd item, etc."}],
 :full-name "cljs.core/IReduce",
 :clj-symbol "clojure.lang/IReduce",
 :docstring "Protocol for seq types that can reduce themselves.\n  Called by cljs.core/reduce."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IReduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IReduce.cljsdoc)
</pre>

