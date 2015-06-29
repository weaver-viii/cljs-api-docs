## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/unlisten

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unlisten__ src type fn)<br>
</samp>
 <samp>
(__unlisten__ src type fn capture?)<br>
</samp>

---





Source code:

```clj
(defn unlisten
  ([src type fn]
     (unlisten src type fn false))
  ([src type fn capture?]
     (events/unlisten src
                      (get (event-types src) type type)
                      fn
                      capture?)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[event.cljs:64-71](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/clojure/browser/event.cljs#L64-L71)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/unlisten"]))
```

```clj
{:ns "clojure.browser.event",
 :name "unlisten",
 :type "function",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :source {:code "(defn unlisten\n  ([src type fn]\n     (unlisten src type fn false))\n  ([src type fn capture?]\n     (events/unlisten src\n                      (get (event-types src) type type)\n                      fn\n                      capture?)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/clojure/browser/event.cljs",
          :lines [64 71]},
 :full-name "clojure.browser.event/unlisten",
 :full-name-encode "clojure.browser.event_unlisten",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_unlisten.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_unlisten.cljsdoc)
</pre>

