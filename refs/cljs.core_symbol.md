## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol)
</td>
</tr>
</table>

 <samp>
(__symbol__ name)<br>
</samp>
 <samp>
(__symbol__ ns name)<br>
</samp>

---





Source code:

```clj
(defn symbol
  ([name]
     (if (symbol? name)
       name
       (symbol nil name)))
  ([ns name]
     (let [sym-str (if-not (nil? ns)
                     (str ns "/" name)
                     name)]
       (Symbol. ns name sym-str nil nil))))
```

 <pre>
clojurescript @ r2024
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:411-420](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L411-L420)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol"]))
```

```clj
{:ns "cljs.core",
 :name "symbol",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbol",
 :source {:code "(defn symbol\n  ([name]\n     (if (symbol? name)\n       name\n       (symbol nil name)))\n  ([ns name]\n     (let [sym-str (if-not (nil? ns)\n                     (str ns \"/\" name)\n                     name)]\n       (Symbol. ns name sym-str nil nil))))",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/cljs/cljs/core.cljs",
          :lines [411 420]},
 :full-name "cljs.core/symbol",
 :clj-symbol "clojure.core/symbol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_symbol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_symbol.cljsdoc)
</pre>

