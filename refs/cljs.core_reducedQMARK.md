## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduced?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduced?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduced?)
</td>
</tr>
</table>

 <samp>
(__reduced?__ r)<br>
</samp>

---




Source docstring:

```
Returns true if x is the result of a call to reduced
```

Source code:

```clj
(defn ^boolean reduced?
  [r]
  (instance? Reduced r))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1135-1138](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L1135-L1138)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduced?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduced?",
 :signature ["[r]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reducedQMARK",
 :source {:code "(defn ^boolean reduced?\n  [r]\n  (instance? Reduced r))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1135 1138]},
 :full-name "cljs.core/reduced?",
 :clj-symbol "clojure.core/reduced?",
 :docstring "Returns true if x is the result of a call to reduced"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reducedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reducedQMARK.cljsdoc)
</pre>

