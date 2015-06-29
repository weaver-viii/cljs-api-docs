## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/record?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/record?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/record?)
</td>
</tr>
</table>

 <samp>
(__record?__ x)<br>
</samp>

---




Source docstring:

```
Return true if x satisfies IRecord
```

Source code:

```clj
(defn ^boolean record?
  [x]
  (satisfies? IRecord x))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1786-1789](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L1786-L1789)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/record?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "record?",
 :signature ["[x]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core_recordQMARK",
 :source {:code "(defn ^boolean record?\n  [x]\n  (satisfies? IRecord x))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1786 1789]},
 :full-name "cljs.core/record?",
 :clj-symbol "clojure.core/record?",
 :docstring "Return true if x satisfies IRecord"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_recordQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_recordQMARK.cljsdoc)
</pre>

