## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nil?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nil?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nil?)
</td>
</tr>
</table>

 <samp>
(__nil?__ x)<br>
</samp>

---

Returns true if `x` is nil, false otherwise.

---


See Also:

[`cljs.core/true?`](cljs.core_trueQMARK.md)<br>
[`cljs.core/false?`](cljs.core_falseQMARK.md)<br>
[`cljs.core/identity`](cljs.core_identity.md)<br>

---

Source docstring:

```
Returns true if x is nil, false otherwise.
```

Source code:

```clj
(defn ^boolean nil?
  [x]
  (coercive-= x nil))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:85-88](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L85-L88)</ins>
</pre>


---

```clj
(defmacro nil? [x]
  `(coercive-= ~x nil))
```

 <pre>
clojurescript @ r2665
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:257-258](https://github.com/clojure/clojurescript/blob/r2665/src/clj/cljs/core.clj#L257-L258)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nil?"]))
```

```clj
{:description "Returns true if `x` is nil, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "nil?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/false?" "cljs.core/identity"],
 :full-name-encode "cljs.core_nilQMARK",
 :source {:code "(defn ^boolean nil?\n  [x]\n  (coercive-= x nil))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [85 88]},
 :extra-sources ({:code "(defmacro nil? [x]\n  `(coercive-= ~x nil))",
                  :repo "clojurescript",
                  :tag "r2665",
                  :filename "src/clj/cljs/core.clj",
                  :lines [257 258]}),
 :full-name "cljs.core/nil?",
 :clj-symbol "clojure.core/nil?",
 :docstring "Returns true if x is nil, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nilQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nilQMARK.cljsdoc)
</pre>

