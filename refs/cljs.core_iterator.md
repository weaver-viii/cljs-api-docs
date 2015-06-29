## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/iterator~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2268"><img valign="middle" alt="[+] 0.0-2268" src="https://img.shields.io/badge/+-0.0--2268-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[×] 0.0-2371" src="https://img.shields.io/badge/×-0.0--2371-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__iterator__ coll)<br>
</samp>

---





Source code:

```clj
(defn iterator [coll]
  (Iterator. (seq coll)))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4870-4871](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L4870-L4871)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iterator"]))
```

```clj
{:ns "cljs.core",
 :name "iterator",
 :signature ["[coll]"],
 :history [["+" "0.0-2268"] ["-" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core_iterator",
 :source {:code "(defn iterator [coll]\n  (Iterator. (seq coll)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4870 4871]},
 :full-name "cljs.core/iterator",
 :removed {:in "0.0-2371", :last-seen "0.0-2356"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iterator.cljsdoc)
</pre>

