## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/listen

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__listen__ src type fn)<br>
</samp>
 <samp>
(__listen__ src type fn capture?)<br>
</samp>

---





Source code:

```clj
(defn listen
  ([src type fn]
     (listen src type fn false))
  ([src type fn capture?]
     (events/listen src
                    (get (event-types src) type type)
                    fn
                    capture?)))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:46-53](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/clojure/browser/event.cljs#L46-L53)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/listen"]))
```

```clj
{:ns "clojure.browser.event",
 :name "listen",
 :type "function",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :source {:code "(defn listen\n  ([src type fn]\n     (listen src type fn false))\n  ([src type fn capture?]\n     (events/listen src\n                    (get (event-types src) type type)\n                    fn\n                    capture?)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [46 53]},
 :full-name "clojure.browser.event/listen",
 :full-name-encode "clojure.browser.event_listen",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_listen.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_listen.cljsdoc)
</pre>

