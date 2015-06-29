## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IDeref

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IDeref</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IDeref.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding dereference functionality to a reference.
```

Source code:

```clj
(defprotocol IDeref
  "Protocol for adding dereference functionality to a reference."
  (-deref [o]
    "Returns the value of the reference o."))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:439-442](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L439-L442)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IDeref"]))
```

```clj
{:ns "cljs.core",
 :name "IDeref",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IDeref",
 :source {:code "(defprotocol IDeref\n  \"Protocol for adding dereference functionality to a reference.\"\n  (-deref [o]\n    \"Returns the value of the reference o.\"))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [439 442]},
 :methods [{:name "-deref",
            :signature ["[o]"],
            :docstring "Returns the value of the reference o."}],
 :full-name "cljs.core/IDeref",
 :clj-symbol "clojure.lang/IDeref",
 :docstring "Protocol for adding dereference functionality to a reference."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IDeref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IDeref.cljsdoc)
</pre>

