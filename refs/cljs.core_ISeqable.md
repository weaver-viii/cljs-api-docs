## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISeqable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Seqable</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Seqable.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding the ability to a type to be transformed into a sequence.
```

Source code:

```clj
(defprotocol ISeqable
  "Protocol for adding the ability to a type to be transformed into a sequence."
  (^clj-or-nil -seq [o]
    "Returns a seq of o, or nil if o is empty."))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:482-485](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L482-L485)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeqable"]))
```

```clj
{:ns "cljs.core",
 :name "ISeqable",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISeqable",
 :source {:code "(defprotocol ISeqable\n  \"Protocol for adding the ability to a type to be transformed into a sequence.\"\n  (^clj-or-nil -seq [o]\n    \"Returns a seq of o, or nil if o is empty.\"))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [482 485]},
 :methods [{:name "-seq",
            :signature ["[o]"],
            :docstring "Returns a seq of o, or nil if o is empty."}],
 :full-name "cljs.core/ISeqable",
 :clj-symbol "clojure.lang/Seqable",
 :docstring "Protocol for adding the ability to a type to be transformed into a sequence."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISeqable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISeqable.cljsdoc)
</pre>

