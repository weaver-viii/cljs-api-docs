## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/newline

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/newline)
</td>
</tr>
</table>

 <samp>
(__newline__ opts)<br>
</samp>

---





Source code:

```clj
(defn newline [opts]
  (string-print "\n")
  (when (get opts :flush-on-newline)
    (flush)))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6773-6776](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L6773-L6776)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/newline"]))
```

```clj
{:ns "cljs.core",
 :name "newline",
 :signature ["[opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_newline",
 :source {:code "(defn newline [opts]\n  (string-print \"\\n\")\n  (when (get opts :flush-on-newline)\n    (flush)))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6773 6776]},
 :full-name "cljs.core/newline",
 :clj-symbol "clojure.core/newline"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_newline.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_newline.cljsdoc)
</pre>

