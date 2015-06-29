## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/special-symbol?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1803"><img valign="middle" alt="[+] 0.0-1803" src="https://img.shields.io/badge/+-0.0--1803-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/special-symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/special-symbol?)
</td>
</tr>
</table>

 <samp>
(__special-symbol?__ x)<br>
</samp>

---





Source code:

```clj
(defn ^boolean special-symbol? [x]
  (contains?
    '#{if def fn* do let* loop* letfn* throw try*
       recur new set! ns deftype* defrecord* . js* & quote}
    x))
```

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7472-7476](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L7472-L7476)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/special-symbol?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "special-symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-1803"]],
 :type "function",
 :full-name-encode "cljs.core_special-symbolQMARK",
 :source {:code "(defn ^boolean special-symbol? [x]\n  (contains?\n    '#{if def fn* do let* loop* letfn* throw try*\n       recur new set! ns deftype* defrecord* . js* & quote}\n    x))",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7472 7476]},
 :full-name "cljs.core/special-symbol?",
 :clj-symbol "clojure.core/special-symbol?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_special-symbolQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_special-symbolQMARK.cljsdoc)
</pre>

