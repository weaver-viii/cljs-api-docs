## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/es6-entries-iterator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__es6-entries-iterator__ coll)<br>
</samp>

---





Source code:

```clj
(defn es6-entries-iterator [coll]
  (ES6EntriesIterator. (seq coll)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5483-5484](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L5483-L5484)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-entries-iterator"]))
```

```clj
{:ns "cljs.core",
 :name "es6-entries-iterator",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn es6-entries-iterator [coll]\n  (ES6EntriesIterator. (seq coll)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5483 5484]},
 :full-name "cljs.core/es6-entries-iterator",
 :full-name-encode "cljs.core_es6-entries-iterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_es6-entries-iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_es6-entries-iterator.cljsdoc)
</pre>

