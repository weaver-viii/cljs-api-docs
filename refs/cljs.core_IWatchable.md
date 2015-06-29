## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWatchable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IWatchable
  (-notify-watches [this oldval newval])
  (-add-watch [this key f])
  (-remove-watch [this key]))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:238-241](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L238-L241)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWatchable"]))
```

```clj
{:ns "cljs.core",
 :name "IWatchable",
 :type "protocol",
 :full-name-encode "cljs.core_IWatchable",
 :source {:code "(defprotocol IWatchable\n  (-notify-watches [this oldval newval])\n  (-add-watch [this key f])\n  (-remove-watch [this key]))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [238 241]},
 :methods [{:name "-notify-watches",
            :signature ["[this oldval newval]"],
            :docstring nil}
           {:name "-add-watch",
            :signature ["[this key f]"],
            :docstring nil}
           {:name "-remove-watch",
            :signature ["[this key]"],
            :docstring nil}],
 :full-name "cljs.core/IWatchable",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IWatchable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IWatchable.cljsdoc)
</pre>
