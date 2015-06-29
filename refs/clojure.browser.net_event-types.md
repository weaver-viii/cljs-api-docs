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
           [(keyword (. k (toLowerCase)))
            v])
         (merge
          (js->clj goog.net.EventType)))))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:23-30](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/clojure/browser/net.cljs#L23-L30)</ins>
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
 :source {:code "(def event-types\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (. k (toLowerCase)))\n            v])\n         (merge\n          (js->clj goog.net.EventType)))))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [23 30]},
 :full-name "clojure.browser.net/event-types",
 :full-name-encode "clojure.browser.net_event-types",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_event-types.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_event-types.cljsdoc)
</pre>

