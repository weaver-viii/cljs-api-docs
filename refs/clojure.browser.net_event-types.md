## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/event-types

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def event-types
  (into {}
        (map
         (fn [[k v]]
           [(keyword (.toLowerCase k))
            v])
         (merge
          (js->clj EventType)))))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:21-28](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/clojure/browser/net.cljs#L21-L28)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/event-types"]))
```

```clj
{:ns "clojure.browser.net",
 :name "event-types",
 :type "var",
 :source {:code "(def event-types\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (.toLowerCase k))\n            v])\n         (merge\n          (js->clj EventType)))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [21 28]},
 :full-name "clojure.browser.net/event-types",
 :full-name-encode "clojure.browser.net_event-types",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_event-types.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_event-types.cljsdoc)
</pre>

