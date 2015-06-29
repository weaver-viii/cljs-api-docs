## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-value

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-value__ e v)<br>
</samp>

---




Source docstring:

```
Set the value property for an element.
```

Source code:

```clj
(defn set-value
  [e v]
  (set-properties e {"value" v}))
```

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:142-145](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/clojure/browser/dom.cljs#L142-L145)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-value"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "set-value",
 :signature ["[e v]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_set-value",
 :source {:code "(defn set-value\n  [e v]\n  (set-properties e {\"value\" v}))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [142 145]},
 :full-name "clojure.browser.dom/set-value",
 :docstring "Set the value property for an element."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_set-value.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_set-value.cljsdoc)
</pre>

