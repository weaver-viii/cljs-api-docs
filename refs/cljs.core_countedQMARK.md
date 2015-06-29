## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/counted?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/counted?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/counted?)
</td>
</tr>
</table>

 <samp>
(__counted?__ x)<br>
</samp>

---

Returns true if `x` executes `count` in constant time, false otherwise.

Lists, maps, sets, strings, and vectors can be counted in constant time.

---



Source docstring:

```
Returns true if coll implements count in constant time
```

Source code:

```clj
(defn ^boolean counted?
  [x] (satisfies? ICounted x))
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:678-680](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L678-L680)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/counted?"]))
```

```clj
{:description "Returns true if `x` executes `count` in constant time, false otherwise.\n\nLists, maps, sets, strings, and vectors can be counted in constant time.",
 :return-type boolean,
 :ns "cljs.core",
 :name "counted?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_countedQMARK",
 :source {:code "(defn ^boolean counted?\n  [x] (satisfies? ICounted x))",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [678 680]},
 :full-name "cljs.core/counted?",
 :clj-symbol "clojure.core/counted?",
 :docstring "Returns true if coll implements count in constant time"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_countedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_countedQMARK.cljsdoc)
</pre>

