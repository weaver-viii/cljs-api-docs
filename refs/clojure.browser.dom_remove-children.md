## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/remove-children

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__remove-children__ id)<br>
</samp>

---




Source docstring:

```
Remove all children from the element with the passed id.
```

Source code:

```clj
(defn remove-children
  [id]
  (let [parent (gdom/getElement (name id))]
    (do (gdom/removeChildren parent))))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:92-96](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/clojure/browser/dom.cljs#L92-L96)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/remove-children"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "remove-children",
 :signature ["[id]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_remove-children",
 :source {:code "(defn remove-children\n  [id]\n  (let [parent (gdom/getElement (name id))]\n    (do (gdom/removeChildren parent))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [92 96]},
 :full-name "clojure.browser.dom/remove-children",
 :docstring "Remove all children from the element with the passed id."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_remove-children.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_remove-children.cljsdoc)
</pre>

