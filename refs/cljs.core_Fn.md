## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Fn

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Fn</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Fn.java)
</td>
</tr>
</table>





Source docstring:

```
Marker protocol
```

Source code:

```clj
(defprotocol Fn
  "Marker protocol")
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:214-215](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L214-L215)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Fn"]))
```

```clj
{:ns "cljs.core",
 :name "Fn",
 :history [["+" "0.0-1552"]],
 :type "protocol",
 :full-name-encode "cljs.core_Fn",
 :source {:code "(defprotocol Fn\n  \"Marker protocol\")",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [214 215]},
 :full-name "cljs.core/Fn",
 :clj-symbol "clojure.lang/Fn",
 :docstring "Marker protocol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Fn.cljsdoc)
</pre>

