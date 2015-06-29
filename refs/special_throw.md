## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/throw

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/throw</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/throw)
</td>
</tr>
</table>

 <samp>
(__throw__ expr)<br>
</samp>

---

`expr` is evaluated and thrown, hopefully to be caught by a `try` expression.

`(throw (js/Error. "Oops!"))`

---


See Also:

[`special/try`](special_try.md)<br>
[`special/catch`](special_catch.md)<br>
[`special/finally`](special_finally.md)<br>

---


Source code:

```clj
(defmethod parse 'throw
  [op env [_ throw :as form] name]
  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]
    {:env env :op :throw :form form
     :throw throw-expr
     :children [throw-expr]}))
```

 <pre>
clojurescript @ r1835
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:243-248](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/analyzer.clj#L243-L248)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/throw"]))
```

```clj
{:description "`expr` is evaluated and thrown, hopefully to be caught by a `try` expression.\n\n`(throw (js/Error. \"Oops!\"))`",
 :ns "special",
 :name "throw",
 :signature ["[expr]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/catch" "special/finally"],
 :full-name-encode "special_throw",
 :source {:code "(defmethod parse 'throw\n  [op env [_ throw :as form] name]\n  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]\n    {:env env :op :throw :form form\n     :throw throw-expr\n     :children [throw-expr]}))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [243 248]},
 :full-name "special/throw",
 :clj-symbol "clojure.core/throw"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_throw.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_throw.cljsdoc)
</pre>

