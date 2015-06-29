## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/unique-event-id

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unique-event-id__ event-type)<br>
</samp>

---





Source code:

```clj
(defn unique-event-id [event-type])
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:92](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/clojure/browser/event.cljs#L92)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/unique-event-id"]))
```

```clj
{:ns "clojure.browser.event",
 :name "unique-event-id",
 :type "function",
 :signature ["[event-type]"],
 :source {:code "(defn unique-event-id [event-type])",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [92]},
 :full-name "clojure.browser.event/unique-event-id",
 :full-name-encode "clojure.browser.event_unique-event-id",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_unique-event-id.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_unique-event-id.cljsdoc)
</pre>

