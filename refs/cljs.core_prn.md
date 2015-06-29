## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prn

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prn)
</td>
</tr>
</table>

 <samp>
(__prn__ & objs)<br>
</samp>

---




Source docstring:

```
Same as pr followed by (newline).
```

Source code:

```clj
(defn prn
  [& objs]
  (pr-with-opts objs (pr-opts))
  (when *print-newline*
    (newline (pr-opts))))
```

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8422-8427](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L8422-L8427)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prn"]))
```

```clj
{:ns "cljs.core",
 :name "prn",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prn",
 :source {:code "(defn prn\n  [& objs]\n  (pr-with-opts objs (pr-opts))\n  (when *print-newline*\n    (newline (pr-opts))))",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8422 8427]},
 :full-name "cljs.core/prn",
 :clj-symbol "clojure.core/prn",
 :docstring "Same as pr followed by (newline)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prn.cljsdoc)
</pre>

