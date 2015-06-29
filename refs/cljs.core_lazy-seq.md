## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/lazy-seq

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/lazy-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/lazy-seq)
</td>
</tr>
</table>

 <samp>
(__lazy-seq__ & body)<br>
</samp>

---

Returns a new lazy sequence.

---


See Also:

[`cljs.core/lazy-cat`](cljs.core_lazy-cat.md)<br>
[`cljs.core/realized?`](cljs.core_realizedQMARK.md)<br>
[`cljs.core/doall`](cljs.core_doall.md)<br>
[`cljs.core/iterate`](cljs.core_iterate.md)<br>

---


Source code:

```clj
(defmacro lazy-seq [& body]
  `(new cljs.core/LazySeq nil false (fn [] ~@body) nil))
```

 <pre>
clojurescript @ r1586
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:748-749](https://github.com/clojure/clojurescript/blob/r1586/src/clj/cljs/core.clj#L748-L749)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/lazy-seq"]))
```

```clj
{:description "Returns a new lazy sequence.",
 :ns "cljs.core",
 :name "lazy-seq",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/lazy-cat"
           "cljs.core/realized?"
           "cljs.core/doall"
           "cljs.core/iterate"],
 :full-name-encode "cljs.core_lazy-seq",
 :source {:code "(defmacro lazy-seq [& body]\n  `(new cljs.core/LazySeq nil false (fn [] ~@body) nil))",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/clj/cljs/core.clj",
          :lines [748 749]},
 :full-name "cljs.core/lazy-seq",
 :clj-symbol "clojure.core/lazy-seq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_lazy-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_lazy-seq.cljsdoc)
</pre>

