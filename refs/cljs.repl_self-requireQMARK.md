## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/self-require?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__self-require?__ specs)<br>
</samp>

---





Source code:

```clj
(defn self-require? [specs]
  (some
    (fn [quoted-spec-or-kw]
      (and (not (keyword? quoted-spec-or-kw))
           (let [spec (second quoted-spec-or-kw)
                 ns (if (sequential? spec)
                      (first spec)
                      spec)]
             (= ns ana/*cljs-ns*))))
    specs))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:518-527](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/repl.clj#L518-L527)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/self-require?"]))
```

```clj
{:ns "cljs.repl",
 :name "self-require?",
 :type "function",
 :signature ["[specs]"],
 :source {:code "(defn self-require? [specs]\n  (some\n    (fn [quoted-spec-or-kw]\n      (and (not (keyword? quoted-spec-or-kw))\n           (let [spec (second quoted-spec-or-kw)\n                 ns (if (sequential? spec)\n                      (first spec)\n                      spec)]\n             (= ns ana/*cljs-ns*))))\n    specs))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/repl.clj",
          :lines [518 527]},
 :full-name "cljs.repl/self-require?",
 :full-name-encode "cljs.repl_self-requireQMARK",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_self-requireQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_self-requireQMARK.cljsdoc)
</pre>

