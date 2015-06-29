## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/char-code

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__char-code__ c)<br>
</samp>

---




Source docstring:

```
Convert char to int
```

Source code:

```clj
(defn char-code
  [c]
  (cond
    (number? c) c
    (and (string? c) (== (.-length c) 1)) (.charCodeAt c 0)
    :else (throw (js/Error. "Argument to char must be a character or number"))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:63-69](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/pprint.cljs#L63-L69)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/char-code"]))
```

```clj
{:ns "cljs.pprint",
 :name "char-code",
 :signature ["[c]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_char-code",
 :source {:code "(defn char-code\n  [c]\n  (cond\n    (number? c) c\n    (and (string? c) (== (.-length c) 1)) (.charCodeAt c 0)\n    :else (throw (js/Error. \"Argument to char must be a character or number\"))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [63 69]},
 :full-name "cljs.pprint/char-code",
 :docstring "Convert char to int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_char-code.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_char-code.cljsdoc)
</pre>

