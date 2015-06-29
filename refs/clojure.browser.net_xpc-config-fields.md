## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xpc-config-fields

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def xpc-config-fields
  (into {}
        (map
         (fn [[k v]]
           [(keyword (.toLowerCase k))
            v])
         (js->clj CfgFields))))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:73-79](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/clojure/browser/net.cljs#L73-L79)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/xpc-config-fields"]))
```

```clj
{:ns "clojure.browser.net",
 :name "xpc-config-fields",
 :type "var",
 :source {:code "(def xpc-config-fields\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (.toLowerCase k))\n            v])\n         (js->clj CfgFields))))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [73 79]},
 :full-name "clojure.browser.net/xpc-config-fields",
 :full-name-encode "clojure.browser.net_xpc-config-fields",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_xpc-config-fields.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_xpc-config-fields.cljsdoc)
</pre>

