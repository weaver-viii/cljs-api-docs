## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/println

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/println</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/println)
</td>
</tr>
</table>

 <samp>
(__println__ & objs)<br>
</samp>

---




Source docstring:

```
Same as print followed by (newline)
```

Source code:

```clj
(defn println
  [& objs]
  (pr-with-opts objs (assoc (pr-opts) :readably false))
  (when *print-newline*
    (newline (pr-opts))))
```

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8617-8622](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L8617-L8622)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/println"]))
```

```clj
{:ns "cljs.core",
 :name "println",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_println",
 :source {:code "(defn println\n  [& objs]\n  (pr-with-opts objs (assoc (pr-opts) :readably false))\n  (when *print-newline*\n    (newline (pr-opts))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8617 8622]},
 :full-name "cljs.core/println",
 :clj-symbol "clojure.core/println",
 :docstring "Same as print followed by (newline)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_println.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_println.cljsdoc)
</pre>

