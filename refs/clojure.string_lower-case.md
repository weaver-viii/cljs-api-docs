## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/lower-case

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/lower-case</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/lower-case)
</td>
</tr>
</table>

 <samp>
(__lower-case__ s)<br>
</samp>

---

Converts string to all lower-case.

---



Source docstring:

```
Converts string to all lower-case.
```

Source code:

```clj
(defn lower-case
  [s]
  (.toLowerCase s))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:73-76](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/string.cljs#L73-L76)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/lower-case"]))
```

```clj
{:description "Converts string to all lower-case.",
 :ns "clojure.string",
 :name "lower-case",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_lower-case",
 :source {:code "(defn lower-case\n  [s]\n  (.toLowerCase s))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/clojure/string.cljs",
          :lines [73 76]},
 :full-name "clojure.string/lower-case",
 :clj-symbol "clojure.string/lower-case",
 :docstring "Converts string to all lower-case."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_lower-case.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_lower-case.cljsdoc)
</pre>

