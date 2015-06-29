## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/conj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj)
</td>
</tr>
</table>

 <samp>
(__conj__)<br>
</samp>
 <samp>
(__conj__ coll)<br>
</samp>
 <samp>
(__conj__ coll x)<br>
</samp>
 <samp>
(__conj__ coll x & xs)<br>
</samp>

---

conj(oin)

Returns a new collection with the `x`s "added" to `coll`.

The "addition" may happen at different "places" depending on the collection
type.

`(conj nil item)` returns `(item)`.

---


See Also:

[`cljs.core/cons`](cljs.core_cons.md)<br>
[`cljs.core/into`](cljs.core_into.md)<br>
[`cljs.core/peek`](cljs.core_peek.md)<br>
[`cljs.core/pop`](cljs.core_pop.md)<br>

---

Source docstring:

```
conj[oin]. Returns a new collection with the xs
'added'. (conj nil item) returns (item).  The 'addition' may
happen at different 'places' depending on the concrete type.
```

Source code:

```clj
(defn conj
  ([coll x]
     (-conj coll x))
  ([coll x & xs]
     (if xs
       (recur (conj coll x) (first xs) (next xs))
       (conj coll x))))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:743-752](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L743-L752)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/conj"]))
```

```clj
{:description "conj(oin)\n\nReturns a new collection with the `x`s \"added\" to `coll`.\n\nThe \"addition\" may happen at different \"places\" depending on the collection\ntype.\n\n`(conj nil item)` returns `(item)`.",
 :ns "cljs.core",
 :name "conj",
 :signature ["[]" "[coll]" "[coll x]" "[coll x & xs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/cons"
           "cljs.core/into"
           "cljs.core/peek"
           "cljs.core/pop"],
 :full-name-encode "cljs.core_conj",
 :source {:code "(defn conj\n  ([coll x]\n     (-conj coll x))\n  ([coll x & xs]\n     (if xs\n       (recur (conj coll x) (first xs) (next xs))\n       (conj coll x))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [743 752]},
 :full-name "cljs.core/conj",
 :clj-symbol "clojure.core/conj",
 :docstring "conj[oin]. Returns a new collection with the xs\n'added'. (conj nil item) returns (item).  The 'addition' may\nhappen at different 'places' depending on the concrete type."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_conj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_conj.cljsdoc)
</pre>

