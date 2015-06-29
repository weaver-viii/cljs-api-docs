## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/log

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__log__ & args)<br>
</samp>

---





Source code:

```clj
(defn log [& args]
  (.log js/console (apply pr-str args)))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:20-21](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/clojure/browser/dom.cljs#L20-L21)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/log"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "log",
 :type "function",
 :signature ["[& args]"],
 :source {:code "(defn log [& args]\n  (.log js/console (apply pr-str args)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [20 21]},
 :full-name "clojure.browser.dom/log",
 :full-name-encode "clojure.browser.dom_log",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_log.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_log.cljsdoc)
</pre>

