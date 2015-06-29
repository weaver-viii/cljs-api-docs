## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/IEventType

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEventType
  (event-types [this]))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[event.cljs:16-17](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/clojure/browser/event.cljs#L16-L17)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/IEventType"]))
```

```clj
{:ns "clojure.browser.event",
 :name "IEventType",
 :type "protocol",
 :full-name-encode "clojure.browser.event_IEventType",
 :source {:code "(defprotocol IEventType\n  (event-types [this]))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/clojure/browser/event.cljs",
          :lines [16 17]},
 :methods [{:name "event-types",
            :signature ["[this]"],
            :docstring nil}],
 :full-name "clojure.browser.event/IEventType",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_IEventType.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_IEventType.cljsdoc)
</pre>

