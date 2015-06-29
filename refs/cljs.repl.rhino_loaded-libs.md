## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.repl.rhino/loaded-libs~~

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[×] 0.0-1576" src="https://img.shields.io/badge/×-0.0--1576-red.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def loaded-libs (atom #{}))
```

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:20](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/rhino.clj#L20)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/loaded-libs"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "loaded-libs",
 :type "var",
 :source {:code "(def loaded-libs (atom #{}))",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [20]},
 :full-name "cljs.repl.rhino/loaded-libs",
 :full-name-encode "cljs.repl.rhino_loaded-libs",
 :history [["+" "0.0-927"] ["-" "0.0-1576"]],
 :removed {:in "0.0-1576", :last-seen "0.0-1552"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_loaded-libs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_loaded-libs.cljsdoc)
</pre>

