## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/wrap-message

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__wrap-message__ t data)<br>
</samp>

---





Source code:

```clj
(defn wrap-message [t data]
  (pr-str {:type t :content data :order (swap! order inc)}))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[repl.cljs:79-80](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/clojure/browser/repl.cljs#L79-L80)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/wrap-message"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "wrap-message",
 :type "function",
 :signature ["[t data]"],
 :source {:code "(defn wrap-message [t data]\n  (pr-str {:type t :content data :order (swap! order inc)}))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [79 80]},
 :full-name "clojure.browser.repl/wrap-message",
 :full-name-encode "clojure.browser.repl_wrap-message",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_wrap-message.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_wrap-message.cljsdoc)
</pre>

