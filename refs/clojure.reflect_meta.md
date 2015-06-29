## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__meta__ sym cb)<br>
</samp>

---




Source docstring:

```
Queries the reflection api with a fully qualified symbol, then calls
callback fn cb with the evaluated cljs map containing that symbol's
meta information.
```

Source code:

```clj
(defn meta
  [sym cb]
  (query-reflection (str "var=" (js/encodeURIComponent (str sym)))
                    #(cb (evaluate-javascript %))))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:25-31](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/reflect.cljs#L25-L31)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/meta"]))
```

```clj
{:ns "clojure.reflect",
 :name "meta",
 :signature ["[sym cb]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect_meta",
 :source {:code "(defn meta\n  [sym cb]\n  (query-reflection (str \"var=\" (js/encodeURIComponent (str sym)))\n                    #(cb (evaluate-javascript %))))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/clojure/reflect.cljs",
          :lines [25 31]},
 :full-name "clojure.reflect/meta",
 :docstring "Queries the reflection api with a fully qualified symbol, then calls\ncallback fn cb with the evaluated cljs map containing that symbol's\nmeta information."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.reflect_meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect_meta.cljsdoc)
</pre>

