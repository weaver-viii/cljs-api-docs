## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ASeq

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ASeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ASeq.java)
</td>
</tr>
</table>





Source docstring:

```
Marker protocol indicating an array sequence.
```

Source code:

```clj
(defprotocol ASeq
  "Marker protocol indicating an array sequence.")
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:370-371](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L370-L371)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ASeq"]))
```

```clj
{:ns "cljs.core",
 :name "ASeq",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ASeq",
 :source {:code "(defprotocol ASeq\n  \"Marker protocol indicating an array sequence.\")",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [370 371]},
 :full-name "cljs.core/ASeq",
 :clj-symbol "clojure.lang/ASeq",
 :docstring "Marker protocol indicating an array sequence."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ASeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ASeq.cljsdoc)
</pre>

