## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/get-value

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-value__ e)<br>
</samp>

---




Source docstring:

```
Get the value of an element.
```

Source code:

```clj
(defn get-value
  [e]
  (.-value (ensure-element e)))
```

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:131-134](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/clojure/browser/dom.cljs#L131-L134)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/get-value"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "get-value",
 :signature ["[e]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_get-value",
 :source {:code "(defn get-value\n  [e]\n  (.-value (ensure-element e)))",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [131 134]},
 :full-name "clojure.browser.dom/get-value",
 :docstring "Get the value of an element."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_get-value.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_get-value.cljsdoc)
</pre>

