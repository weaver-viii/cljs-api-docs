## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/inc

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/inc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/inc)
</td>
</tr>
</table>

 <samp>
(__inc__ x)<br>
</samp>

---

Returns a number one greater than `x`.

---


See Also:

[`cljs.core/dec`](cljs.core_dec.md)<br>

---

Source docstring:

```
Returns a number one greater than num.
```

Source code:

```clj
(defn inc
  [x] (cljs.core/+ x 1))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:592-594](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L592-L594)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric inc [x]
  `(+ ~x 1))
```

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:438-439](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L438-L439)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/inc"]))
```

```clj
{:description "Returns a number one greater than `x`.",
 :ns "cljs.core",
 :name "inc",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/dec"],
 :full-name-encode "cljs.core_inc",
 :source {:code "(defn inc\n  [x] (cljs.core/+ x 1))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [592 594]},
 :extra-sources ({:code "(defmacro ^::ana/numeric inc [x]\n  `(+ ~x 1))",
                  :repo "clojurescript",
                  :tag "r2067",
                  :filename "src/clj/cljs/core.clj",
                  :lines [438 439]}),
 :full-name "cljs.core/inc",
 :clj-symbol "clojure.core/inc",
 :docstring "Returns a number one greater than num."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_inc.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_inc.cljsdoc)
</pre>

