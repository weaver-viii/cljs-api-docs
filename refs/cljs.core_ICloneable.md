## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICloneable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2134"><img valign="middle" alt="[+] 0.0-2134" src="https://img.shields.io/badge/+-0.0--2134-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol ICloneable
  (^clj -clone [value]))
```

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:242-243](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L242-L243)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICloneable"]))
```

```clj
{:ns "cljs.core",
 :name "ICloneable",
 :type "protocol",
 :full-name-encode "cljs.core_ICloneable",
 :source {:code "(defprotocol ICloneable\n  (^clj -clone [value]))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [242 243]},
 :methods [{:name "-clone", :signature ["[value]"], :docstring nil}],
 :full-name "cljs.core/ICloneable",
 :history [["+" "0.0-2134"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICloneable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICloneable.cljsdoc)
</pre>

