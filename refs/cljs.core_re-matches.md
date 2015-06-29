## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-matches

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-matches</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-matches)
</td>
</tr>
</table>

 <samp>
(__re-matches__ re s)<br>
</samp>

---

Returns the result of `(re-find re s)` if `re` fully matches `s`.

---



Source docstring:

```
Returns the result of (re-find re s) if re fully matches s.
```

Source code:

```clj
(defn re-matches
  [re s]
  (let [matches (.exec re s)]
    (when (= (first matches) s)
      (if (== (count matches) 1)
        (first matches)
        (vec matches)))))
```

 <pre>
clojurescript @ r1877
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6531-6538](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/cljs/core.cljs#L6531-L6538)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-matches"]))
```

```clj
{:description "Returns the result of `(re-find re s)` if `re` fully matches `s`.",
 :ns "cljs.core",
 :name "re-matches",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-matches",
 :source {:code "(defn re-matches\n  [re s]\n  (let [matches (.exec re s)]\n    (when (= (first matches) s)\n      (if (== (count matches) 1)\n        (first matches)\n        (vec matches)))))",
          :repo "clojurescript",
          :tag "r1877",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6531 6538]},
 :full-name "cljs.core/re-matches",
 :clj-symbol "clojure.core/re-matches",
 :docstring "Returns the result of (re-find re s) if re fully matches s."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_re-matches.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_re-matches.cljsdoc)
</pre>

