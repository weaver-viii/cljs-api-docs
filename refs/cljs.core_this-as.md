## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/this-as

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__this-as__ name & body)<br>
</samp>

---




Source docstring:

```
Defines a scope where JavaScript's implicit "this" is bound to the name provided.
```

Source code:

```clj
(defmacro this-as
  [name & body]
  `(let [~name (js-this)]
     ~@body))
```

 <pre>
clojurescript @ r2069
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:606-610](https://github.com/clojure/clojurescript/blob/r2069/src/clj/cljs/core.clj#L606-L610)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/this-as"]))
```

```clj
{:ns "cljs.core",
 :name "this-as",
 :signature ["[name & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_this-as",
 :source {:code "(defmacro this-as\n  [name & body]\n  `(let [~name (js-this)]\n     ~@body))",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/clj/cljs/core.clj",
          :lines [606 610]},
 :full-name "cljs.core/this-as",
 :docstring "Defines a scope where JavaScript's implicit \"this\" is bound to the name provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_this-as.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_this-as.cljsdoc)
</pre>

