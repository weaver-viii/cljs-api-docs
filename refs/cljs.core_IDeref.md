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






Source code:

```clj
(defprotocol IDeref
 (-deref [o]))
```

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:279-280](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L279-L280)</ins>
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
 :source {:code "(defprotocol IDeref\n (-deref [o]))",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [279 280]},
 :methods [{:name "-deref", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/IDeref",
 :clj-symbol "clojure.lang/IDeref"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IDeref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IDeref.cljsdoc)
</pre>

