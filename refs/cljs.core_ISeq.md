## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISeq

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ISeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ISeq.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for collections to provide access to their items as sequences.
```

Source code:

```clj
(defprotocol ISeq
  "Protocol for collections to provide access to their items as sequences."
  (-first [coll]
    "Returns the first item in the collection coll. Used by cljs.core/first.")
  (^clj -rest [coll]
    "Returns a new collection of coll without the first item. It should
     always return a seq, e.g.
     (rest []) => ()
     (rest nil) => ()"))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:373-381](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L373-L381)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeq"]))
```

```clj
{:ns "cljs.core",
 :name "ISeq",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISeq",
 :source {:code "(defprotocol ISeq\n  \"Protocol for collections to provide access to their items as sequences.\"\n  (-first [coll]\n    \"Returns the first item in the collection coll. Used by cljs.core/first.\")\n  (^clj -rest [coll]\n    \"Returns a new collection of coll without the first item. It should\n     always return a seq, e.g.\n     (rest []) => ()\n     (rest nil) => ()\"))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [373 381]},
 :methods [{:name "-first",
            :signature ["[coll]"],
            :docstring "Returns the first item in the collection coll. Used by cljs.core/first."}
           {:name "-rest",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first item. It should\n     always return a seq, e.g.\n     (rest []) => ()\n     (rest nil) => ()"}],
 :full-name "cljs.core/ISeq",
 :clj-symbol "clojure.lang/ISeq",
 :docstring "Protocol for collections to provide access to their items as sequences."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISeq.cljsdoc)
</pre>

