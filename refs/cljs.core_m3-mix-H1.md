## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/m3-mix-H1

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__m3-mix-H1__ h1 k1)<br>
</samp>

---





Source code:

```clj
(defn ^number m3-mix-H1 [h1 k1]
  (int (-> (int h1) (bit-xor (int k1)) (int-rotate-left 13) (imul 5) (+ (int 0xe6546b64)))))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:685-686](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L685-L686)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-mix-H1"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-mix-H1",
 :signature ["[h1 k1]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_m3-mix-H1",
 :source {:code "(defn ^number m3-mix-H1 [h1 k1]\n  (int (-> (int h1) (bit-xor (int k1)) (int-rotate-left 13) (imul 5) (+ (int 0xe6546b64)))))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [685 686]},
 :full-name "cljs.core/m3-mix-H1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_m3-mix-H1.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_m3-mix-H1.cljsdoc)
</pre>

