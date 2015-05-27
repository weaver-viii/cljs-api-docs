## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mapv

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mapv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mapv)
</td>
</tr>
</table>

 <samp>
(__mapv__ f coll)<br>
(__mapv__ f c1 c2)<br>
(__mapv__ f c1 c2 c3)<br>
(__mapv__ f c1 c2 c3 & colls)<br>
</samp>

```
Returns a vector consisting of the result of applying f to the
set of first items of each coll, followed by applying f to the set
of second items in each coll, until any one of the colls is
exhausted.  Any remaining items in other colls are ignored. Function
f should accept number-of-colls arguments.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2680-2694](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L2680-L2694)</ins>
</pre>

```clj
(defn mapv
  ([f coll]
     (-> (reduce (fn [v o] (conj! v (f o))) (transient []) coll)
         persistent!))
  ([f c1 c2]
     (into [] (map f c1 c2)))
  ([f c1 c2 c3]
     (into [] (map f c1 c2 c3)))
  ([f c1 c2 c3 & colls]
     (into [] (apply map f c1 c2 c3 colls))))
```


---

```clj
{:ns "cljs.core",
 :name "mapv",
 :signature ["[f coll]"
             "[f c1 c2]"
             "[f c1 c2 c3]"
             "[f c1 c2 c3 & colls]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_mapv",
 :source {:code "(defn mapv\n  ([f coll]\n     (-> (reduce (fn [v o] (conj! v (f o))) (transient []) coll)\n         persistent!))\n  ([f c1 c2]\n     (into [] (map f c1 c2)))\n  ([f c1 c2 c3]\n     (into [] (map f c1 c2 c3)))\n  ([f c1 c2 c3 & colls]\n     (into [] (apply map f c1 c2 c3 colls))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2680 2694],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L2680-L2694"},
 :full-name "cljs.core/mapv",
 :clj-symbol "clojure.core/mapv",
 :docstring "Returns a vector consisting of the result of applying f to the\nset of first items of each coll, followed by applying f to the set\nof second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments."}

```