## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/rights

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rights</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rights)
</td>
</tr>
</table>

 <samp>
(__rights__ loc)<br>
</samp>

---




Source docstring:

```
Returns a seq of the right siblings of this loc
```

Source code:

```clj
(defn rights
  [loc]
    (:r (loc 1)))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:92-95](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/clojure/zip.cljs#L92-L95)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/rights"]))
```

```clj
{:ns "clojure.zip",
 :name "rights",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_rights",
 :source {:code "(defn rights\n  [loc]\n    (:r (loc 1)))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [92 95]},
 :full-name "clojure.zip/rights",
 :clj-symbol "clojure.zip/rights",
 :docstring "Returns a seq of the right siblings of this loc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_rights.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_rights.cljsdoc)
</pre>

