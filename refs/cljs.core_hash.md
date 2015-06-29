## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash)
</td>
</tr>
</table>

 <samp>
(__hash__ o)<br>
</samp>
 <samp>
(__hash__ o check-cache)<br>
</samp>

---





Source code:

```clj
(defn hash
  ([o] (hash o true))
  ([o ^boolean check-cache]
     (if (and ^boolean (goog/isString o) check-cache)
       (check-string-hash-cache o)
       (-hash o))))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:898-903](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L898-L903)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash"]))
```

```clj
{:ns "cljs.core",
 :name "hash",
 :signature ["[o]" "[o check-cache]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_hash",
 :source {:code "(defn hash\n  ([o] (hash o true))\n  ([o ^boolean check-cache]\n     (if (and ^boolean (goog/isString o) check-cache)\n       (check-string-hash-cache o)\n       (-hash o))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [898 903]},
 :full-name "cljs.core/hash",
 :clj-symbol "clojure.core/hash"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash.cljsdoc)
</pre>

