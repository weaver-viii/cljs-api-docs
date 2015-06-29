## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/print-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__print-map__ m print-one writer opts)<br>
</samp>

---





Source code:

```clj
(defn print-map [m print-one writer opts]
  (pr-sequential-writer
    writer
    (fn [e w opts]
      (do (print-one (key e) w opts)
          (-write w \space)
          (print-one (val e) w opts)))
    "{" ", " "}"
    opts (seq m)))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7291-7299](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L7291-L7299)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print-map"]))
```

```clj
{:ns "cljs.core",
 :name "print-map",
 :type "function",
 :signature ["[m print-one writer opts]"],
 :source {:code "(defn print-map [m print-one writer opts]\n  (pr-sequential-writer\n    writer\n    (fn [e w opts]\n      (do (print-one (key e) w opts)\n          (-write w \\space)\n          (print-one (val e) w opts)))\n    \"{\" \", \" \"}\"\n    opts (seq m)))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7291 7299]},
 :full-name "cljs.core/print-map",
 :full-name-encode "cljs.core_print-map",
 :history [["+" "0.0-2120"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_print-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_print-map.cljsdoc)
</pre>

