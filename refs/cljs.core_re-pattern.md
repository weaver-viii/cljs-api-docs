## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-pattern

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-pattern</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-pattern)
</td>
</tr>
</table>

 <samp>
(__re-pattern__ s)<br>
</samp>

---

Returns an instance of RegExp which has compiled the provided string.

---



Source docstring:

```
Returns an instance of RegExp which has compiled the provided string.
```

Source code:

```clj
(defn re-pattern
  [s]
  (if (instance? js/RegExp s)
    s
    (let [[_ flags pattern] (re-find #"^(?:\(\?([idmsux]*)\))?(.*)" s)]
      (js/RegExp. pattern flags))))
```

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8096-8102](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L8096-L8102)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-pattern"]))
```

```clj
{:description "Returns an instance of RegExp which has compiled the provided string.",
 :ns "cljs.core",
 :name "re-pattern",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-pattern",
 :source {:code "(defn re-pattern\n  [s]\n  (if (instance? js/RegExp s)\n    s\n    (let [[_ flags pattern] (re-find #\"^(?:\\(\\?([idmsux]*)\\))?(.*)\" s)]\n      (js/RegExp. pattern flags))))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8096 8102]},
 :full-name "cljs.core/re-pattern",
 :clj-symbol "clojure.core/re-pattern",
 :docstring "Returns an instance of RegExp which has compiled the provided string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_re-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_re-pattern.cljsdoc)
</pre>

