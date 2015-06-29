## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/total-listener-count

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__total-listener-count__)<br>
</samp>

---





Source code:

```clj
(defn total-listener-count []
  (goog.events/getTotalListenerCount))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:85-86](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/browser/event.cljs#L85-L86)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/total-listener-count"]))
```

```clj
{:ns "clojure.browser.event",
 :name "total-listener-count",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn total-listener-count []\n  (goog.events/getTotalListenerCount))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [85 86]},
 :full-name "clojure.browser.event/total-listener-count",
 :full-name-encode "clojure.browser.event_total-listener-count",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_total-listener-count.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_total-listener-count.cljsdoc)
</pre>

