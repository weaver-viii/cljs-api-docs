## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/doc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__doc__ sym)<br>
</samp>

---




Source docstring:

```
Queries the reflection api with a fully qualified symbol, then prints
documentation information at the repl.
```

Source code:

```clj
(defn doc
  [sym]
  (meta sym print-doc))
```

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:44-48](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/clojure/reflect.cljs#L44-L48)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/doc"]))
```

```clj
{:ns "clojure.reflect",
 :name "doc",
 :signature ["[sym]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect_doc",
 :source {:code "(defn doc\n  [sym]\n  (meta sym print-doc))",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/clojure/reflect.cljs",
          :lines [44 48]},
 :full-name "clojure.reflect/doc",
 :docstring "Queries the reflection api with a fully qualified symbol, then prints\ndocumentation information at the repl."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.reflect_doc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect_doc.cljsdoc)
</pre>

