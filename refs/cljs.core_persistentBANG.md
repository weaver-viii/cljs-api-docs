## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/persistent!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/persistent!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/persistent!)
</td>
</tr>
</table>

 <samp>
(__persistent!__ tcoll)<br>
</samp>

---




Source docstring:

```
Returns a new, persistent version of the transient collection, in
constant time. The transient collection cannot be used after this
call, any such use will throw an exception.
```

Source code:

```clj
(defn persistent!
  [tcoll]
  (-persistent! tcoll))
```

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2839-2844](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L2839-L2844)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/persistent!"]))
```

```clj
{:ns "cljs.core",
 :name "persistent!",
 :signature ["[tcoll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_persistentBANG",
 :source {:code "(defn persistent!\n  [tcoll]\n  (-persistent! tcoll))",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2839 2844]},
 :full-name "cljs.core/persistent!",
 :clj-symbol "clojure.core/persistent!",
 :docstring "Returns a new, persistent version of the transient collection, in\nconstant time. The transient collection cannot be used after this\ncall, any such use will throw an exception."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_persistentBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_persistentBANG.cljsdoc)
</pre>

