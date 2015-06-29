## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/postwalk-replace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/postwalk-replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk-replace)
</td>
</tr>
</table>

 <samp>
(__postwalk-replace__ smap form)<br>
</samp>

---




Source docstring:

```
Recursively transforms form by replacing keys in smap with their
values.  Like clojure/replace but works on any data structure.  Does
replacement at the leaves of the tree first.
```

Source code:

```clj
(defn postwalk-replace
  [smap form]
  (postwalk (fn [x] (if (contains? smap x) (smap x) x)) form))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:88-94](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/clojure/walk.cljs#L88-L94)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/postwalk-replace"]))
```

```clj
{:ns "clojure.walk",
 :name "postwalk-replace",
 :signature ["[smap form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_postwalk-replace",
 :source {:code "(defn postwalk-replace\n  [smap form]\n  (postwalk (fn [x] (if (contains? smap x) (smap x) x)) form))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [88 94]},
 :full-name "clojure.walk/postwalk-replace",
 :clj-symbol "clojure.walk/postwalk-replace",
 :docstring "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the leaves of the tree first."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.walk_postwalk-replace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk_postwalk-replace.cljsdoc)
</pre>

