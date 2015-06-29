## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWriter

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IWriter
  (-write [writer s])
  (-flush [writer]))
```

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:297-299](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L297-L299)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWriter"]))
```

```clj
{:ns "cljs.core",
 :name "IWriter",
 :type "protocol",
 :full-name-encode "cljs.core_IWriter",
 :source {:code "(defprotocol IWriter\n  (-write [writer s])\n  (-flush [writer]))",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [297 299]},
 :methods [{:name "-write", :signature ["[writer s]"], :docstring nil}
           {:name "-flush", :signature ["[writer]"], :docstring nil}],
 :full-name "cljs.core/IWriter",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IWriter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IWriter.cljsdoc)
</pre>

