## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/macroexpand

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macroexpand__ form)<br>
</samp>

---




Source docstring:

```
Queries the reflection api with a quoted macro form, then calls the
callback function with the macroexpanded form, as a string.
```

Source code:

```clj
(defn macroexpand
  [form]
  (query-reflection (str "macroform=" (js/encodeURIComponent (str form))) println))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[reflect.cljs:33-37](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/clojure/reflect.cljs#L33-L37)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/macroexpand"]))
```

```clj
{:ns "clojure.reflect",
 :name "macroexpand",
 :signature ["[form]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect_macroexpand",
 :source {:code "(defn macroexpand\n  [form]\n  (query-reflection (str \"macroform=\" (js/encodeURIComponent (str form))) println))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/clojure/reflect.cljs",
          :lines [33 37]},
 :full-name "clojure.reflect/macroexpand",
 :docstring "Queries the reflection api with a quoted macro form, then calls the\ncallback function with the macroexpanded form, as a string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.reflect_macroexpand.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect_macroexpand.cljsdoc)
</pre>

