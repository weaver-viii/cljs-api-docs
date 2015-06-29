## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/get-listener

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-listener__ src type listener opt_capt opt_handler)<br>
</samp>

---





Source code:

```clj
(defn get-listener [src type listener opt_capt opt_handler])
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:89](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L89)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/get-listener"]))
```

```clj
{:ns "clojure.browser.event",
 :name "get-listener",
 :type "function",
 :signature ["[src type listener opt_capt opt_handler]"],
 :source {:code "(defn get-listener [src type listener opt_capt opt_handler])",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [89]},
 :full-name "clojure.browser.event/get-listener",
 :full-name-encode "clojure.browser.event_get-listener",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_get-listener.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_get-listener.cljsdoc)
</pre>

