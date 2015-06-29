## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/byte

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/byte</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/byte)
</td>
</tr>
</table>

 <samp>
(__byte__ x)<br>
</samp>

---





Source code:

```clj
(defn byte [x] x)
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1496](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1496)</ins>
</pre>


---

```clj
(defmacro byte [x] x)
```

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:334](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L334)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/byte"]))
```

```clj
{:ns "cljs.core",
 :name "byte",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_byte",
 :source {:code "(defn byte [x] x)",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1496]},
 :extra-sources ({:code "(defmacro byte [x] x)",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [334]}),
 :full-name "cljs.core/byte",
 :clj-symbol "clojure.core/byte"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_byte.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_byte.cljsdoc)
</pre>
