## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IRecord

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IRecord</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IRecord.java)
</td>
</tr>
</table>





Source docstring:

```
Marker interface indicating a record object
```

Source code:

```clj
(defprotocol IRecord
  "Marker interface indicating a record object")
```

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:265-266](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L265-L266)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IRecord"]))
```

```clj
{:ns "cljs.core",
 :name "IRecord",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IRecord",
 :source {:code "(defprotocol IRecord\n  \"Marker interface indicating a record object\")",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/cljs/core.cljs",
          :lines [265 266]},
 :full-name "cljs.core/IRecord",
 :clj-symbol "clojure.lang/IRecord",
 :docstring "Marker interface indicating a record object"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IRecord.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IRecord.cljsdoc)
</pre>

