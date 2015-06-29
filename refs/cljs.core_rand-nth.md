## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand-nth

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-nth)
</td>
</tr>
</table>

 <samp>
(__rand-nth__ coll)<br>
</samp>

---

Returns a random element from a sequential collection `coll`.

Has the same performance characteristics as `nth`.

---


See Also:

[`cljs.core/rand`](cljs.core_rand.md)<br>

---

Source docstring:

```
Return a random element of the (sequential) collection. Will have
the same performance characteristics as nth for the given
collection.
```

Source code:

```clj
(defn rand-nth
  [coll]
  (nth coll (rand-int (count coll))))
```

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7278-7283](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L7278-L7283)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand-nth"]))
```

```clj
{:description "Returns a random element from a sequential collection `coll`.\n\nHas the same performance characteristics as `nth`.",
 :ns "cljs.core",
 :name "rand-nth",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand"],
 :full-name-encode "cljs.core_rand-nth",
 :source {:code "(defn rand-nth\n  [coll]\n  (nth coll (rand-int (count coll))))",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7278 7283]},
 :full-name "cljs.core/rand-nth",
 :clj-symbol "clojure.core/rand-nth",
 :docstring "Return a random element of the (sequential) collection. Will have\nthe same performance characteristics as nth for the given\ncollection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rand-nth.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rand-nth.cljsdoc)
</pre>

