## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seqable?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__seqable?__ s)<br>
</samp>

---




Source docstring:

```
Return true if s satisfies ISeqable
```

Source code:

```clj
(defn ^boolean seqable?
  [s]
  (satisfies? ISeqable s))
```

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1458-1461](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L1458-L1461)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seqable?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "seqable?",
 :signature ["[s]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_seqableQMARK",
 :source {:code "(defn ^boolean seqable?\n  [s]\n  (satisfies? ISeqable s))",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1458 1461]},
 :full-name "cljs.core/seqable?",
 :docstring "Return true if s satisfies ISeqable"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_seqableQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_seqableQMARK.cljsdoc)
</pre>

