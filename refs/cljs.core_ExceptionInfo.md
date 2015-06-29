## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ExceptionInfo

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ExceptionInfo</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ExceptionInfo.java)
</td>
</tr>
</table>

 <samp>
(__ExceptionInfo.__ message data cause)<br>
</samp>

---





Source code:

```clj
(defn ^{:jsdoc ["@constructor"]}
  ExceptionInfo [message data cause]
  (let [e (js/Error.)]
    (this-as this
      (set! (.-message this) message)
      (set! (.-data this) data)
      (set! (.-cause this) cause)
      (do
        (set! (.-name this) (.-name e))
        ;; non-standard
        (set! (.-description this) (.-description e))
        (set! (.-number this) (.-number e))
        (set! (.-fileName this) (.-fileName e))
        (set! (.-lineNumber this) (.-lineNumber e))
        (set! (.-columnNumber this) (.-columnNumber e))
        (set! (.-stack this) (.-stack e)))
      this)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9539-9555](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L9539-L9555)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ExceptionInfo"]))
```

```clj
{:ns "cljs.core",
 :name "ExceptionInfo",
 :signature ["[message data cause]"],
 :history [["+" "0.0-1576"]],
 :type "type",
 :full-name-encode "cljs.core_ExceptionInfo",
 :source {:code "(defn ^{:jsdoc [\"@constructor\"]}\n  ExceptionInfo [message data cause]\n  (let [e (js/Error.)]\n    (this-as this\n      (set! (.-message this) message)\n      (set! (.-data this) data)\n      (set! (.-cause this) cause)\n      (do\n        (set! (.-name this) (.-name e))\n        ;; non-standard\n        (set! (.-description this) (.-description e))\n        (set! (.-number this) (.-number e))\n        (set! (.-fileName this) (.-fileName e))\n        (set! (.-lineNumber this) (.-lineNumber e))\n        (set! (.-columnNumber this) (.-columnNumber e))\n        (set! (.-stack this) (.-stack e)))\n      this)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9539 9555]},
 :full-name "cljs.core/ExceptionInfo",
 :clj-symbol "clojure.lang/ExceptionInfo"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ExceptionInfo.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ExceptionInfo.cljsdoc)
</pre>

