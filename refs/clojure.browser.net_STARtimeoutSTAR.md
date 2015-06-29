## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/\*timeout\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def *timeout* 10000)
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:21](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/clojure/browser/net.cljs#L21)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/*timeout*"]))
```

```clj
{:ns "clojure.browser.net",
 :name "*timeout*",
 :type "var",
 :source {:code "(def *timeout* 10000)",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [21]},
 :full-name "clojure.browser.net/*timeout*",
 :full-name-encode "clojure.browser.net_STARtimeoutSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_STARtimeoutSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_STARtimeoutSTAR.cljsdoc)
</pre>

