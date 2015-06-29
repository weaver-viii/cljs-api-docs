## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/spread

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__spread__ arglist)<br>
</samp>

---





Source code:

```clj
(defn spread
  [arglist]
  (cond
   (nil? arglist) nil
   (nil? (next arglist)) (seq (first arglist))
   :else (cons (first arglist)
               (spread (next arglist)))))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2865-2871](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L2865-L2871)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/spread"]))
```

```clj
{:ns "cljs.core",
 :name "spread",
 :type "function",
 :signature ["[arglist]"],
 :source {:code "(defn spread\n  [arglist]\n  (cond\n   (nil? arglist) nil\n   (nil? (next arglist)) (seq (first arglist))\n   :else (cons (first arglist)\n               (spread (next arglist)))))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2865 2871]},
 :full-name "cljs.core/spread",
 :full-name-encode "cljs.core_spread",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_spread.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_spread.cljsdoc)
</pre>

