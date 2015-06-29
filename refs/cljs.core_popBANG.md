## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pop!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pop!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop!)
</td>
</tr>
</table>

 <samp>
(__pop!__ tcoll)<br>
</samp>

---





Source code:

```clj
(defn pop! [tcoll]
  (-pop! tcoll))
```

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2481-2482](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L2481-L2482)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pop!"]))
```

```clj
{:ns "cljs.core",
 :name "pop!",
 :signature ["[tcoll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_popBANG",
 :source {:code "(defn pop! [tcoll]\n  (-pop! tcoll))",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2481 2482]},
 :full-name "cljs.core/pop!",
 :clj-symbol "clojure.core/pop!"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_popBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_popBANG.cljsdoc)
</pre>

