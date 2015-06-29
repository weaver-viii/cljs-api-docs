## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/getf

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__getf__ sym)<br>
</samp>

---




Source docstring:

```
Get the value of the field a named by the argument (which should be a keyword).
```

Source code:

```clj
(defmacro getf
  [sym]
  `(~sym @@~'this))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:27-30](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L27-L30)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/getf"]))
```

```clj
{:ns "cljs.pprint",
 :name "getf",
 :signature ["[sym]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_getf",
 :source {:code "(defmacro getf\n  [sym]\n  `(~sym @@~'this))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [27 30]},
 :full-name "cljs.pprint/getf",
 :docstring "Get the value of the field a named by the argument (which should be a keyword)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_getf.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_getf.cljsdoc)
</pre>

