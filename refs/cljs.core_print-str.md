## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/print-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print-str)
</td>
</tr>
</table>

 <samp>
(__print-str__ & objs)<br>
</samp>

---




Source docstring:

```
print to a string, returning it
```

Source code:

```clj
(defn print-str
  [& objs]
  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8635-8638](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L8635-L8638)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print-str"]))
```

```clj
{:ns "cljs.core",
 :name "print-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_print-str",
 :source {:code "(defn print-str\n  [& objs]\n  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8635 8638]},
 :full-name "cljs.core/print-str",
 :clj-symbol "clojure.core/print-str",
 :docstring "print to a string, returning it"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_print-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_print-str.cljsdoc)
</pre>

