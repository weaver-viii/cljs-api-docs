## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/append

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__append__ parent & children)<br>
</samp>

---





Source code:

```clj
(defn append [parent & children]
  (apply gdom/append parent children)
  parent)
```

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:12-14](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/browser/dom.cljs#L12-L14)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/append"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "append",
 :type "function",
 :signature ["[parent & children]"],
 :source {:code "(defn append [parent & children]\n  (apply gdom/append parent children)\n  parent)",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [12 14]},
 :full-name "clojure.browser.dom/append",
 :full-name-encode "clojure.browser.dom_append",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_append.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_append.cljsdoc)
</pre>

