## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/printf

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/printf</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/printf)
</td>
</tr>
</table>

 <samp>
(__printf__ fmt & args)<br>
</samp>

---




Source docstring:

```
Prints formatted output, as per format
```

Source code:

```clj
(defn printf
  [fmt & args]
  (print (apply format fmt args)))
```

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6692-6695](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6692-L6695)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/printf"]))
```

```clj
{:ns "cljs.core",
 :name "printf",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core_printf",
 :source {:code "(defn printf\n  [fmt & args]\n  (print (apply format fmt args)))",
          :repo "clojurescript",
          :tag "r1820",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6692 6695]},
 :full-name "cljs.core/printf",
 :clj-symbol "clojure.core/printf",
 :docstring "Prints formatted output, as per format"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_printf.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_printf.cljsdoc)
</pre>

