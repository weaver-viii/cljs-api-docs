## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IComparable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for values that can be compared.
```

Source code:

```clj
(defprotocol IComparable
  "Protocol for values that can be compared."
  (^number -compare [x y]
    "Returns a negative number, zero, or a positive number when x is logically
     'less than', 'equal to', or 'greater than' y."))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:584-588](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L584-L588)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IComparable"]))
```

```clj
{:ns "cljs.core",
 :name "IComparable",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core_IComparable",
 :source {:code "(defprotocol IComparable\n  \"Protocol for values that can be compared.\"\n  (^number -compare [x y]\n    \"Returns a negative number, zero, or a positive number when x is logically\n     'less than', 'equal to', or 'greater than' y.\"))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [584 588]},
 :methods [{:name "-compare",
            :signature ["[x y]"],
            :docstring "Returns a negative number, zero, or a positive number when x is logically\n     'less than', 'equal to', or 'greater than' y."}],
 :full-name "cljs.core/IComparable",
 :docstring "Protocol for values that can be compared."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IComparable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IComparable.cljsdoc)
</pre>

