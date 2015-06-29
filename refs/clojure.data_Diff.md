## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.data/Diff

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/Diff</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/Diff)
</td>
</tr>
</table>





Source docstring:

```
Implementation detail. Subject to change.
```

Source code:

```clj
(defprotocol Diff
  "Implementation detail. Subject to change."
  (diff-similar [a b] "Implementation detail. Subject to change."))
```

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── clojure
            └── <ins>[data.cljs:79-81](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/clojure/data.cljs#L79-L81)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/Diff"]))
```

```clj
{:ns "clojure.data",
 :name "Diff",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "clojure.data_Diff",
 :source {:code "(defprotocol Diff\n  \"Implementation detail. Subject to change.\"\n  (diff-similar [a b] \"Implementation detail. Subject to change.\"))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/clojure/data.cljs",
          :lines [79 81]},
 :methods [{:name "diff-similar",
            :signature ["[a b]"],
            :docstring "Implementation detail. Subject to change."}],
 :full-name "clojure.data/Diff",
 :clj-symbol "clojure.data/Diff",
 :docstring "Implementation detail. Subject to change."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.data_Diff.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data_Diff.cljsdoc)
</pre>

