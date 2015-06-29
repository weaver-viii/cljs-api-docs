## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISequential

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Sequential</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Sequential.java)
</td>
</tr>
</table>





Source docstring:

```
Marker interface indicating a persistent collection of sequential items
```

Source code:

```clj
(defprotocol ISequential
  "Marker interface indicating a persistent collection of sequential items")
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:277-278](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L277-L278)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISequential"]))
```

```clj
{:ns "cljs.core",
 :name "ISequential",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISequential",
 :source {:code "(defprotocol ISequential\n  \"Marker interface indicating a persistent collection of sequential items\")",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [277 278]},
 :full-name "cljs.core/ISequential",
 :clj-symbol "clojure.lang/Sequential",
 :docstring "Marker interface indicating a persistent collection of sequential items"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISequential.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISequential.cljsdoc)
</pre>

