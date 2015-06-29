## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.reflect/read-url-string

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def read-url-string (comp read-string url-decode))
```

 <pre>
clojurescript @ r2740
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:42](https://github.com/clojure/clojurescript/blob/r2740/src/clj/cljs/repl/reflect.clj#L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/read-url-string"]))
```

```clj
{:ns "cljs.repl.reflect",
 :name "read-url-string",
 :type "var",
 :source {:code "(def read-url-string (comp read-string url-decode))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [42]},
 :full-name "cljs.repl.reflect/read-url-string",
 :full-name-encode "cljs.repl.reflect_read-url-string",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.reflect_read-url-string.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect_read-url-string.cljsdoc)
</pre>

