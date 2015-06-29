## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/IConnection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IConnection
  (connect
    [this]
    [this opt1]
    [this opt1 opt2]
    [this opt1 opt2 opt3])
  (transmit
    [this opt]
    [this opt opt2]
    [this opt opt2 opt3]
    [this opt opt2 opt3 opt4]
    [this opt opt2 opt3 opt4 opt5])
  (close [this]))
```

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:30-42](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/clojure/browser/net.cljs#L30-L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/IConnection"]))
```

```clj
{:ns "clojure.browser.net",
 :name "IConnection",
 :type "protocol",
 :full-name-encode "clojure.browser.net_IConnection",
 :source {:code "(defprotocol IConnection\n  (connect\n    [this]\n    [this opt1]\n    [this opt1 opt2]\n    [this opt1 opt2 opt3])\n  (transmit\n    [this opt]\n    [this opt opt2]\n    [this opt opt2 opt3]\n    [this opt opt2 opt3 opt4]\n    [this opt opt2 opt3 opt4 opt5])\n  (close [this]))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [30 42]},
 :methods [{:name "connect",
            :signature ["[this]"
                        "[this opt1]"
                        "[this opt1 opt2]"
                        "[this opt1 opt2 opt3]"],
            :docstring nil}
           {:name "transmit",
            :signature ["[this opt]"
                        "[this opt opt2]"
                        "[this opt opt2 opt3]"
                        "[this opt opt2 opt3 opt4]"
                        "[this opt opt2 opt3 opt4 opt5]"],
            :docstring nil}
           {:name "close", :signature ["[this]"], :docstring nil}],
 :full-name "clojure.browser.net/IConnection",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_IConnection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_IConnection.cljsdoc)
</pre>

