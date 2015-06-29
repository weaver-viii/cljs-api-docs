## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/format~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1885"><img valign="middle" alt="[×] 0.0-1885" src="https://img.shields.io/badge/×-0.0--1885-red.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/format</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/format)
</td>
</tr>
</table>

 <samp>
(__format__ fmt & args)<br>
</samp>

---




Source docstring:

```
Formats a string using goog.string.format.
```

Source code:

```clj
(defn format
  [fmt & args]
  (apply gstring/format fmt args))
```

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1771-1774](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L1771-L1774)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/format"]))
```

```clj
{:ns "cljs.core",
 :name "format",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"] ["-" "0.0-1885"]],
 :type "function",
 :full-name-encode "cljs.core_format",
 :source {:code "(defn format\n  [fmt & args]\n  (apply gstring/format fmt args))",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1771 1774]},
 :full-name "cljs.core/format",
 :clj-symbol "clojure.core/format",
 :docstring "Formats a string using goog.string.format.",
 :removed {:in "0.0-1885", :last-seen "0.0-1878"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_format.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_format.cljsdoc)
</pre>

