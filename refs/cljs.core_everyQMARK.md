## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/every?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/every?)
</td>
</tr>
</table>

 <samp>
(__every?__ pred coll)<br>
</samp>

---

Returns true if `(pred x)` is logical true for every `x` in `coll`, else false.

---


See Also:

[`cljs.core/some`](cljs.core_some.md)<br>
[`cljs.core/not-any?`](cljs.core_not-anyQMARK.md)<br>

---

Source docstring:

```
Returns true if (pred x) is logical true for every x in coll, else
false.
```

Source code:

```clj
(defn ^boolean every?
  [pred coll]
  (cond
   (nil? (seq coll)) true
   (pred (first coll)) (recur pred (next coll))
   :else false))
```

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2397-2404](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L2397-L2404)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/every?"]))
```

```clj
{:description "Returns true if `(pred x)` is logical true for every `x` in `coll`, else false.",
 :return-type boolean,
 :ns "cljs.core",
 :name "every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/some" "cljs.core/not-any?"],
 :full-name-encode "cljs.core_everyQMARK",
 :source {:code "(defn ^boolean every?\n  [pred coll]\n  (cond\n   (nil? (seq coll)) true\n   (pred (first coll)) (recur pred (next coll))\n   :else false))",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2397 2404]},
 :full-name "cljs.core/every?",
 :clj-symbol "clojure.core/every?",
 :docstring "Returns true if (pred x) is logical true for every x in coll, else\nfalse."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_everyQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_everyQMARK.cljsdoc)
</pre>

