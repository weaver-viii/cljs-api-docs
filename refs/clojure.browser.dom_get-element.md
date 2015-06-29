## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/get-element

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-element__ id)<br>
</samp>

---





Source code:

```clj
(defn get-element [id]
  (gdom/getElement (name id)))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:98-99](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/clojure/browser/dom.cljs#L98-L99)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/get-element"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "get-element",
 :type "function",
 :signature ["[id]"],
 :source {:code "(defn get-element [id]\n  (gdom/getElement (name id)))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [98 99]},
 :full-name "clojure.browser.dom/get-element",
 :full-name-encode "clojure.browser.dom_get-element",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_get-element.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_get-element.cljsdoc)
</pre>

