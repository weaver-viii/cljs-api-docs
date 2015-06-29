## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-char</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-char)
</td>
</tr>
</table>

 <samp>
(__unchecked-char__ x)<br>
</samp>

---





Source code:

```clj
(defn unchecked-char [x] x)
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1540](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L1540)</ins>
</pre>


---

```clj
(defmacro unchecked-char [x] x)
```

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:342](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L342)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-char"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-char",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-char",
 :source {:code "(defn unchecked-char [x] x)",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1540]},
 :extra-sources ({:code "(defmacro unchecked-char [x] x)",
                  :repo "clojurescript",
                  :tag "r2067",
                  :filename "src/clj/cljs/core.clj",
                  :lines [342]}),
 :full-name "cljs.core/unchecked-char",
 :clj-symbol "clojure.core/unchecked-char"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-char.cljsdoc)
</pre>

