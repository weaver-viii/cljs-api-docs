## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/time

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/time</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/time)
</td>
</tr>
</table>

 <samp>
(__time__ expr)<br>
</samp>

---




Source docstring:

```
Evaluates expr and prints the time it took. Returns the value of expr.
```

Source code:

```clj
(defmacro time
  [expr]
  `(let [start# (.getTime (js/Date.))
         ret# ~expr]
     (prn (core/str "Elapsed time: " (- (.getTime (js/Date.)) start#) " msecs"))
     ret#))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1595-1601](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1595-L1601)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/time"]))
```

```clj
{:ns "cljs.core",
 :name "time",
 :signature ["[expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_time",
 :source {:code "(defmacro time\n  [expr]\n  `(let [start# (.getTime (js/Date.))\n         ret# ~expr]\n     (prn (core/str \"Elapsed time: \" (- (.getTime (js/Date.)) start#) \" msecs\"))\n     ret#))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/core.clj",
          :lines [1595 1601]},
 :full-name "cljs.core/time",
 :clj-symbol "clojure.core/time",
 :docstring "Evaluates expr and prints the time it took. Returns the value of expr."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_time.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_time.cljsdoc)
</pre>

