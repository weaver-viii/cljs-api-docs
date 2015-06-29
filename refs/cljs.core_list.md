## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list)
</td>
</tr>
</table>

 <samp>
(__list__ & items)<br>
</samp>

---

Creates a new list containing `items`.

---


See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/list?`](cljs.core_listQMARK.md)<br>

---


Source code:

```clj
(defn list [& items]
  (reduce conj () (reverse items)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1459-1460](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1459-L1460)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list"]))
```

```clj
{:description "Creates a new list containing `items`.",
 :ns "cljs.core",
 :name "list",
 :signature ["[& items]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/list?"],
 :full-name-encode "cljs.core_list",
 :source {:code "(defn list [& items]\n  (reduce conj () (reverse items)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1459 1460]},
 :full-name "cljs.core/list",
 :clj-symbol "clojure.core/list"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_list.cljsdoc)
</pre>

