## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-every?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-every?)
</td>
</tr>
</table>

 <samp>
(__not-every?__ pred coll)<br>
</samp>

---

Returns false if `(pred x)` is logical true for every `x` in `coll`, else true.

---


See Also:

[`cljs.core/every?`](cljs.core_everyQMARK.md)<br>
[`cljs.core/not-any?`](cljs.core_not-anyQMARK.md)<br>
[`cljs.core/some`](cljs.core_some.md)<br>

---

Source docstring:

```
Returns false if (pred x) is logical true for every x in
coll, else true.
```

Source code:

```clj
(defn ^boolean not-every?
  [pred coll] (not (every? pred coll)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3609-3612](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L3609-L3612)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not-every?"]))
```

```clj
{:description "Returns false if `(pred x)` is logical true for every `x` in `coll`, else true.",
 :return-type boolean,
 :ns "cljs.core",
 :name "not-every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every?" "cljs.core/not-any?" "cljs.core/some"],
 :full-name-encode "cljs.core_not-everyQMARK",
 :source {:code "(defn ^boolean not-every?\n  [pred coll] (not (every? pred coll)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3609 3612]},
 :full-name "cljs.core/not-every?",
 :clj-symbol "clojure.core/not-every?",
 :docstring "Returns false if (pred x) is logical true for every x in\ncoll, else true."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_not-everyQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_not-everyQMARK.cljsdoc)
</pre>

