## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol?)
</td>
</tr>
</table>

 <samp>
(__symbol?__ x)<br>
</samp>

---





Source code:

```clj
(defn ^boolean symbol? [x]
  (and ^boolean (goog/isString x)
       (identical? (.charAt x 0) \uFDD1)))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1021-1023](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1021-L1023)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbolQMARK",
 :source {:code "(defn ^boolean symbol? [x]\n  (and ^boolean (goog/isString x)\n       (identical? (.charAt x 0) \\uFDD1)))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1021 1023]},
 :full-name "cljs.core/symbol?",
 :clj-symbol "clojure.core/symbol?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_symbolQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_symbolQMARK.cljsdoc)
</pre>

