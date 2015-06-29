## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/disj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/disj</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/disj)
</td>
</tr>
</table>

 <samp>
(__disj__ coll)<br>
</samp>
 <samp>
(__disj__ coll k)<br>
</samp>
 <samp>
(__disj__ coll k & ks)<br>
</samp>

---

disj(oin). Returns a new set of the same (hashed/sorted) type, that does not
contain key(s).

---


See Also:

[`cljs.core/dissoc`](cljs.core_dissoc.md)<br>
[`cljs.core/disj!`](cljs.core_disjBANG.md)<br>
[`clojure.set/difference`](clojure.set_difference.md)<br>

---

Source docstring:

```
disj[oin]. Returns a new set of the same (hashed/sorted) type, that
does not contain key(s).
```

Source code:

```clj
(defn disj
  ([coll] coll)
  ([coll k]
     (-disjoin coll k))
  ([coll k & ks]
     (let [ret (disj coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:707-717](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L707-L717)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/disj"]))
```

```clj
{:description "disj(oin). Returns a new set of the same (hashed/sorted) type, that does not\ncontain key(s).",
 :ns "cljs.core",
 :name "disj",
 :signature ["[coll]" "[coll k]" "[coll k & ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/dissoc"
           "cljs.core/disj!"
           "clojure.set/difference"],
 :full-name-encode "cljs.core_disj",
 :source {:code "(defn disj\n  ([coll] coll)\n  ([coll k]\n     (-disjoin coll k))\n  ([coll k & ks]\n     (let [ret (disj coll k)]\n       (if ks\n         (recur ret (first ks) (next ks))\n         ret))))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [707 717]},
 :full-name "cljs.core/disj",
 :clj-symbol "clojure.core/disj",
 :docstring "disj[oin]. Returns a new set of the same (hashed/sorted) type, that\ndoes not contain key(s)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_disj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_disj.cljsdoc)
</pre>

