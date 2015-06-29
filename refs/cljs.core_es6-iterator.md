## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/es6-iterator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__es6-iterator__ coll)<br>
</samp>

---





Source code:

```clj
(defn es6-iterator [coll]
  (ES6Iterator. (seq coll)))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:735-736](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L735-L736)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-iterator"]))
```

```clj
{:ns "cljs.core",
 :name "es6-iterator",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn es6-iterator [coll]\n  (ES6Iterator. (seq coll)))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [735 736]},
 :full-name "cljs.core/es6-iterator",
 :full-name-encode "cljs.core_es6-iterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_es6-iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_es6-iterator.cljsdoc)
</pre>

