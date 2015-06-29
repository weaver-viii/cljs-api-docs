## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pprint-indent

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-indent</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-indent)
</td>
</tr>
</table>

 <samp>
(__pprint-indent__ relative-to n)<br>
</samp>

---




Source docstring:

```
Create an indent at this point in the pretty printing stream. This defines how
following lines are indented. relative-to can be either :block or :current depending
whether the indent should be computed relative to the start of the logical block or
the current column position. n is an offset.

This function is intended for use when writing custom dispatch functions.

Output is sent to *out* which must be a pretty printing writer.
```

Source code:

```clj
(defn pprint-indent
  [relative-to n]
  (check-enumerated-arg relative-to #{:block :current})
  (indent *out* relative-to n))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:853-864](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.cljs#L853-L864)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-indent"]))
```

```clj
{:ns "cljs.pprint",
 :name "pprint-indent",
 :signature ["[relative-to n]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_pprint-indent",
 :source {:code "(defn pprint-indent\n  [relative-to n]\n  (check-enumerated-arg relative-to #{:block :current})\n  (indent *out* relative-to n))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [853 864]},
 :full-name "cljs.pprint/pprint-indent",
 :clj-symbol "clojure.pprint/pprint-indent",
 :docstring "Create an indent at this point in the pretty printing stream. This defines how\nfollowing lines are indented. relative-to can be either :block or :current depending\nwhether the indent should be computed relative to the start of the logical block or\nthe current column position. n is an offset.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pprint-indent.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pprint-indent.cljsdoc)
</pre>

