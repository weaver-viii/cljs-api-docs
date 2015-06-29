## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pop

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop)
</td>
</tr>
</table>

 <samp>
(__pop__ coll)<br>
</samp>

---

For a list, returns a new list without the first item.

For a vector, returns a new vector without the last item.

---

Example:

With vectors:

```clj
(pop [1 2 3])
;;=> [1 2]

(pop [1 2])
;;=> [1]

(pop [1])
;;=> []

(pop [])
;; Error: Can't pop empty vector
```

---
Example:

With lists:

```clj
(pop '(1 2 3))
;;=> (2 3)

(pop '(1 2))
;;=> (2)

(pop '(1))
;;=> ()

(pop '())
;; Error: Can't pop empty list
```

---

See Also:

[`cljs.core/peek`](cljs.core_peek.md)<br>
[`cljs.core/rest`](cljs.core_rest.md)<br>
[`cljs.core/conj`](cljs.core_conj.md)<br>

---

Source docstring:

```
For a list or queue, returns a new list/queue without the first
item, for a vector, returns a new vector without the last item.
Note - not the same as next/butlast.
```

Source code:

```clj
(defn pop
  [coll]
  (-pop coll))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:860-865](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L860-L865)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pop"]))
```

```clj
{:description "For a list, returns a new list without the first item.\n\nFor a vector, returns a new vector without the last item.",
 :ns "cljs.core",
 :name "pop",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/peek" "cljs.core/rest" "cljs.core/conj"],
 :full-name-encode "cljs.core_pop",
 :source {:code "(defn pop\n  [coll]\n  (-pop coll))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [860 865]},
 :examples [{:id "6bd9f7",
             :content "With vectors:\n\n```clj\n(pop [1 2 3])\n;;=> [1 2]\n\n(pop [1 2])\n;;=> [1]\n\n(pop [1])\n;;=> []\n\n(pop [])\n;; Error: Can't pop empty vector\n```"}
            {:id "81221f",
             :content "With lists:\n\n```clj\n(pop '(1 2 3))\n;;=> (2 3)\n\n(pop '(1 2))\n;;=> (2)\n\n(pop '(1))\n;;=> ()\n\n(pop '())\n;; Error: Can't pop empty list\n```"}],
 :full-name "cljs.core/pop",
 :clj-symbol "clojure.core/pop",
 :docstring "For a list or queue, returns a new list/queue without the first\nitem, for a vector, returns a new vector without the last item.\nNote - not the same as next/butlast."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pop.cljsdoc)
</pre>

