## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__cat__ rf)<br>
</samp>

---




Source docstring:

```
A transducer which concatenates the contents of each input, which must be a
collection, into the reduction.
```

Source code:

```clj
(defn cat
  [rf]
  (let [rf1 (preserving-reduced rf)]  
    (fn
      ([] (rf))
      ([result] (rf result))
      ([result input]
         (reduce rf1 result input)))))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8568-8578](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L8568-L8578)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cat"]))
```

```clj
{:ns "cljs.core",
 :name "cat",
 :signature ["[rf]"],
 :history [["+" "0.0-2341"]],
 :type "function",
 :full-name-encode "cljs.core_cat",
 :source {:code "(defn cat\n  [rf]\n  (let [rf1 (preserving-reduced rf)]  \n    (fn\n      ([] (rf))\n      ([result] (rf result))\n      ([result input]\n         (reduce rf1 result input)))))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8568 8578]},
 :full-name "cljs.core/cat",
 :docstring "A transducer which concatenates the contents of each input, which must be a\ncollection, into the reduction."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cat.cljsdoc)
</pre>

