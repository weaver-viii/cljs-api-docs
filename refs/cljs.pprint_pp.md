## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pp

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pp</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pp)
</td>
</tr>
</table>

 <samp>
(__pp__)<br>
</samp>

---




Source docstring:

```
A convenience macro that pretty prints the last thing output. This is
exactly equivalent to (pprint *1).
```

Source code:

```clj
(defmacro pp
  [] `(cljs.pprint/pprint *1))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:153-157](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L153-L157)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pp"]))
```

```clj
{:ns "cljs.pprint",
 :name "pp",
 :signature ["[]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_pp",
 :source {:code "(defmacro pp\n  [] `(cljs.pprint/pprint *1))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [153 157]},
 :full-name "cljs.pprint/pp",
 :clj-symbol "clojure.pprint/pp",
 :docstring "A convenience macro that pretty prints the last thing output. This is\nexactly equivalent to (pprint *1)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pp.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pp.cljsdoc)
</pre>

