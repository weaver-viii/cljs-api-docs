## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-int)
</td>
</tr>
</table>

 <samp>
(__rand-int__ n)<br>
</samp>

---

Returns a random integer between 0 inclusive and `n` exclusive.

---


See Also:

[`cljs.core/rand`](cljs.core_rand.md)<br>

---

Source docstring:

```
Returns a random integer between 0 (inclusive) and n (exclusive).
```

Source code:

```clj
(defn rand-int
  [n] (Math/floor (* (Math/random) n)))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7147-7149](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L7147-L7149)</ins>
</pre>


---

```clj
(defn rand-int
  [n] (fix (rand n)))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1642-1644](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L1642-L1644)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand-int"]))
```

```clj
{:description "Returns a random integer between 0 inclusive and `n` exclusive.",
 :ns "cljs.core",
 :name "rand-int",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand"],
 :full-name-encode "cljs.core_rand-int",
 :source {:code "(defn rand-int\n  [n] (Math/floor (* (Math/random) n)))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7147 7149]},
 :extra-sources ({:code "(defn rand-int\n  [n] (fix (rand n)))",
                  :repo "clojurescript",
                  :tag "r1889",
                  :filename "src/cljs/cljs/core.cljs",
                  :lines [1642 1644]}),
 :full-name "cljs.core/rand-int",
 :clj-symbol "clojure.core/rand-int",
 :docstring "Returns a random integer between 0 (inclusive) and n (exclusive)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rand-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rand-int.cljsdoc)
</pre>

