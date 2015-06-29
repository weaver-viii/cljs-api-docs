## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/volatile!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/volatile!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/volatile!)
</td>
</tr>
</table>

 <samp>
(__volatile!__ val)<br>
</samp>

---




Source docstring:

```
Creates and returns a Volatile with an initial value of val.
```

Source code:

```clj
(defn volatile!
  [val]
  (Volatile. val))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3892-3895](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L3892-L3895)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/volatile!"]))
```

```clj
{:ns "cljs.core",
 :name "volatile!",
 :signature ["[val]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.core_volatileBANG",
 :source {:code "(defn volatile!\n  [val]\n  (Volatile. val))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3892 3895]},
 :full-name "cljs.core/volatile!",
 :clj-symbol "clojure.core/volatile!",
 :docstring "Creates and returns a Volatile with an initial value of val."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_volatileBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_volatileBANG.cljsdoc)
</pre>

