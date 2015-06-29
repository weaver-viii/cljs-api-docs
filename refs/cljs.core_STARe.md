## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*e

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*e</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*e)
</td>
</tr>
</table>


Only usable from a REPL.

Holds the result of the last exception.

---

Example:

```clj
(defn cause-error []
  (throw "Error: something went wrong"))

(cause-error)
;; Error: something went wrong

*e
;;=> "Error: something went wrong"
```

---

See Also:

[`cljs.core/*1`](cljs.core_STAR1.md)<br>
[`cljs.core/*2`](cljs.core_STAR2.md)<br>
[`cljs.core/*3`](cljs.core_STAR3.md)<br>

---

Source docstring:

```
bound in a repl thread to the most recent exception caught by the repl
```

Source code:

```clj
(def
  ^{:doc "bound in a repl thread to the most recent exception caught by the repl"}
  *e)
```

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:130-132](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/core.cljs#L130-L132)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*e"]))
```

```clj
{:description "Only usable from a REPL.\n\nHolds the result of the last exception.",
 :ns "cljs.core",
 :name "*e",
 :history [["+" "0.0-2814"]],
 :type "var",
 :related ["cljs.core/*1" "cljs.core/*2" "cljs.core/*3"],
 :full-name-encode "cljs.core_STARe",
 :source {:code "(def\n  ^{:doc \"bound in a repl thread to the most recent exception caught by the repl\"}\n  *e)",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/core.cljs",
          :lines [130 132]},
 :examples [{:id "bea858",
             :content "```clj\n(defn cause-error []\n  (throw \"Error: something went wrong\"))\n\n(cause-error)\n;; Error: something went wrong\n\n*e\n;;=> \"Error: something went wrong\"\n```"}],
 :full-name "cljs.core/*e",
 :clj-symbol "clojure.core/*e",
 :docstring "bound in a repl thread to the most recent exception caught by the repl"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARe.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARe.cljsdoc)
</pre>

