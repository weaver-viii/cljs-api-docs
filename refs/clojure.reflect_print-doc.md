## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/print-doc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__print-doc__ {:keys \[name method-params doc\]})<br>
</samp>

---





Source code:

```clj
(defn print-doc [{:keys [name method-params doc]}]
  (when-not (empty? name)
    (println name)
    (println method-params)
    (println doc)))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:38-42](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/reflect.cljs#L38-L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/print-doc"]))
```

```clj
{:ns "clojure.reflect",
 :name "print-doc",
 :type "function",
 :signature ["[{:keys [name method-params doc]}]"],
 :source {:code "(defn print-doc [{:keys [name method-params doc]}]\n  (when-not (empty? name)\n    (println name)\n    (println method-params)\n    (println doc)))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/clojure/reflect.cljs",
          :lines [38 42]},
 :full-name "clojure.reflect/print-doc",
 :full-name-encode "clojure.reflect_print-doc",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.reflect_print-doc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect_print-doc.cljsdoc)
</pre>

