## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-subtract-int

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-subtract-int__ & xs)<br>
</samp>

---





Source code:

```clj
(defmacro ^::ana/numeric unchecked-subtract-int
  ([& xs] `(- ~@xs)))
```

 <pre>
clojurescript @ r2261
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:425-426](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/core.clj#L425-L426)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-subtract-int"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-subtract-int",
 :signature ["[& xs]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core_unchecked-subtract-int",
 :source {:code "(defmacro ^::ana/numeric unchecked-subtract-int\n  ([& xs] `(- ~@xs)))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/clj/cljs/core.clj",
          :lines [425 426]},
 :full-name "cljs.core/unchecked-subtract-int",
 :clj-symbol "clojure.core/unchecked-subtract-int"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-subtract-int.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-subtract-int.cljsdoc)
</pre>

