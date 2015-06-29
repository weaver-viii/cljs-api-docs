## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/m3-fmix

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__m3-fmix__ h1 len)<br>
</samp>

---





Source code:

```clj
(defn ^number m3-fmix [h1 len]
  (as-> (int h1) h1
    (bit-xor h1 len)
    (bit-xor h1 (unsigned-bit-shift-right h1 16))
    (imul h1 (int 0x85ebca6b))
    (bit-xor h1 (unsigned-bit-shift-right h1 13))
    (imul h1 (int 0xc2b2ae35))
    (bit-xor h1 (unsigned-bit-shift-right h1 16))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:688-695](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L688-L695)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-fmix"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-fmix",
 :signature ["[h1 len]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_m3-fmix",
 :source {:code "(defn ^number m3-fmix [h1 len]\n  (as-> (int h1) h1\n    (bit-xor h1 len)\n    (bit-xor h1 (unsigned-bit-shift-right h1 16))\n    (imul h1 (int 0x85ebca6b))\n    (bit-xor h1 (unsigned-bit-shift-right h1 13))\n    (imul h1 (int 0xc2b2ae35))\n    (bit-xor h1 (unsigned-bit-shift-right h1 16))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [688 695]},
 :full-name "cljs.core/m3-fmix"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_m3-fmix.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_m3-fmix.cljsdoc)
</pre>

