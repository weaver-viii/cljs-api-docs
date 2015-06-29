## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prn-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prn-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prn-str)
</td>
</tr>
</table>

 <samp>
(__prn-str__ & objs)<br>
</samp>

---




Source docstring:

```
Same as pr-str followed by (newline)
```

Source code:

```clj
(defn prn-str
  [& objs]
  (prn-str-with-opts objs (pr-opts)))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6735-6738](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L6735-L6738)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prn-str"]))
```

```clj
{:ns "cljs.core",
 :name "prn-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_prn-str",
 :source {:code "(defn prn-str\n  [& objs]\n  (prn-str-with-opts objs (pr-opts)))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6735 6738]},
 :full-name "cljs.core/prn-str",
 :clj-symbol "clojure.core/prn-str",
 :docstring "Same as pr-str followed by (newline)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prn-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prn-str.cljsdoc)
</pre>

