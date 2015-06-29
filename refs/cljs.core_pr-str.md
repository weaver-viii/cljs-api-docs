## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr-str)
</td>
</tr>
</table>

 <samp>
(__pr-str__ & objs)<br>
</samp>

---




Source docstring:

```
pr to a string, returning it. Fundamental entrypoint to IPrintable.
```

Source code:

```clj
(defn pr-str
  [& objs]
  (pr-str-with-opts objs (pr-opts)))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6198-6201](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L6198-L6201)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-str"]))
```

```clj
{:ns "cljs.core",
 :name "pr-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr-str",
 :source {:code "(defn pr-str\n  [& objs]\n  (pr-str-with-opts objs (pr-opts)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6198 6201]},
 :full-name "cljs.core/pr-str",
 :clj-symbol "clojure.core/pr-str",
 :docstring "pr to a string, returning it. Fundamental entrypoint to IPrintable."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-str.cljsdoc)
</pre>

