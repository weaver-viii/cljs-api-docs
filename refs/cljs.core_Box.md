## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Box

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Box</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Box.java)
</td>
</tr>
</table>

 <samp>
(__Box.__ val)<br>
</samp>

---





Source code:

```clj
(deftype Box [^:mutable val])
```

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4379](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L4379)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Box"]))
```

```clj
{:ns "cljs.core",
 :name "Box",
 :signature ["[val]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_Box",
 :source {:code "(deftype Box [^:mutable val])",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4379]},
 :full-name "cljs.core/Box",
 :clj-symbol "clojure.lang/Box"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Box.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Box.cljsdoc)
</pre>

