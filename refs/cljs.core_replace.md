## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/replace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ smap)<br>
</samp>
 <samp>
(__replace__ smap coll)<br>
</samp>

---

Given a map of replacement pairs `smap` and a vector/collection `coll`, returns
a vector/seq with any elements `=` to a key in `smap` replaced with the
corresponding val in `smap`.

Returns a transducer when `coll` is not provided.

---


See Also:

[`cljs.core/map`](cljs.core_map.md)<br>
[`clojure.walk/prewalk-replace`](clojure.walk_prewalk-replace.md)<br>
[`clojure.walk/postwalk-replace`](clojure.walk_postwalk-replace.md)<br>

---

Source docstring:

```
Given a map of replacement pairs and a vector/collection, returns a
vector/seq with any elements = a key in smap replaced with the
corresponding val in smap
```

Source code:

```clj
(defn replace
  [smap coll]
  (if (vector? coll)
    (let [n (count coll)]
      (reduce (fn [v i]
                (if-let [e (find smap (nth v i))]
                  (assoc v i (second e))
                  v))
              coll (take n (iterate inc 0))))
    (map #(if-let [e (find smap %)] (second e) %) coll)))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6232-6244](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L6232-L6244)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/replace"]))
```

```clj
{:description "Given a map of replacement pairs `smap` and a vector/collection `coll`, returns\na vector/seq with any elements `=` to a key in `smap` replaced with the\ncorresponding val in `smap`.\n\nReturns a transducer when `coll` is not provided.",
 :ns "cljs.core",
 :name "replace",
 :signature ["[smap]" "[smap coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map"
           "clojure.walk/prewalk-replace"
           "clojure.walk/postwalk-replace"],
 :full-name-encode "cljs.core_replace",
 :source {:code "(defn replace\n  [smap coll]\n  (if (vector? coll)\n    (let [n (count coll)]\n      (reduce (fn [v i]\n                (if-let [e (find smap (nth v i))]\n                  (assoc v i (second e))\n                  v))\n              coll (take n (iterate inc 0))))\n    (map #(if-let [e (find smap %)] (second e) %) coll)))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6232 6244]},
 :full-name "cljs.core/replace",
 :clj-symbol "clojure.core/replace",
 :docstring "Given a map of replacement pairs and a vector/collection, returns a\nvector/seq with any elements = a key in smap replaced with the\ncorresponding val in smap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_replace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_replace.cljsdoc)
</pre>

