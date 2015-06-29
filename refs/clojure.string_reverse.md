## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/reverse

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/reverse)
</td>
</tr>
</table>

 <samp>
(__reverse__ s)<br>
</samp>

---

Returns `s` with its characters reversed.

---



Source docstring:

```
Returns s with its characters reversed.
```

Source code:

```clj
(defn reverse
  [s]
  (-> (.replace s re-surrogate-pair "$2$1")
      (.. (split "") (reverse) (join ""))))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:21-25](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/string.cljs#L21-L25)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/reverse"]))
```

```clj
{:description "Returns `s` with its characters reversed.",
 :ns "clojure.string",
 :name "reverse",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_reverse",
 :source {:code "(defn reverse\n  [s]\n  (-> (.replace s re-surrogate-pair \"$2$1\")\n      (.. (split \"\") (reverse) (join \"\"))))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/string.cljs",
          :lines [21 25]},
 :full-name "clojure.string/reverse",
 :clj-symbol "clojure.string/reverse",
 :docstring "Returns s with its characters reversed."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_reverse.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_reverse.cljsdoc)
</pre>

