## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/triml

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/triml</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/triml)
</td>
</tr>
</table>

 <samp>
(__triml__ s)<br>
</samp>

---

Removes whitespace from the left side of string.

---



Source docstring:

```
Removes whitespace from the left side of string.
```

Source code:

```clj
(defn triml
    [s]
    (gstring/trimLeft s))
```

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:137-140](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/clojure/string.cljs#L137-L140)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/triml"]))
```

```clj
{:description "Removes whitespace from the left side of string.",
 :ns "clojure.string",
 :name "triml",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_triml",
 :source {:code "(defn triml\n    [s]\n    (gstring/trimLeft s))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/clojure/string.cljs",
          :lines [137 140]},
 :full-name "clojure.string/triml",
 :clj-symbol "clojure.string/triml",
 :docstring "Removes whitespace from the left side of string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_triml.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_triml.cljsdoc)
</pre>

