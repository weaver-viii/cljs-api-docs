## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/identity

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/identity</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/identity)
</td>
</tr>
</table>

 <samp>
(__identity__ x)<br>
</samp>

---

Returns its argument.

---


See Also:

[`cljs.core/nil?`](cljs.core_nilQMARK.md)<br>

---

Source docstring:

```
Returns its argument.
```

Source code:

```clj
(defn identity
  [x] x)
```

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2067-2069](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/core.cljs#L2067-L2069)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/identity"]))
```

```clj
{:description "Returns its argument.",
 :ns "cljs.core",
 :name "identity",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/nil?"],
 :full-name-encode "cljs.core_identity",
 :source {:code "(defn identity\n  [x] x)",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2067 2069]},
 :full-name "cljs.core/identity",
 :clj-symbol "clojure.core/identity",
 :docstring "Returns its argument."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_identity.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_identity.cljsdoc)
</pre>

