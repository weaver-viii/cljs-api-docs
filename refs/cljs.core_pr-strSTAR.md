## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1806"><img valign="middle" alt="[+] 0.0-1806" src="https://img.shields.io/badge/+-0.0--1806-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-str\*__ obj)<br>
</samp>

---




Source docstring:

```
Support so that collections can implement toString without
loading all the printing machinery.
```

Source code:

```clj
(defn pr-str*
  [^not-native obj]
  (let [sb (StringBuffer.)
        writer (StringBufferWriter. sb)]
    (-pr-writer obj writer (pr-opts))
    (-flush writer)
    (str sb)))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:645-653](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L645-L653)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-str*"]))
```

```clj
{:ns "cljs.core",
 :name "pr-str*",
 :signature ["[obj]"],
 :history [["+" "0.0-1806"]],
 :type "function",
 :full-name-encode "cljs.core_pr-strSTAR",
 :source {:code "(defn pr-str*\n  [^not-native obj]\n  (let [sb (StringBuffer.)\n        writer (StringBufferWriter. sb)]\n    (-pr-writer obj writer (pr-opts))\n    (-flush writer)\n    (str sb)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [645 653]},
 :full-name "cljs.core/pr-str*",
 :docstring "Support so that collections can implement toString without\nloading all the printing machinery."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-strSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-strSTAR.cljsdoc)
</pre>

