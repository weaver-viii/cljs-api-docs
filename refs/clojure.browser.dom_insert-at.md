## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/insert-at

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__insert-at__ parent child index)<br>
</samp>

---





Source code:

```clj
(defn insert-at [parent child index]
  (gdom/insertChildAt parent child index))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:104-105](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/clojure/browser/dom.cljs#L104-L105)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/insert-at"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "insert-at",
 :type "function",
 :signature ["[parent child index]"],
 :source {:code "(defn insert-at [parent child index]\n  (gdom/insertChildAt parent child index))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [104 105]},
 :full-name "clojure.browser.dom/insert-at",
 :full-name-encode "clojure.browser.dom_insert-at",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_insert-at.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_insert-at.cljsdoc)
</pre>

