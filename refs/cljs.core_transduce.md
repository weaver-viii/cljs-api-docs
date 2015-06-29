## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/transduce

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__transduce__ xform f coll)<br>
</samp>
 <samp>
(__transduce__ xform f init coll)<br>
</samp>

---




Source docstring:

```
reduce with a transformation of f (xf). If init is not
supplied, (f) will be called to produce it. Returns the result of
applying (the transformed) xf to init and the first item in coll,
then applying xf to that result and the 2nd item, etc. If coll
contains no items, returns init and f is not called. Note that
certain transforms may inject or skip items.
```

Source code:

```clj
(defn transduce
  ([xform f coll] (transduce xform f (f) coll))
  ([xform f init coll]
     (let [f (xform (completing f))
           ret (reduce f init coll)
           ret (f (if (reduced? ret) @ret ret))]
       (if (reduced? ret) @ret ret))))
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1663-1675](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L1663-L1675)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/transduce"]))
```

```clj
{:ns "cljs.core",
 :name "transduce",
 :signature ["[xform f coll]" "[xform f init coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core_transduce",
 :source {:code "(defn transduce\n  ([xform f coll] (transduce xform f (f) coll))\n  ([xform f init coll]\n     (let [f (xform (completing f))\n           ret (reduce f init coll)\n           ret (f (if (reduced? ret) @ret ret))]\n       (if (reduced? ret) @ret ret))))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1663 1675]},
 :full-name "cljs.core/transduce",
 :docstring "reduce with a transformation of f (xf). If init is not\nsupplied, (f) will be called to produce it. Returns the result of\napplying (the transformed) xf to init and the first item in coll,\nthen applying xf to that result and the 2nd item, etc. If coll\ncontains no items, returns init and f is not called. Note that\ncertain transforms may inject or skip items."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_transduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_transduce.cljsdoc)
</pre>

