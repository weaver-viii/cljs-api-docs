## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWithMeta

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding metadata to an object.
```

Source code:

```clj
(defprotocol IWithMeta
  "Protocol for adding metadata to an object."
  (^clj -with-meta [o meta]
    "Returns a new object with value of o and metadata meta added to it."))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:452-455](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L452-L455)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWithMeta"]))
```

```clj
{:ns "cljs.core",
 :name "IWithMeta",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IWithMeta",
 :source {:code "(defprotocol IWithMeta\n  \"Protocol for adding metadata to an object.\"\n  (^clj -with-meta [o meta]\n    \"Returns a new object with value of o and metadata meta added to it.\"))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [452 455]},
 :methods [{:name "-with-meta",
            :signature ["[o meta]"],
            :docstring "Returns a new object with value of o and metadata meta added to it."}],
 :full-name "cljs.core/IWithMeta",
 :docstring "Protocol for adding metadata to an object."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IWithMeta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IWithMeta.cljsdoc)
</pre>

