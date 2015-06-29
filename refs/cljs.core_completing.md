## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/completing

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__completing__ f)<br>
</samp>
 <samp>
(__completing__ f cf)<br>
</samp>

---





Source code:

```clj
(defn completing
  ([f] (completing f identity))
  ([f cf]
    (fn
      ([] (f))
      ([x] (cf x))
      ([x y] (f x y)))))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1812-1818](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L1812-L1818)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/completing"]))
```

```clj
{:ns "cljs.core",
 :name "completing",
 :type "function",
 :signature ["[f]" "[f cf]"],
 :source {:code "(defn completing\n  ([f] (completing f identity))\n  ([f cf]\n    (fn\n      ([] (f))\n      ([x] (cf x))\n      ([x y] (f x y)))))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1812 1818]},
 :full-name "cljs.core/completing",
 :full-name-encode "cljs.core_completing",
 :history [["+" "0.0-2341"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_completing.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_completing.cljsdoc)
</pre>

