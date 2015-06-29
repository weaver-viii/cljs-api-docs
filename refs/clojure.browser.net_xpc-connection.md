## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xpc-connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__xpc-connection__)<br>
</samp>
 <samp>
(__xpc-connection__ config)<br>
</samp>

---




Source docstring:

```
When passed with a config hash-map, returns a parent
CrossPageChannel object. Keys in the config hash map are downcased
versions of the goog.net.xpc.CfgFields enum keys,
e.g. goog.net.xpc.CfgFields.PEER_URI becomes :peer_uri in the config
hash.

When passed with no args, creates a child CrossPageChannel object,
and the config is automatically taken from the URL param 'xpc', as
per the CrossPageChannel API.
```

Source code:

```clj
(defn xpc-connection
  ([]
     (when-let [config (.getParameterValue
                        (Uri. (.-href (.-location js/window)))
                        "xpc")]
       (CrossPageChannel. (gjson/parse config))))
  ([config]
     (CrossPageChannel.
      (reduce (fn [sum [k v]]
                (if-let [field (get xpc-config-fields k)]
                  (doto sum (aset field v))
                  sum))
              (js-obj)
              config))))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:116-138](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/clojure/browser/net.cljs#L116-L138)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/xpc-connection"]))
```

```clj
{:ns "clojure.browser.net",
 :name "xpc-connection",
 :signature ["[]" "[config]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.net_xpc-connection",
 :source {:code "(defn xpc-connection\n  ([]\n     (when-let [config (.getParameterValue\n                        (Uri. (.-href (.-location js/window)))\n                        \"xpc\")]\n       (CrossPageChannel. (gjson/parse config))))\n  ([config]\n     (CrossPageChannel.\n      (reduce (fn [sum [k v]]\n                (if-let [field (get xpc-config-fields k)]\n                  (doto sum (aset field v))\n                  sum))\n              (js-obj)\n              config))))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [116 138]},
 :full-name "clojure.browser.net/xpc-connection",
 :docstring "When passed with a config hash-map, returns a parent\nCrossPageChannel object. Keys in the config hash map are downcased\nversions of the goog.net.xpc.CfgFields enum keys,\ne.g. goog.net.xpc.CfgFields.PEER_URI becomes :peer_uri in the config\nhash.\n\nWhen passed with no args, creates a child CrossPageChannel object,\nand the config is automatically taken from the URL param 'xpc', as\nper the CrossPageChannel API."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_xpc-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_xpc-connection.cljsdoc)
</pre>

