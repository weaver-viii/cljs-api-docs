## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/edit

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/edit</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/edit)
</td>
</tr>
</table>

 <samp>
(__edit__ loc f & args)<br>
</samp>

---




Source docstring:

```
Replaces the node at this loc with the value of (f node args)
```

Source code:

```clj
(defn edit
  [loc f & args]
    (replace loc (apply f (node loc) args)))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:189-192](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/zip.cljs#L189-L192)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/edit"]))
```

```clj
{:ns "clojure.zip",
 :name "edit",
 :signature ["[loc f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_edit",
 :source {:code "(defn edit\n  [loc f & args]\n    (replace loc (apply f (node loc) args)))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [189 192]},
 :full-name "clojure.zip/edit",
 :clj-symbol "clojure.zip/edit",
 :docstring "Replaces the node at this loc with the value of (f node args)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_edit.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_edit.cljsdoc)
</pre>

