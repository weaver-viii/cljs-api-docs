## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/has-listener

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__has-listener__ obj opt_type opt_capture)<br>
</samp>

---





Source code:

```clj
(defn has-listener [obj opt_type opt_capture])
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:94](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/clojure/browser/event.cljs#L94)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/has-listener"]))
```

```clj
{:ns "clojure.browser.event",
 :name "has-listener",
 :type "function",
 :signature ["[obj opt_type opt_capture]"],
 :source {:code "(defn has-listener [obj opt_type opt_capture])",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [94]},
 :full-name "clojure.browser.event/has-listener",
 :full-name-encode "clojure.browser.event_has-listener",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.event_has-listener.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event_has-listener.cljsdoc)
</pre>

