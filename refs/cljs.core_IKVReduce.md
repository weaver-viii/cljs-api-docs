## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IKVReduce

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for associative types that can reduce themselves
  via a function of key and val. Called by cljs.core/reduce-kv.
```

Source code:

```clj
(defprotocol IKVReduce
  "Protocol for associative types that can reduce themselves
  via a function of key and val. Called by cljs.core/reduce-kv."
  (-kv-reduce [coll f init]
    "Reduces an associative collection and returns the result. f should be
     a function that takes three arguments."))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:465-470](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L465-L470)</ins>
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
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IKVReduce",
 :source {:code "(defprotocol IKVReduce\n  \"Protocol for associative types that can reduce themselves\n  via a function of key and val. Called by cljs.core/reduce-kv.\"\n  (-kv-reduce [coll f init]\n    \"Reduces an associative collection and returns the result. f should be\n     a function that takes three arguments.\"))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [465 470]},
 :methods [{:name "-kv-reduce",
            :signature ["[coll f init]"],
            :docstring "Reduces an associative collection and returns the result. f should be\n     a function that takes three arguments."}],
 :full-name "cljs.core/IKVReduce",
 :docstring "Protocol for associative types that can reduce themselves\n  via a function of key and val. Called by cljs.core/reduce-kv."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IKVReduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IKVReduce.cljsdoc)
</pre>

