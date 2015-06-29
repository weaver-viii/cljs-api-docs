## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/log-obj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__log-obj__ obj)<br>
</samp>

---





Source code:

```clj
(defn log-obj [obj]
  (.log js/console obj))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:23-24](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/clojure/browser/dom.cljs#L23-L24)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/log-obj"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "log-obj",
 :type "function",
 :signature ["[obj]"],
 :source {:code "(defn log-obj [obj]\n  (.log js/console obj))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [23 24]},
 :full-name "clojure.browser.dom/log-obj",
 :full-name-encode "clojure.browser.dom_log-obj",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_log-obj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_log-obj.cljsdoc)
</pre>

