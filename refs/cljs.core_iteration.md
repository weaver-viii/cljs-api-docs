## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/iteration~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[×] 0.0-2371" src="https://img.shields.io/badge/×-0.0--2371-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__iteration__ xform coll)<br>
</samp>

---




Source docstring:

```
Returns an iterable/seqable/reducible sequence of applications of
the transducer to the items in coll. Note that these applications
will be performed every time iterator/seq/reduce is called.
```

Source code:

```clj
(defn iteration
  [xform coll]
  (Iteration. xform coll))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8205-8210](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L8205-L8210)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iteration"]))
```

```clj
{:ns "cljs.core",
 :name "iteration",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2301"] ["-" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core_iteration",
 :source {:code "(defn iteration\n  [xform coll]\n  (Iteration. xform coll))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8205 8210]},
 :full-name "cljs.core/iteration",
 :docstring "Returns an iterable/seqable/reducible sequence of applications of\nthe transducer to the items in coll. Note that these applications\nwill be performed every time iterator/seq/reduce is called.",
 :removed {:in "0.0-2371", :last-seen "0.0-2356"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iteration.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iteration.cljsdoc)
</pre>
