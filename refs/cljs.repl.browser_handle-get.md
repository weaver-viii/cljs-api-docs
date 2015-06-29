## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/handle-get

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__handle-get__ opts conn request)<br>
</samp>

---





Source code:

```clj
(defn handle-get [opts conn request]
  (let [path (:path request)]
    (if (.startsWith path "/repl")
      (send-repl-client-page opts conn request)
      (send-404 conn (:path request)))))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:182-186](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/repl/browser.clj#L182-L186)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/handle-get"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "handle-get",
 :type "function",
 :signature ["[opts conn request]"],
 :source {:code "(defn handle-get [opts conn request]\n  (let [path (:path request)]\n    (if (.startsWith path \"/repl\")\n      (send-repl-client-page opts conn request)\n      (send-404 conn (:path request)))))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [182 186]},
 :full-name "cljs.repl.browser/handle-get",
 :full-name-encode "cljs.repl.browser_handle-get",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_handle-get.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_handle-get.cljsdoc)
</pre>

