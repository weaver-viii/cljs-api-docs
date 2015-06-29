## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/delay?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay?)
</td>
</tr>
</table>

 <samp>
(__delay?__ x)<br>
</samp>

---




Source docstring:

```
returns true if x is a Delay created with delay
```

Source code:

```clj
(defn ^boolean delay?
  [x] (instance? Delay x))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8531-8533](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L8531-L8533)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/delay?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "delay?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_delayQMARK",
 :source {:code "(defn ^boolean delay?\n  [x] (instance? Delay x))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8531 8533]},
 :full-name "cljs.core/delay?",
 :clj-symbol "clojure.core/delay?",
 :docstring "returns true if x is a Delay created with delay"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_delayQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_delayQMARK.cljsdoc)
</pre>

