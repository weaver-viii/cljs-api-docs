## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-properties

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-properties__ e m)<br>
</samp>

---




Source docstring:

```
Set properties on an element
```

Source code:

```clj
(defn set-properties
  [e m]
  (gdom/setProperties (ensure-element e)
                      (apply gobject/create (interleave (keys m) (vals m)))))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:136-140](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/clojure/browser/dom.cljs#L136-L140)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-properties"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "set-properties",
 :signature ["[e m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_set-properties",
 :source {:code "(defn set-properties\n  [e m]\n  (gdom/setProperties (ensure-element e)\n                      (apply gobject/create (interleave (keys m) (vals m)))))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [136 140]},
 :full-name "clojure.browser.dom/set-properties",
 :docstring "Set properties on an element"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_set-properties.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_set-properties.cljsdoc)
</pre>

