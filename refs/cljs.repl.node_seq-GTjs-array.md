## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/seq->js-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__seq->js-array__ v)<br>
</samp>

---





Source code:

```clj
(defn seq->js-array [v]
  (str "[" (apply str (interpose ", " (map pr-str v))) "]"))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:75-76](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/repl/node.clj#L75-L76)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/seq->js-array"]))
```

```clj
{:ns "cljs.repl.node",
 :name "seq->js-array",
 :type "function",
 :signature ["[v]"],
 :source {:code "(defn seq->js-array [v]\n  (str \"[\" (apply str (interpose \", \" (map pr-str v))) \"]\"))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [75 76]},
 :full-name "cljs.repl.node/seq->js-array",
 :full-name-encode "cljs.repl.node_seq-GTjs-array",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_seq-GTjs-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_seq-GTjs-array.cljsdoc)
</pre>

