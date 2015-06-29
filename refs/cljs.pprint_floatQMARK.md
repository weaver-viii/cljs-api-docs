## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/float?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__float?__ n)<br>
</samp>

---




Source docstring:

```
Returns true if n is an float.
```

Source code:

```clj
(defn ^boolean float?
  [n]
  (and (number? n)
       (not ^boolean (js/isNaN n))
       (not (identical? n js/Infinity))
       (not (== (js/parseFloat n) (js/parseInt n 10)))))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:55-61](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L55-L61)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/float?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.pprint",
 :name "float?",
 :signature ["[n]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_floatQMARK",
 :source {:code "(defn ^boolean float?\n  [n]\n  (and (number? n)\n       (not ^boolean (js/isNaN n))\n       (not (identical? n js/Infinity))\n       (not (== (js/parseFloat n) (js/parseInt n 10)))))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [55 61]},
 :full-name "cljs.pprint/float?",
 :docstring "Returns true if n is an float."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_floatQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_floatQMARK.cljsdoc)
</pre>

