## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-any?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-any?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-any?)
</td>
</tr>
</table>

 <samp>
(__not-any?__ pred coll)<br>
</samp>

---

Returns false if `(pred x)` is logical true for any `x` in `coll`, else true.

---


See Also:

[`cljs.core/every?`](cljs.core_everyQMARK.md)<br>
[`cljs.core/some`](cljs.core_some.md)<br>

---

Source docstring:

```
Returns false if (pred x) is logical true for any x in coll,
else true.
```

Source code:

```clj
(defn not-any?
  [pred coll] (not (some pred coll)))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1426-1429](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1426-L1429)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not-any?"]))
```

```clj
{:description "Returns false if `(pred x)` is logical true for any `x` in `coll`, else true.",
 :ns "cljs.core",
 :name "not-any?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every?" "cljs.core/some"],
 :full-name-encode "cljs.core_not-anyQMARK",
 :source {:code "(defn not-any?\n  [pred coll] (not (some pred coll)))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1426 1429]},
 :full-name "cljs.core/not-any?",
 :clj-symbol "clojure.core/not-any?",
 :docstring "Returns false if (pred x) is logical true for any x in coll,\nelse true."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_not-anyQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_not-anyQMARK.cljsdoc)
</pre>

