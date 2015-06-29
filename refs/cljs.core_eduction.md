## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/eduction

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/eduction</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/eduction)
</td>
</tr>
</table>

 <samp>
(__eduction__ xform coll)<br>
</samp>

---




Source docstring:

```
Returns a reducible/iterable/seqable application of
the transducer to the items in coll. Note that these applications	
will be performed every time iterator/seq/reduce is called.
```

Source code:

```clj
(defn eduction
  [xform coll]
  (Eduction. xform coll))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8940-8945](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L8940-L8945)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/eduction"]))
```

```clj
{:ns "cljs.core",
 :name "eduction",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core_eduction",
 :source {:code "(defn eduction\n  [xform coll]\n  (Eduction. xform coll))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8940 8945]},
 :full-name "cljs.core/eduction",
 :clj-symbol "clojure.core/eduction",
 :docstring "Returns a reducible/iterable/seqable application of\nthe transducer to the items in coll. Note that these applications\t\nwill be performed every time iterator/seq/reduce is called."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_eduction.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_eduction.cljsdoc)
</pre>

