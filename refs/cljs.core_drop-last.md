## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop-last

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-last)
</td>
</tr>
</table>

 <samp>
(__drop-last__ s)<br>
</samp>
 <samp>
(__drop-last__ n s)<br>
</samp>

---

Return a lazy sequence of all but the last `n` items in `s`.

`n` defaults to 1.

---


See Also:

[`cljs.core/drop`](cljs.core_drop.md)<br>
[`cljs.core/drop-while`](cljs.core_drop-while.md)<br>

---

Source docstring:

```
Return a lazy sequence of all but the last n (default 1) items in coll
```

Source code:

```clj
(defn drop-last
  ([s] (drop-last 1 s))
  ([n s] (map (fn [x _] x) s (drop n s))))
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2873-2876](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L2873-L2876)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/drop-last"]))
```

```clj
{:description "Return a lazy sequence of all but the last `n` items in `s`.\n\n`n` defaults to 1.",
 :ns "cljs.core",
 :name "drop-last",
 :signature ["[s]" "[n s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/drop" "cljs.core/drop-while"],
 :full-name-encode "cljs.core_drop-last",
 :source {:code "(defn drop-last\n  ([s] (drop-last 1 s))\n  ([n s] (map (fn [x _] x) s (drop n s))))",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2873 2876]},
 :full-name "cljs.core/drop-last",
 :clj-symbol "clojure.core/drop-last",
 :docstring "Return a lazy sequence of all but the last n (default 1) items in coll"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_drop-last.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_drop-last.cljsdoc)
</pre>

