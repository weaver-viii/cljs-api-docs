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
(__conj!__)<br>
</samp>
 <samp>
(__conj!__ coll)<br>
</samp>
 <samp>
(__conj!__ tcoll val)<br>
</samp>
 <samp>
(__conj!__ tcoll val & vals)<br>
</samp>

---




Source docstring:

```
Adds x to the transient collection, and return coll. The 'addition'
may happen at different 'places' depending on the concrete type.
```

Source code:

```clj
(defn conj!
  ([] (transient []))
  ([coll] coll)
  ([tcoll val]
    (-conj! tcoll val))
  ([tcoll val & vals]
    (let [ntcoll (-conj! tcoll val)]
      (if vals
        (recur ntcoll (first vals) (next vals))
        ntcoll))))
```

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2735-2746](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L2735-L2746)</ins>
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
 :signature ["[]" "[coll]" "[tcoll val]" "[tcoll val & vals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_conjBANG",
 :source {:code "(defn conj!\n  ([] (transient []))\n  ([coll] coll)\n  ([tcoll val]\n    (-conj! tcoll val))\n  ([tcoll val & vals]\n    (let [ntcoll (-conj! tcoll val)]\n      (if vals\n        (recur ntcoll (first vals) (next vals))\n        ntcoll))))",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2735 2746]},
 :full-name "cljs.core/conj!",
 :clj-symbol "clojure.core/conj!",
 :docstring "Adds x to the transient collection, and return coll. The 'addition'\nmay happen at different 'places' depending on the concrete type."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_conjBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_conjBANG.cljsdoc)
</pre>

