## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ifn?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ifn?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ifn?)
</td>
</tr>
</table>

 <samp>
(__ifn?__ f)<br>
</samp>

---

Returns true if `f` implements the `IFn` protocol, false otherwise.

Functions, keywords, map, sets, and vectors can be called as functions.

---


See Also:

[`cljs.core/fn?`](cljs.core_fnQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean ifn? [f]
  (or (fn? f) (satisfies? IFn f)))
```

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1190-1191](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L1190-L1191)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ifn?"]))
```

```clj
{:description "Returns true if `f` implements the `IFn` protocol, false otherwise.\n\nFunctions, keywords, map, sets, and vectors can be called as functions.",
 :return-type boolean,
 :ns "cljs.core",
 :name "ifn?",
 :signature ["[f]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/fn?"],
 :full-name-encode "cljs.core_ifnQMARK",
 :source {:code "(defn ^boolean ifn? [f]\n  (or (fn? f) (satisfies? IFn f)))",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1190 1191]},
 :full-name "cljs.core/ifn?",
 :clj-symbol "clojure.core/ifn?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ifnQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ifnQMARK.cljsdoc)
</pre>

