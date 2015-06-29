## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/m3-mix-K1

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__m3-mix-K1__ k1)<br>
</samp>

---





Source code:

```clj
(defn ^number m3-mix-K1 [k1]
  (-> k1 (imul m3-C1) (int-rotate-left 15) (imul m3-C2)))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:472-473](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L472-L473)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-mix-K1"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-mix-K1",
 :signature ["[k1]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_m3-mix-K1",
 :source {:code "(defn ^number m3-mix-K1 [k1]\n  (-> k1 (imul m3-C1) (int-rotate-left 15) (imul m3-C2)))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [472 473]},
 :full-name "cljs.core/m3-mix-K1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_m3-mix-K1.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_m3-mix-K1.cljsdoc)
</pre>

