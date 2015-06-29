## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/m3-hash-int

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__m3-hash-int__ in)<br>
</samp>

---





Source code:

```clj
(defn ^number m3-hash-int [in]
  (if (zero? in)
    in
    (let [k1 (m3-mix-K1 in)
          h1 (m3-mix-H1 m3-seed k1)]
      (m3-fmix h1 4))))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:697-702](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L697-L702)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-hash-int"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-hash-int",
 :signature ["[in]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_m3-hash-int",
 :source {:code "(defn ^number m3-hash-int [in]\n  (if (zero? in)\n    in\n    (let [k1 (m3-mix-K1 in)\n          h1 (m3-mix-H1 m3-seed k1)]\n      (m3-fmix h1 4))))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [697 702]},
 :full-name "cljs.core/m3-hash-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_m3-hash-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_m3-hash-int.cljsdoc)
</pre>

