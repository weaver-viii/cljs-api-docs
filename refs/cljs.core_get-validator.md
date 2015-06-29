## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get-validator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-validator</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-validator)
</td>
</tr>
</table>

 <samp>
(__get-validator__ a)<br>
</samp>

---

Returns the validator function for atom `a`.

---


See Also:

[`cljs.core/atom`](cljs.core_atom.md)<br>
[`cljs.core/set-validator!`](cljs.core_set-validatorBANG.md)<br>

---

Source docstring:

```
Gets the validator-fn for a var/ref/agent/atom.
```

Source code:

```clj
(defn get-validator
  [iref]
  (.-validator iref))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7120-7123](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/cljs/core.cljs#L7120-L7123)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get-validator"]))
```

```clj
{:description "Returns the validator function for atom `a`.",
 :ns "cljs.core",
 :name "get-validator",
 :signature ["[a]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/set-validator!"],
 :full-name-encode "cljs.core_get-validator",
 :source {:code "(defn get-validator\n  [iref]\n  (.-validator iref))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7120 7123]},
 :full-name "cljs.core/get-validator",
 :clj-symbol "clojure.core/get-validator",
 :docstring "Gets the validator-fn for a var/ref/agent/atom."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_get-validator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_get-validator.cljsdoc)
</pre>

