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
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1433](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1433)</ins>
</pre>


---

```clj
(defmacro unchecked-char [x] x)
```

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:276](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L276)</ins>
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
          :tag "r1803",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1433]},
 :extra-sources ({:code "(defmacro unchecked-char [x] x)",
                  :repo "clojurescript",
                  :tag "r1803",
                  :filename "src/clj/cljs/core.clj",
                  :lines [276]}),
 :full-name "cljs.core/unchecked-char",
 :clj-symbol "clojure.core/unchecked-char"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-char.cljsdoc)
</pre>

