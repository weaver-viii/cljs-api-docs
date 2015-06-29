## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/ensure-element

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ensure-element__ e)<br>
</samp>

---




Source docstring:

```
Coerce the argument to a dom element if possible.
```

Source code:

```clj
(defn ensure-element
  [e]
  (cond (keyword? e) (get-element e)
        (string? e) (html->dom e)
        :else e))
```

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:107-112](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/clojure/browser/dom.cljs#L107-L112)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/ensure-element"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "ensure-element",
 :signature ["[e]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_ensure-element",
 :source {:code "(defn ensure-element\n  [e]\n  (cond (keyword? e) (get-element e)\n        (string? e) (html->dom e)\n        :else e))",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [107 112]},
 :full-name "clojure.browser.dom/ensure-element",
 :docstring "Coerce the argument to a dom element if possible."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_ensure-element.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_ensure-element.cljsdoc)
</pre>

