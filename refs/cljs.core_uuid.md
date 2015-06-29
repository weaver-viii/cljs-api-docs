## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/uuid

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__uuid__ s)<br>
</samp>

---





Source code:

```clj
(defn uuid [s]
  (UUID. s nil))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9534-9535](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L9534-L9535)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/uuid"]))
```

```clj
{:ns "cljs.core",
 :name "uuid",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn uuid [s]\n  (UUID. s nil))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9534 9535]},
 :full-name "cljs.core/uuid",
 :full-name-encode "cljs.core_uuid",
 :history [["+" "0.0-3291"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_uuid.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_uuid.cljsdoc)
</pre>

