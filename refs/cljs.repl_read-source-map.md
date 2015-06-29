## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/read-source-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-source-map__ f)<br>
</samp>

---




Source docstring:

```
Return the source map for the JavaScript source file.
```

Source code:

```clj
(defn read-source-map
  [f]
  (let [smf (io/file (str f ".map"))]
    (when (.exists smf)
      (sm/decode (json/read-str (slurp smf) :key-fn keyword)))))
```

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:199-204](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl.clj#L199-L204)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/read-source-map"]))
```

```clj
{:ns "cljs.repl",
 :name "read-source-map",
 :signature ["[f]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl_read-source-map",
 :source {:code "(defn read-source-map\n  [f]\n  (let [smf (io/file (str f \".map\"))]\n    (when (.exists smf)\n      (sm/decode (json/read-str (slurp smf) :key-fn keyword)))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/repl.clj",
          :lines [199 204]},
 :full-name "cljs.repl/read-source-map",
 :docstring "Return the source map for the JavaScript source file."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_read-source-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_read-source-map.cljsdoc)
</pre>

