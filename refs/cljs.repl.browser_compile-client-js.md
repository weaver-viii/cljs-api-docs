## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/compile-client-js

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__compile-client-js__ opts)<br>
</samp>

---





Source code:

```clj
(defn compile-client-js [opts]
  (cljsc/build '[(ns clojure.browser.repl.client
                   (:require [goog.events :as event]
                             [clojure.browser.repl :as repl]))
                 (defn start [url]
                   (event/listen js/window
                                 "load"
                                 (fn []
                                   (repl/start-evaluator url))))]
               {:optimizations (:optimizations opts)
                :output-dir (:working-dir opts)}))
```

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:193-203](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/repl/browser.clj#L193-L203)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/compile-client-js"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "compile-client-js",
 :type "function",
 :signature ["[opts]"],
 :source {:code "(defn compile-client-js [opts]\n  (cljsc/build '[(ns clojure.browser.repl.client\n                   (:require [goog.events :as event]\n                             [clojure.browser.repl :as repl]))\n                 (defn start [url]\n                   (event/listen js/window\n                                 \"load\"\n                                 (fn []\n                                   (repl/start-evaluator url))))]\n               {:optimizations (:optimizations opts)\n                :output-dir (:working-dir opts)}))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [193 203]},
 :full-name "cljs.repl.browser/compile-client-js",
 :full-name-encode "cljs.repl.browser_compile-client-js",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_compile-client-js.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_compile-client-js.cljsdoc)
</pre>

