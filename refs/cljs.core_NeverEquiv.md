## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/NeverEquiv

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__NeverEquiv.__)<br>
</samp>

---





Source code:

```clj
(deftype NeverEquiv []
  IEquiv
  (-equiv [o other] false))
```

 <pre>
clojurescript @ r2014
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3807-3809](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L3807-L3809)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/NeverEquiv"]))
```

```clj
{:ns "cljs.core",
 :name "NeverEquiv",
 :type "type",
 :signature ["[]"],
 :source {:code "(deftype NeverEquiv []\n  IEquiv\n  (-equiv [o other] false))",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3807 3809]},
 :full-name "cljs.core/NeverEquiv",
 :full-name-encode "cljs.core_NeverEquiv",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_NeverEquiv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_NeverEquiv.cljsdoc)
</pre>

