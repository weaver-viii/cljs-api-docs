## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/monoid

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__monoid__ op ctor)<br>
</samp>

---




Source docstring:

```
Builds a combining fn out of the supplied operator and identity
constructor. op must be associative and ctor called with no args
must return an identity value for it.
```

Source code:

```clj
(defn monoid
  [op ctor]
  (fn m
    ([] (ctor))
    ([a b] (op a b))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:233-240](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/core/reducers.cljs#L233-L240)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/monoid"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "monoid",
 :signature ["[op ctor]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_monoid",
 :source {:code "(defn monoid\n  [op ctor]\n  (fn m\n    ([] (ctor))\n    ([a b] (op a b))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [233 240]},
 :full-name "clojure.core.reducers/monoid",
 :docstring "Builds a combining fn out of the supplied operator and identity\nconstructor. op must be associative and ctor called with no args\nmust return an identity value for it."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_monoid.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_monoid.cljsdoc)
</pre>

