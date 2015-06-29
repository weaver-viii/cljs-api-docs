## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/associative?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/associative?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/associative?)
</td>
</tr>
</table>

 <samp>
(__associative?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `IAssociative` protocol, false otherwise.

Maps and vectors are associative.

---

Example:

```clj
(associative? [1 2 3])
;;=> true

(associative? {:a 1 :b 2})
;;=> true

(associative? #{1 2 3})
;;=> false

(associative? '(1 2 3))
;;=> false
```

---


Source docstring:

```
Returns true if coll implements Associative
```

Source code:

```clj
(defn ^boolean associative?
  [x] (satisfies? IAssociative x))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1449-1451](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L1449-L1451)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/associative?"]))
```

```clj
{:description "Returns true if `coll` implements the `IAssociative` protocol, false otherwise.\n\nMaps and vectors are associative.",
 :return-type boolean,
 :ns "cljs.core",
 :name "associative?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_associativeQMARK",
 :source {:code "(defn ^boolean associative?\n  [x] (satisfies? IAssociative x))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1449 1451]},
 :examples [{:id "29a37f",
             :content "```clj\n(associative? [1 2 3])\n;;=> true\n\n(associative? {:a 1 :b 2})\n;;=> true\n\n(associative? #{1 2 3})\n;;=> false\n\n(associative? '(1 2 3))\n;;=> false\n```"}],
 :full-name "cljs.core/associative?",
 :clj-symbol "clojure.core/associative?",
 :docstring "Returns true if coll implements Associative"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_associativeQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_associativeQMARK.cljsdoc)
</pre>

