## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEncodeClojure

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEncodeClojure
  (-js->clj [x options] "Transforms JavaScript values to Clojure"))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7726-7727](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L7726-L7727)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEncodeClojure"]))
```

```clj
{:ns "cljs.core",
 :name "IEncodeClojure",
 :type "protocol",
 :full-name-encode "cljs.core_IEncodeClojure",
 :source {:code "(defprotocol IEncodeClojure\n  (-js->clj [x options] \"Transforms JavaScript values to Clojure\"))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7726 7727]},
 :methods [{:name "-js->clj",
            :signature ["[x options]"],
            :docstring "Transforms JavaScript values to Clojure"}],
 :full-name "cljs.core/IEncodeClojure",
 :history [["+" "0.0-1552"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEncodeClojure.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEncodeClojure.cljsdoc)
</pre>

