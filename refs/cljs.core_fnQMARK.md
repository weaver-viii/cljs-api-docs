## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fn?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fn?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fn?)
</td>
</tr>
</table>

 <samp>
(__fn?__ f)<br>
</samp>

---

Returns true if `f` is a function, false otherwise.

---


See Also:

[`cljs.core/ifn?`](cljs.core_ifnQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean fn? [f]
  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1038-1039](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L1038-L1039)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fn?"]))
```

```clj
{:description "Returns true if `f` is a function, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "fn?",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ifn?"],
 :full-name-encode "cljs.core_fnQMARK",
 :source {:code "(defn ^boolean fn? [f]\n  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1038 1039]},
 :full-name "cljs.core/fn?",
 :clj-symbol "clojure.core/fn?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_fnQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_fnQMARK.cljsdoc)
</pre>

