## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/entries-iterator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2268"><img valign="middle" alt="[+] 0.0-2268" src="https://img.shields.io/badge/+-0.0--2268-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__entries-iterator__ coll)<br>
</samp>

---





Source code:

```clj
(defn entries-iterator [coll]
  (EntriesIterator. (seq coll)))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4864-4865](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L4864-L4865)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/entries-iterator"]))
```

```clj
{:ns "cljs.core",
 :name "entries-iterator",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn entries-iterator [coll]\n  (EntriesIterator. (seq coll)))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4864 4865]},
 :full-name "cljs.core/entries-iterator",
 :full-name-encode "cljs.core_entries-iterator",
 :history [["+" "0.0-2268"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_entries-iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_entries-iterator.cljsdoc)
</pre>

