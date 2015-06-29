## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/blank?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/blank?</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/blank?)
</td>
</tr>
</table>

 <samp>
(__blank?__ s)<br>
</samp>

---

True if `s` is nil, empty, or contains only whitespace.

---



Source docstring:

```
True is s is nil, empty, or contains only whitespace.
```

Source code:

```clj
(defn blank?
  [s]
  (gstring/isEmptySafe s))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:159-162](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/clojure/string.cljs#L159-L162)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/blank?"]))
```

```clj
{:description "True if `s` is nil, empty, or contains only whitespace.",
 :ns "clojure.string",
 :name "blank?",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_blankQMARK",
 :source {:code "(defn blank?\n  [s]\n  (gstring/isEmptySafe s))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/clojure/string.cljs",
          :lines [159 162]},
 :full-name "clojure.string/blank?",
 :clj-symbol "clojure.string/blank?",
 :docstring "True is s is nil, empty, or contains only whitespace."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_blankQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_blankQMARK.cljsdoc)
</pre>

