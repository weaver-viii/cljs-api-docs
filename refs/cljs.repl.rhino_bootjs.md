## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/bootjs

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^String bootjs (str "goog.require = function(rule){"
                         "Packages.clojure.lang.RT[\"var\"](\"cljs.repl.rhino\",\"goog-require\")"
                         ".invoke(rule);}"))
```

 <pre>
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:23-25](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/repl/rhino.clj#L23-L25)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/bootjs"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "bootjs",
 :type "var",
 :return-type String,
 :source {:code "(def ^String bootjs (str \"goog.require = function(rule){\"\n                         \"Packages.clojure.lang.RT[\\\"var\\\"](\\\"cljs.repl.rhino\\\",\\\"goog-require\\\")\"\n                         \".invoke(rule);}\"))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [23 25]},
 :full-name "cljs.repl.rhino/bootjs",
 :full-name-encode "cljs.repl.rhino_bootjs",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_bootjs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_bootjs.cljsdoc)
</pre>

