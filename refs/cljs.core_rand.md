## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand)
</td>
</tr>
</table>

 <samp>
(__rand__)<br>
</samp>
 <samp>
(__rand__ n)<br>
</samp>

---

Returns a random floating point number between 0 inclusive and `n` exclusive.

`n` defaults to 1.

---


See Also:

[`cljs.core/rand-int`](cljs.core_rand-int.md)<br>
[`cljs.core/rand-nth`](cljs.core_rand-nth.md)<br>

---

Source docstring:

```
Returns a random floating point number between 0 (inclusive) and
n (default 1) (exclusive).
```

Source code:

```clj
(defn rand
  ([] (rand 1))
  ([n] (js* "Math.random() * ~{n}")))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6113-6117](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6113-L6117)</ins>
</pre>


---

```clj
(defn rand
  ([]  (Math/random))
  ([n] (* n (rand))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1151-1154](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1151-L1154)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand"]))
```

```clj
{:description "Returns a random floating point number between 0 inclusive and `n` exclusive.\n\n`n` defaults to 1.",
 :ns "cljs.core",
 :name "rand",
 :signature ["[]" "[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand-int" "cljs.core/rand-nth"],
 :full-name-encode "cljs.core_rand",
 :source {:code "(defn rand\n  ([] (rand 1))\n  ([n] (js* \"Math.random() * ~{n}\")))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6113 6117]},
 :extra-sources ({:code "(defn rand\n  ([]  (Math/random))\n  ([n] (* n (rand))))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/cljs/cljs/core.cljs",
                  :lines [1151 1154]}),
 :full-name "cljs.core/rand",
 :clj-symbol "clojure.core/rand",
 :docstring "Returns a random floating point number between 0 (inclusive) and\nn (default 1) (exclusive)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rand.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rand.cljsdoc)
</pre>
