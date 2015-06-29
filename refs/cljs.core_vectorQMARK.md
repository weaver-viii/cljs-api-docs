## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector?)
</td>
</tr>
</table>

 <samp>
(__vector?__ x)<br>
</samp>

---

Returns true if `x` is a vector, false otherwise.

---


See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/vec`](cljs.core_vec.md)<br>

---

Source docstring:

```
Return true if x satisfies IVector
```

Source code:

```clj
(defn ^boolean vector?
  [x] (satisfies? IVector x))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1541-1543](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L1541-L1543)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector?"]))
```

```clj
{:description "Returns true if `x` is a vector, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "vector?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/vec"],
 :full-name-encode "cljs.core_vectorQMARK",
 :source {:code "(defn ^boolean vector?\n  [x] (satisfies? IVector x))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1541 1543]},
 :full-name "cljs.core/vector?",
 :clj-symbol "clojure.core/vector?",
 :docstring "Return true if x satisfies IVector"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vectorQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vectorQMARK.cljsdoc)
</pre>

