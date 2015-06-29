## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/click-element

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__click-element__ e)<br>
</samp>

---





Source code:

```clj
(defn click-element
  [e]
  (.click (ensure-element e) ()))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:147-149](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/clojure/browser/dom.cljs#L147-L149)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/click-element"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "click-element",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn click-element\n  [e]\n  (.click (ensure-element e) ()))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [147 149]},
 :full-name "clojure.browser.dom/click-element",
 :full-name-encode "clojure.browser.dom_click-element",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_click-element.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_click-element.cljsdoc)
</pre>

