## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/unlisten-by-key

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unlisten-by-key__ key)<br>
</samp>

---





Source code:

```clj
(defn unlisten-by-key
  [key]
  (goog.events/unlistenByKey key))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:71-73](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/clojure/browser/event.cljs#L71-L73)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/unlisten-by-key"]))
```

```clj
{:ns "clojure.browser.event",
 :name "unlisten-by-key",
 :type "function",
 :signature ["[key]"],
 :source {:code "(defn unlisten-by-key\n  [key]\n  (goog.events/unlistenByKey key))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [71 73]},
 :full-name "clojure.browser.event/unlisten-by-key",
 :full-name-encode "clojure.browser.event_unlisten-by-key",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_unlisten-by-key.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_unlisten-by-key.cljsdoc)
</pre>

