## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-byte

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-byte</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-byte)
</td>
</tr>
</table>

 <samp>
(__unchecked-byte__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-byte [x] x)
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1494](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1494)</ins>
</pre>


---

```clj
(defmacro unchecked-byte [x] x)
```

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:287](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L287)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-byte"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-byte",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-byte",
 :source {:code "(defn unchecked-byte [x] x)",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1494]},
 :extra-sources ({:code "(defmacro unchecked-byte [x] x)",
                  :repo "clojurescript",
                  :tag "r1843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [287]}),
 :full-name "cljs.core/unchecked-byte",
 :clj-symbol "clojure.core/unchecked-byte"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-byte.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-byte.cljsdoc)
</pre>

