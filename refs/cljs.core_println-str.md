## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/println-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/println-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/println-str)
</td>
</tr>
</table>

 <samp>
(__println-str__ & objs)<br>
</samp>

---




Source docstring:

```
println to a string, returning it
```

Source code:

```clj
(defn println-str
  [& objs]
  (prn-str-with-opts objs (assoc (pr-opts) :readably false)))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8636-8639](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L8636-L8639)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/println-str"]))
```

```clj
{:ns "cljs.core",
 :name "println-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_println-str",
 :source {:code "(defn println-str\n  [& objs]\n  (prn-str-with-opts objs (assoc (pr-opts) :readably false)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8636 8639]},
 :full-name "cljs.core/println-str",
 :clj-symbol "clojure.core/println-str",
 :docstring "println to a string, returning it"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_println-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_println-str.cljsdoc)
</pre>

