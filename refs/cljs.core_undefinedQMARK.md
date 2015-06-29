## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/undefined?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__undefined?__ x)<br>
</samp>

---





Source code:

```clj
(defn ^boolean undefined? [x]
  (cljs.core/undefined? x))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1593-1594](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L1593-L1594)</ins>
</pre>


---

```clj
(defmacro undefined? [x]
  (bool-expr (core/list 'js* "(void 0 === ~{})" x)))
```

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:316-317](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/core.clj#L316-L317)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/undefined?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "undefined?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_undefinedQMARK",
 :source {:code "(defn ^boolean undefined? [x]\n  (cljs.core/undefined? x))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1593 1594]},
 :extra-sources ({:code "(defmacro undefined? [x]\n  (bool-expr (core/list 'js* \"(void 0 === ~{})\" x)))",
                  :repo "clojurescript",
                  :tag "r2913",
                  :filename "src/clj/cljs/core.clj",
                  :lines [316 317]}),
 :full-name "cljs.core/undefined?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_undefinedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_undefinedQMARK.cljsdoc)
</pre>

