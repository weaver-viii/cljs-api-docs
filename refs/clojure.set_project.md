## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/project

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/project</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/project)
</td>
</tr>
</table>

 <samp>
(__project__ xrel ks)<br>
</samp>

---




Source docstring:

```
Returns a rel of the elements of xrel with only the keys in ks
```

Source code:

```clj
(defn project
  [xrel ks]
    (set (map #(select-keys % ks) xrel)))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:67-70](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/set.cljs#L67-L70)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/project"]))
```

```clj
{:ns "clojure.set",
 :name "project",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_project",
 :source {:code "(defn project\n  [xrel ks]\n    (set (map #(select-keys % ks) xrel)))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/clojure/set.cljs",
          :lines [67 70]},
 :full-name "clojure.set/project",
 :clj-symbol "clojure.set/project",
 :docstring "Returns a rel of the elements of xrel with only the keys in ks"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_project.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_project.cljsdoc)
</pre>

