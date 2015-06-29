## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/flush

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/flush</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/flush)
</td>
</tr>
</table>

 <samp>
(__flush__)<br>
</samp>

---





Source code:

```clj
(defn flush [] ;stub
  nil)
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6802-6803](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L6802-L6803)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/flush"]))
```

```clj
{:ns "cljs.core",
 :name "flush",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_flush",
 :source {:code "(defn flush [] ;stub\n  nil)",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6802 6803]},
 :full-name "cljs.core/flush",
 :clj-symbol "clojure.core/flush"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_flush.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_flush.cljsdoc)
</pre>

