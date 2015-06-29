## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/m3-hash-unencoded-chars

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__m3-hash-unencoded-chars__ in)<br>
</samp>

---





Source code:

```clj
(defn ^number m3-hash-unencoded-chars [in]
  (let [h1 (loop [i 1 h1 m3-seed]
             (if (< i (alength in))
               (recur (+ i 2)
                 (m3-mix-H1 h1
                   (m3-mix-K1
                     (bit-or (.charCodeAt in (dec i))
                       (bit-shift-left (.charCodeAt in i) 16)))))
               h1))
        h1 (if (== (bit-and (alength in) 1) 1)
             (bit-xor h1 (m3-mix-K1 (.charCodeAt in (dec (alength in)))))
             h1)]
    (m3-fmix h1 (imul 2 (alength in)))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:704-716](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L704-L716)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-hash-unencoded-chars"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-hash-unencoded-chars",
 :signature ["[in]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_m3-hash-unencoded-chars",
 :source {:code "(defn ^number m3-hash-unencoded-chars [in]\n  (let [h1 (loop [i 1 h1 m3-seed]\n             (if (< i (alength in))\n               (recur (+ i 2)\n                 (m3-mix-H1 h1\n                   (m3-mix-K1\n                     (bit-or (.charCodeAt in (dec i))\n                       (bit-shift-left (.charCodeAt in i) 16)))))\n               h1))\n        h1 (if (== (bit-and (alength in) 1) 1)\n             (bit-xor h1 (m3-mix-K1 (.charCodeAt in (dec (alength in)))))\n             h1)]\n    (m3-fmix h1 (imul 2 (alength in)))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [704 716]},
 :full-name "cljs.core/m3-hash-unencoded-chars"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_m3-hash-unencoded-chars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_m3-hash-unencoded-chars.cljsdoc)
</pre>

