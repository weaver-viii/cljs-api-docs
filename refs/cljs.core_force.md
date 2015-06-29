## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/force

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/force</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/force)
</td>
</tr>
</table>

 <samp>
(__force__ x)<br>
</samp>

---




Source docstring:

```
If x is a Delay, returns the (possibly cached) value of its expression, else returns x
```

Source code:

```clj
(defn force
  [x]
  (if (delay? x)
    (deref x)
    x))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8543-8548](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/core.cljs#L8543-L8548)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/force"]))
```

```clj
{:ns "cljs.core",
 :name "force",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_force",
 :source {:code "(defn force\n  [x]\n  (if (delay? x)\n    (deref x)\n    x))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8543 8548]},
 :full-name "cljs.core/force",
 :clj-symbol "clojure.core/force",
 :docstring "If x is a Delay, returns the (possibly cached) value of its expression, else returns x"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_force.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_force.cljsdoc)
</pre>

