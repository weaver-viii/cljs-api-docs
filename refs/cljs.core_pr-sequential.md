## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-sequential

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-sequential__ print-one begin sep end opts coll)<br>
</samp>

---





Source code:

```clj
(defn pr-sequential [print-one begin sep end opts coll]
  (concat [begin]
          (flatten1
            (interpose [sep] (map #(print-one % opts) coll)))
          [end]))
```

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6114-6118](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6114-L6118)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-sequential"]))
```

```clj
{:ns "cljs.core",
 :name "pr-sequential",
 :type "function",
 :signature ["[print-one begin sep end opts coll]"],
 :source {:code "(defn pr-sequential [print-one begin sep end opts coll]\n  (concat [begin]\n          (flatten1\n            (interpose [sep] (map #(print-one % opts) coll)))\n          [end]))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6114 6118]},
 :full-name "cljs.core/pr-sequential",
 :full-name-encode "cljs.core_pr-sequential",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-sequential.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-sequential.cljsdoc)
</pre>

