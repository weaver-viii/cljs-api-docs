## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IHash

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IHash
  (-hash [o]))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:271-272](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L271-L272)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IHash"]))
```

```clj
{:ns "cljs.core",
 :name "IHash",
 :type "protocol",
 :full-name-encode "cljs.core_IHash",
 :source {:code "(defprotocol IHash\n  (-hash [o]))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [271 272]},
 :methods [{:name "-hash", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/IHash",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IHash.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IHash.cljsdoc)
</pre>

