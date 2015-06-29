## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/js-src->cljs-src

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-src->cljs-src__ f)<br>
</samp>

---




Source docstring:

```
Map a JavaScript output file back to the original ClojureScript source
file.
```

Source code:

```clj
(defn ^File js-src->cljs-src
  [f]
  (let [f (io/file f)
        dir (.getParentFile f)
        name (.getName f)]
    (io/file dir (string/replace name ".js" ".cljs"))))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:206-213](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/repl.clj#L206-L213)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/js-src->cljs-src"]))
```

```clj
{:return-type File,
 :ns "cljs.repl",
 :name "js-src->cljs-src",
 :signature ["[f]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl_js-src-GTcljs-src",
 :source {:code "(defn ^File js-src->cljs-src\n  [f]\n  (let [f (io/file f)\n        dir (.getParentFile f)\n        name (.getName f)]\n    (io/file dir (string/replace name \".js\" \".cljs\"))))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/repl.clj",
          :lines [206 213]},
 :full-name "cljs.repl/js-src->cljs-src",
 :docstring "Map a JavaScript output file back to the original ClojureScript source\nfile."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_js-src-GTcljs-src.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_js-src-GTcljs-src.cljsdoc)
</pre>

