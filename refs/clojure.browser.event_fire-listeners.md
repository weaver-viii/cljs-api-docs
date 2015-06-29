## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/fire-listeners

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__fire-listeners__ obj type capture event)<br>
</samp>

---





Source code:

```clj
(defn fire-listeners
  [obj type capture event])
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:82-83](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/browser/event.cljs#L82-L83)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/fire-listeners"]))
```

```clj
{:ns "clojure.browser.event",
 :name "fire-listeners",
 :type "function",
 :signature ["[obj type capture event]"],
 :source {:code "(defn fire-listeners\n  [obj type capture event])",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [82 83]},
 :full-name "clojure.browser.event/fire-listeners",
 :full-name-encode "clojure.browser.event_fire-listeners",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_fire-listeners.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_fire-listeners.cljsdoc)
</pre>

