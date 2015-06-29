## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/true?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/true?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/true?)
</td>
</tr>
</table>

 <samp>
(__true?__ x)<br>
</samp>

---

Returns true if `x` is the value true, false otherwise.

---


See Also:

[`cljs.core/false?`](cljs.core_falseQMARK.md)<br>

---

Source docstring:

```
Returns true if x is the value true, false otherwise.
```

Source code:

```clj
(defn true?
  [x] (cljs.core/true? x))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:645-647](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L645-L647)</ins>
</pre>


---

```clj
(defmacro true? [x]
  (list 'js* "~{} === true" x))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:48-49](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/core.clj#L48-L49)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/true?"]))
```

```clj
{:description "Returns true if `x` is the value true, false otherwise.",
 :ns "cljs.core",
 :name "true?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/false?"],
 :full-name-encode "cljs.core_trueQMARK",
 :source {:code "(defn true?\n  [x] (cljs.core/true? x))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [645 647]},
 :extra-sources ({:code "(defmacro true? [x]\n  (list 'js* \"~{} === true\" x))",
                  :repo "clojurescript",
                  :tag "r993",
                  :filename "src/clj/cljs/core.clj",
                  :lines [48 49]}),
 :full-name "cljs.core/true?",
 :clj-symbol "clojure.core/true?",
 :docstring "Returns true if x is the value true, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_trueQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_trueQMARK.cljsdoc)
</pre>

