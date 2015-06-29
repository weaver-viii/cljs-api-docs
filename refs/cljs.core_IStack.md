## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IStack

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentStack</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentStack.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for collections to provide access to their items as stacks. The top
  of the stack should be accessed in the most efficient way for the different
  data structures.
```

Source code:

```clj
(defprotocol IStack
  "Protocol for collections to provide access to their items as stacks. The top
  of the stack should be accessed in the most efficient way for the different
  data structures."
  (-peek [coll]
    "Returns the item from the top of the stack. Is used by cljs.core/peek.")
  (^clj -pop [coll]
    "Returns a new stack without the item on top of the stack. Is used
     by cljs.core/pop."))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:424-432](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L424-L432)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IStack"]))
```

```clj
{:ns "cljs.core",
 :name "IStack",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IStack",
 :source {:code "(defprotocol IStack\n  \"Protocol for collections to provide access to their items as stacks. The top\n  of the stack should be accessed in the most efficient way for the different\n  data structures.\"\n  (-peek [coll]\n    \"Returns the item from the top of the stack. Is used by cljs.core/peek.\")\n  (^clj -pop [coll]\n    \"Returns a new stack without the item on top of the stack. Is used\n     by cljs.core/pop.\"))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [424 432]},
 :methods [{:name "-peek",
            :signature ["[coll]"],
            :docstring "Returns the item from the top of the stack. Is used by cljs.core/peek."}
           {:name "-pop",
            :signature ["[coll]"],
            :docstring "Returns a new stack without the item on top of the stack. Is used\n     by cljs.core/pop."}],
 :full-name "cljs.core/IStack",
 :clj-symbol "clojure.lang/IPersistentStack",
 :docstring "Protocol for collections to provide access to their items as stacks. The top\n  of the stack should be accessed in the most efficient way for the different\n  data structures."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IStack.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IStack.cljsdoc)
</pre>

