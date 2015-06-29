## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMeta

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IMeta</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IMeta.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IMeta
  (^clj-or-nil -meta [o]))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:314-315](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L314-L315)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMeta"]))
```

```clj
{:ns "cljs.core",
 :name "IMeta",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IMeta",
 :source {:code "(defprotocol IMeta\n  (^clj-or-nil -meta [o]))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [314 315]},
 :methods [{:name "-meta", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/IMeta",
 :clj-symbol "clojure.lang/IMeta"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMeta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMeta.cljsdoc)
</pre>

