## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/false?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>

 <samp>
(__false?__ x)<br>
</samp>

---

Returns true if `x` is the value false, false otherwise.

---


See Also:

[`cljs.core/true?`](cljs.core_trueQMARK.md)<br>
[`cljs.core/not`](cljs.core_not.md)<br>

---

Source docstring:

```
Returns true if x is the value false, false otherwise.
```

Source code:

```clj
(defn false?
  [x] (js* "~{x} === false"))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:604-606](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L604-L606)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/false?"]))
```

```clj
{:description "Returns true if `x` is the value false, false otherwise.",
 :ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/not"],
 :full-name-encode "cljs.core_falseQMARK",
 :source {:code "(defn false?\n  [x] (js* \"~{x} === false\"))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [604 606]},
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_falseQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_falseQMARK.cljsdoc)
</pre>

