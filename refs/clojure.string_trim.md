## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/trim

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trim</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trim)
</td>
</tr>
</table>

 <samp>
(__trim__ s)<br>
</samp>

---

Removes whitespace from both ends of string.

---



Source docstring:

```
Removes whitespace from both ends of string.
```

Source code:

```clj
(defn trim
    [s]
    (gstring/trim s))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:147-150](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/string.cljs#L147-L150)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/trim"]))
```

```clj
{:description "Removes whitespace from both ends of string.",
 :ns "clojure.string",
 :name "trim",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_trim",
 :source {:code "(defn trim\n    [s]\n    (gstring/trim s))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/string.cljs",
          :lines [147 150]},
 :full-name "clojure.string/trim",
 :clj-symbol "clojure.string/trim",
 :docstring "Removes whitespace from both ends of string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_trim.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_trim.cljsdoc)
</pre>

