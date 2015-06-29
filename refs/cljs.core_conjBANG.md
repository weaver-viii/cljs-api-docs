## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/conj!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj!)
</td>
</tr>
</table>

 <samp>
(__conj!__ tcoll val)<br>
</samp>

---





Source code:

```clj
(defn conj! [tcoll val]
  (-conj! tcoll val))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2405-2406](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L2405-L2406)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/conj!"]))
```

```clj
{:ns "cljs.core",
 :name "conj!",
 :signature ["[tcoll val]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_conjBANG",
 :source {:code "(defn conj! [tcoll val]\n  (-conj! tcoll val))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2405 2406]},
 :full-name "cljs.core/conj!",
 :clj-symbol "clojure.core/conj!"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_conjBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_conjBANG.cljsdoc)
</pre>

