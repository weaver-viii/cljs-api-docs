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
 <samp>
(__sequence__ xform coll)<br>
</samp>
 <samp>
(__sequence__ xform coll & colls)<br>
</samp>

---




Source docstring:

```
Coerces coll to a (possibly empty) sequence, if it is not already
one. Will not force a lazy seq. (sequence nil) yields (), When a
transducer is supplied, returns a lazy sequence of applications of
the transform to the items in coll(s), i.e. to the set of first
items of each coll, followed by the set of second
items in each coll, until any one of the colls is exhausted.  Any
remaining items in other colls are ignored. The transform should accept
number-of-colls arguments
```

Source code:

```clj
(defn sequence
  ([coll]
     (if (seq? coll)
       coll
       (or (seq coll) ())))
  ([xform coll]
     (.create LazyTransformer xform coll))
  ([xform coll & colls]
     (.createMulti LazyTransformer xform (to-array (cons coll colls)))))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3582-3598](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L3582-L3598)</ins>
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
{:ns "cljs.core",
 :name "sequence",
 :signature ["[coll]" "[xform coll]" "[xform coll & colls]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :full-name-encode "cljs.core_sequence",
 :source {:code "(defn sequence\n  ([coll]\n     (if (seq? coll)\n       coll\n       (or (seq coll) ())))\n  ([xform coll]\n     (.create LazyTransformer xform coll))\n  ([xform coll & colls]\n     (.createMulti LazyTransformer xform (to-array (cons coll colls)))))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3582 3598]},
 :full-name "cljs.core/sequence",
 :clj-symbol "clojure.core/sequence",
 :docstring "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields (), When a\ntransducer is supplied, returns a lazy sequence of applications of\nthe transform to the items in coll(s), i.e. to the set of first\nitems of each coll, followed by the set of second\nitems in each coll, until any one of the colls is exhausted.  Any\nremaining items in other colls are ignored. The transform should accept\nnumber-of-colls arguments"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sequence.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sequence.cljsdoc)
</pre>

