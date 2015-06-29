## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/dispatch-event

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-event__ src event)<br>
</samp>

---





Source code:

```clj
(defn dispatch-event
  [src event]
  (goog.events/dispatchEvent src event))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:75-77](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/browser/event.cljs#L75-L77)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/dispatch-event"]))
```

```clj
{:ns "clojure.browser.event",
 :name "dispatch-event",
 :type "function",
 :signature ["[src event]"],
 :source {:code "(defn dispatch-event\n  [src event]\n  (goog.events/dispatchEvent src event))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [75 77]},
 :full-name "clojure.browser.event/dispatch-event",
 :full-name-encode "clojure.browser.event_dispatch-event",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_dispatch-event.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_dispatch-event.cljsdoc)
</pre>

