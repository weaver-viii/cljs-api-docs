## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/is_proto_

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__is_proto___ x)<br>
</samp>

---





Source code:

```clj
(defn is_proto_
  [x]
  (identical? (.-prototype (.-constructor x)) x))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:117-119](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/cljs/core.cljs#L117-L119)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/is_proto_"]))
```

```clj
{:ns "cljs.core",
 :name "is_proto_",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn is_proto_\n  [x]\n  (identical? (.-prototype (.-constructor x)) x))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/cljs/core.cljs",
          :lines [117 119]},
 :full-name "cljs.core/is_proto_",
 :full-name-encode "cljs.core_is_proto_",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_is_proto_.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_is_proto_.cljsdoc)
</pre>

