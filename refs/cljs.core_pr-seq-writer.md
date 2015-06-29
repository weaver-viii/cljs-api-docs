## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-seq-writer

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-seq-writer__ objs writer opts)<br>
</samp>

---





Source code:

```clj
(defn pr-seq-writer [objs writer opts]
  (pr-writer (first objs) writer opts)
  (doseq [obj (next objs)]
    (-write writer " ")
    (pr-writer obj writer opts)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8569-8573](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L8569-L8573)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-seq-writer"]))
```

```clj
{:ns "cljs.core",
 :name "pr-seq-writer",
 :type "function",
 :signature ["[objs writer opts]"],
 :source {:code "(defn pr-seq-writer [objs writer opts]\n  (pr-writer (first objs) writer opts)\n  (doseq [obj (next objs)]\n    (-write writer \" \")\n    (pr-writer obj writer opts)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8569 8573]},
 :full-name "cljs.core/pr-seq-writer",
 :full-name-encode "cljs.core_pr-seq-writer",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-seq-writer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-seq-writer.cljsdoc)
</pre>

