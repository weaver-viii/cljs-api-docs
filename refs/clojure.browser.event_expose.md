## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/expose

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__expose__ e)<br>
</samp>

---





Source code:

```clj
(defn expose [e]
  (goog.events/expose e))
```

 <pre>
clojurescript @ r1877
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:79-80](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/clojure/browser/event.cljs#L79-L80)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/expose"]))
```

```clj
{:ns "clojure.browser.event",
 :name "expose",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn expose [e]\n  (goog.events/expose e))",
          :repo "clojurescript",
          :tag "r1877",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [79 80]},
 :full-name "clojure.browser.event/expose",
 :full-name-encode "clojure.browser.event_expose",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_expose.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_expose.cljsdoc)
</pre>

