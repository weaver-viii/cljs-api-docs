## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~clojure.browser.event/EventType~~

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[×] 0.0-2301" src="https://img.shields.io/badge/×-0.0--2301-red.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol EventType
  (event-types [this]))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:17-18](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/clojure/browser/event.cljs#L17-L18)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/EventType"]))
```

```clj
{:ns "clojure.browser.event",
 :name "EventType",
 :history [["+" "0.0-927"] ["-" "0.0-2301"]],
 :type "protocol",
 :full-name-encode "clojure.browser.event_EventType",
 :source {:code "(defprotocol EventType\n  (event-types [this]))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [17 18]},
 :methods [{:name "event-types",
            :signature ["[this]"],
            :docstring nil}],
 :full-name "clojure.browser.event/EventType",
 :removed {:in "0.0-2301", :last-seen "0.0-2280"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_EventType.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_EventType.cljsdoc)
</pre>

