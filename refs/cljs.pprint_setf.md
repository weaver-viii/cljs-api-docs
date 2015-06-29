## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/setf

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__setf__ sym new-val)<br>
</samp>

---




Source docstring:

```
Set the value of the field SYM to NEW-VAL
```

Source code:

```clj
(defmacro setf
  [sym new-val]
  `(swap! @~'this assoc ~sym ~new-val))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:34-37](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/pprint.clj#L34-L37)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/setf"]))
```

```clj
{:ns "cljs.pprint",
 :name "setf",
 :signature ["[sym new-val]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_setf",
 :source {:code "(defmacro setf\n  [sym new-val]\n  `(swap! @~'this assoc ~sym ~new-val))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [34 37]},
 :full-name "cljs.pprint/setf",
 :docstring "Set the value of the field SYM to NEW-VAL"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_setf.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_setf.cljsdoc)
</pre>

