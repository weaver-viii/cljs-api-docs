## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/last

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/last)
</td>
</tr>
</table>

 <samp>
(__last__ coll)<br>
</samp>

---

Returns the last item in `coll` in linear time.

`peek` is much faster than `last` for a vector.

---

Example:

```clj
(last [1 2 3])
;;=> 3

(last [1 2])
;;=> 2

(last [1])
;;=> 1

(last [])
;;=> nil
```

---

See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/next`](cljs.core_next.md)<br>
[`cljs.core/rest`](cljs.core_rest.md)<br>
[`cljs.core/butlast`](cljs.core_butlast.md)<br>
[`cljs.core/take-last`](cljs.core_take-last.md)<br>

---

Source docstring:

```
Return the last item in coll, in linear time
```

Source code:

```clj
(defn last
  [s]
  (let [sn (next s)]
    (if-not (nil? sn)
      (recur sn)
      (first s))))
```

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:752-758](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L752-L758)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/last"]))
```

```clj
{:description "Returns the last item in `coll` in linear time.\n\n`peek` is much faster than `last` for a vector.",
 :ns "cljs.core",
 :name "last",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/next"
           "cljs.core/rest"
           "cljs.core/butlast"
           "cljs.core/take-last"],
 :full-name-encode "cljs.core_last",
 :source {:code "(defn last\n  [s]\n  (let [sn (next s)]\n    (if-not (nil? sn)\n      (recur sn)\n      (first s))))",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [752 758]},
 :examples [{:id "eb0836",
             :content "```clj\n(last [1 2 3])\n;;=> 3\n\n(last [1 2])\n;;=> 2\n\n(last [1])\n;;=> 1\n\n(last [])\n;;=> nil\n```"}],
 :full-name "cljs.core/last",
 :clj-symbol "clojure.core/last",
 :docstring "Return the last item in coll, in linear time"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_last.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_last.cljsdoc)
</pre>

