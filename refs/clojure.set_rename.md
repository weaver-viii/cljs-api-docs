## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/rename

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/rename</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/rename)
</td>
</tr>
</table>

 <samp>
(__rename__ xrel kmap)<br>
</samp>

---




Source docstring:

```
Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap
```

Source code:

```clj
(defn rename
  [xrel kmap]
    (set (map #(rename-keys % kmap) xrel)))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:82-85](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/clojure/set.cljs#L82-L85)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/rename"]))
```

```clj
{:ns "clojure.set",
 :name "rename",
 :signature ["[xrel kmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_rename",
 :source {:code "(defn rename\n  [xrel kmap]\n    (set (map #(rename-keys % kmap) xrel)))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/clojure/set.cljs",
          :lines [82 85]},
 :full-name "clojure.set/rename",
 :clj-symbol "clojure.set/rename",
 :docstring "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_rename.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_rename.cljsdoc)
</pre>

