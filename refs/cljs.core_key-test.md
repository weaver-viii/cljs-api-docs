## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key-test

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__key-test__ key other)<br>
</samp>

---





Source code:

```clj
(defn ^boolean key-test [key other]
  (cond
    (identical? key other) true
    (keyword-identical? key other) true
    :else (= key other)))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5904-5908](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L5904-L5908)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/key-test"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "key-test",
 :signature ["[key other]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core_key-test",
 :source {:code "(defn ^boolean key-test [key other]\n  (cond\n    (identical? key other) true\n    (keyword-identical? key other) true\n    :else (= key other)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5904 5908]},
 :full-name "cljs.core/key-test"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_key-test.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_key-test.cljsdoc)
</pre>

