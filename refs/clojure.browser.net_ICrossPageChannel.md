## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/ICrossPageChannel

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol ICrossPageChannel
  (register-service [this service-name fn] [this service-name fn encode-json?]))
```

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:88-89](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/clojure/browser/net.cljs#L88-L89)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/ICrossPageChannel"]))
```

```clj
{:ns "clojure.browser.net",
 :name "ICrossPageChannel",
 :type "protocol",
 :full-name-encode "clojure.browser.net_ICrossPageChannel",
 :source {:code "(defprotocol ICrossPageChannel\n  (register-service [this service-name fn] [this service-name fn encode-json?]))",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [88 89]},
 :methods [{:name "register-service",
            :signature ["[this service-name fn]"
                        "[this service-name fn encode-json?]"],
            :docstring nil}],
 :full-name "clojure.browser.net/ICrossPageChannel",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_ICrossPageChannel.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_ICrossPageChannel.cljsdoc)
</pre>

