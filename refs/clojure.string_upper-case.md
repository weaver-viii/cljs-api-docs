## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/upper-case

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/upper-case</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/upper-case)
</td>
</tr>
</table>

 <samp>
(__upper-case__ s)<br>
</samp>

---

Converts string to all upper-case.

---



Source docstring:

```
Converts string to all upper-case.
```

Source code:

```clj
(defn upper-case
  [s]
  (. s (toUpperCase)))
```

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:53-56](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/string.cljs#L53-L56)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/upper-case"]))
```

```clj
{:description "Converts string to all upper-case.",
 :ns "clojure.string",
 :name "upper-case",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_upper-case",
 :source {:code "(defn upper-case\n  [s]\n  (. s (toUpperCase)))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/clojure/string.cljs",
          :lines [53 56]},
 :full-name "clojure.string/upper-case",
 :clj-symbol "clojure.string/upper-case",
 :docstring "Converts string to all upper-case."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_upper-case.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_upper-case.cljsdoc)
</pre>

