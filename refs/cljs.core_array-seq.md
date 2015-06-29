## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-seq__ array)<br>
</samp>
 <samp>
(__array-seq__ array i)<br>
</samp>

---

Creates a `seq` from a JavaScript array, starting at index `i` if given.

---

Example:

```clj
(array-seq #js [1 2 3])
;;=> (1 2 3)

(array-seq #js [1 2 3] 1)
;;=> (2 3)
```

---



Source code:

```clj
(defn array-seq
  ([array]
     (prim-seq array 0))
  ([array i]
     (prim-seq array i)))
```

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:728-732](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L728-L732)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-seq"]))
```

```clj
{:description "Creates a `seq` from a JavaScript array, starting at index `i` if given.",
 :ns "cljs.core",
 :name "array-seq",
 :signature ["[array]" "[array i]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_array-seq",
 :source {:code "(defn array-seq\n  ([array]\n     (prim-seq array 0))\n  ([array i]\n     (prim-seq array i)))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [728 732]},
 :examples [{:id "9ef6de",
             :content "```clj\n(array-seq #js [1 2 3])\n;;=> (1 2 3)\n\n(array-seq #js [1 2 3] 1)\n;;=> (2 3)\n```"}],
 :full-name "cljs.core/array-seq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-seq.cljsdoc)
</pre>

