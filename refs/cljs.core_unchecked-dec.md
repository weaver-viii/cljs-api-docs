## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-dec

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec)
</td>
</tr>
</table>

 <samp>
(__unchecked-dec__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-dec [x]
  (cljs.core/unchecked-dec x))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1969-1970](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L1969-L1970)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-dec
  ([x] `(dec ~x)))
```

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:378-379](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/core.clj#L378-L379)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-dec"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-dec",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-dec",
 :source {:code "(defn unchecked-dec [x]\n  (cljs.core/unchecked-dec x))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1969 1970]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-dec\n  ([x] `(dec ~x)))",
                  :repo "clojurescript",
                  :tag "r2725",
                  :filename "src/clj/cljs/core.clj",
                  :lines [378 379]}),
 :full-name "cljs.core/unchecked-dec",
 :clj-symbol "clojure.core/unchecked-dec"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-dec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-dec.cljsdoc)
</pre>

