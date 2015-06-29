## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pprint-newline

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-newline)
</td>
</tr>
</table>

 <samp>
(__pprint-newline__ kind)<br>
</samp>

---




Source docstring:

```
Print a conditional newline to a pretty printing stream. kind specifies if the
newline is :linear, :miser, :fill, or :mandatory.

This function is intended for use when writing custom dispatch functions.

Output is sent to *out* which must be a pretty printing writer.
```

Source code:

```clj
(defn pprint-newline
  [kind]
  (check-enumerated-arg kind #{:linear :miser :fill :mandatory})
  (nl *out* kind))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:842-851](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.cljs#L842-L851)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-newline"]))
```

```clj
{:ns "cljs.pprint",
 :name "pprint-newline",
 :signature ["[kind]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_pprint-newline",
 :source {:code "(defn pprint-newline\n  [kind]\n  (check-enumerated-arg kind #{:linear :miser :fill :mandatory})\n  (nl *out* kind))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [842 851]},
 :full-name "cljs.pprint/pprint-newline",
 :clj-symbol "clojure.pprint/pprint-newline",
 :docstring "Print a conditional newline to a pretty printing stream. kind specifies if the\nnewline is :linear, :miser, :fill, or :mandatory.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pprint-newline.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pprint-newline.cljsdoc)
</pre>

