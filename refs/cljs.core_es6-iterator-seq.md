## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/es6-iterator-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__es6-iterator-seq__ iter)<br>
</samp>

---




Source docstring:

```
EXPERIMENTAL: Given an ES2015 compatible iterator return a seq.
```

Source code:

```clj
(defn es6-iterator-seq
  [iter]
  (let [v (.next iter)]
    (if (.-done v)
      ()
      (ES6IteratorSeq. (.-value v) iter nil))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1036-1042](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L1036-L1042)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-iterator-seq"]))
```

```clj
{:ns "cljs.core",
 :name "es6-iterator-seq",
 :signature ["[iter]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core_es6-iterator-seq",
 :source {:code "(defn es6-iterator-seq\n  [iter]\n  (let [v (.next iter)]\n    (if (.-done v)\n      ()\n      (ES6IteratorSeq. (.-value v) iter nil))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1036 1042]},
 :full-name "cljs.core/es6-iterator-seq",
 :docstring "EXPERIMENTAL: Given an ES2015 compatible iterator return a seq."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_es6-iterator-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_es6-iterator-seq.cljsdoc)
</pre>

