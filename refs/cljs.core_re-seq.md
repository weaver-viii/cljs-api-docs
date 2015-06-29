## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-seq)
</td>
</tr>
</table>

 <samp>
(__re-seq__ re s)<br>
</samp>

---

Returns a lazy sequence of successive matches of regex `re` in string `s`.

---


See Also:

[`cljs.core/re-find`](cljs.core_re-find.md)<br>
[`cljs.core/re-pattern`](cljs.core_re-pattern.md)<br>
[`cljs.core/re-matches`](cljs.core_re-matches.md)<br>
[`cljs.core/subs`](cljs.core_subs.md)<br>
[`clojure.string/split`](clojure.string_split.md)<br>

---

Source docstring:

```
Returns a lazy sequence of successive matches of re in s.
```

Source code:

```clj
(defn re-seq
  [re s]
  (let [match-data (re-find re s)
        match-idx (.search s re)
        match-str (if (coll? match-data) (first match-data) match-data)
        post-match (subs s (+ match-idx (count match-str)))]
    (when match-data (lazy-seq (cons match-data (when (seq post-match) (re-seq re post-match)))))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8419-8426](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L8419-L8426)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-seq"]))
```

```clj
{:description "Returns a lazy sequence of successive matches of regex `re` in string `s`.",
 :ns "cljs.core",
 :name "re-seq",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/re-find"
           "cljs.core/re-pattern"
           "cljs.core/re-matches"
           "cljs.core/subs"
           "clojure.string/split"],
 :full-name-encode "cljs.core_re-seq",
 :source {:code "(defn re-seq\n  [re s]\n  (let [match-data (re-find re s)\n        match-idx (.search s re)\n        match-str (if (coll? match-data) (first match-data) match-data)\n        post-match (subs s (+ match-idx (count match-str)))]\n    (when match-data (lazy-seq (cons match-data (when (seq post-match) (re-seq re post-match)))))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8419 8426]},
 :full-name "cljs.core/re-seq",
 :clj-symbol "clojure.core/re-seq",
 :docstring "Returns a lazy sequence of successive matches of re in s."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_re-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_re-seq.cljsdoc)
</pre>

