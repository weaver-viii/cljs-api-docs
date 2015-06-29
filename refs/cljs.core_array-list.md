## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-list

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-list__)<br>
</samp>

---





Source code:

```clj
(defn array-list []
  (ArrayList. (array)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8036-8037](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L8036-L8037)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-list"]))
```

```clj
{:ns "cljs.core",
 :name "array-list",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn array-list []\n  (ArrayList. (array)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8036 8037]},
 :full-name "cljs.core/array-list",
 :full-name-encode "cljs.core_array-list",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-list.cljsdoc)
</pre>

