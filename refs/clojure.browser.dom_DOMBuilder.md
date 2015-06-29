## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/DOMBuilder

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol DOMBuilder
  (-element [this] [this attrs-or-children] [this attrs children]))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:17-18](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/clojure/browser/dom.cljs#L17-L18)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/DOMBuilder"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "DOMBuilder",
 :type "protocol",
 :full-name-encode "clojure.browser.dom_DOMBuilder",
 :source {:code "(defprotocol DOMBuilder\n  (-element [this] [this attrs-or-children] [this attrs children]))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [17 18]},
 :methods [{:name "-element",
            :signature ["[this]"
                        "[this attrs-or-children]"
                        "[this attrs children]"],
            :docstring nil}],
 :full-name "clojure.browser.dom/DOMBuilder",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_DOMBuilder.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_DOMBuilder.cljsdoc)
</pre>

