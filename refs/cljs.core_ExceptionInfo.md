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
(deftype ExceptionInfo [message data cause])
```

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7478](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L7478)</ins>
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
 :source {:code "(deftype ExceptionInfo [message data cause])",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7478]},
 :full-name "cljs.core/ExceptionInfo",
 :clj-symbol "clojure.lang/ExceptionInfo"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ExceptionInfo.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ExceptionInfo.cljsdoc)
</pre>

