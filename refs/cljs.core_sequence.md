## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sequence

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sequence</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequence)
</td>
</tr>
</table>

 <samp>
(__sequence__ coll)<br>
</samp>

---




Source docstring:

```
Coerces coll to a (possibly empty) sequence, if it is not already
one. Will not force a lazy seq. (sequence nil) yields ()
```

Source code:

```clj
(defn ^seq sequence
  [coll]
   (if (seq? coll)
     coll
     (or (seq coll) ())))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1292-1298](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L1292-L1298)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sequence"]))
```

```clj
{:return-type seq,
 :ns "cljs.core",
 :name "sequence",
 :signature ["[coll]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :full-name-encode "cljs.core_sequence",
 :source {:code "(defn ^seq sequence\n  [coll]\n   (if (seq? coll)\n     coll\n     (or (seq coll) ())))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1292 1298]},
 :full-name "cljs.core/sequence",
 :clj-symbol "clojure.core/sequence",
 :docstring "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields ()"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sequence.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sequence.cljsdoc)
</pre>

